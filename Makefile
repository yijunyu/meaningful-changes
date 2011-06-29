#==== P R O G R A M S ====
bin=bin.$(shell uname -s -m | sed 's/ /_/')
txl=$(bin)/txl
txlc=$(bin)/txlc
#==== T A R G E T S ====
norm=$(wildcard source/norm/*/*.norm)
extensions+=$(norm:source/norm/%.norm=%)
languages+=$(wildcard Txl/*/*.Txl)
generated_language=$(norm:source/norm/%.norm=result/norm/%.Txl)
extensions+=$(languages:Txl/%.Txl=%)
program+=$(extensions:%=$(bin)/%c)
source+=$(foreach ext,$(extensions),$(wildcard source/*/$(ext)/*.$(ext)))
example+=$(source)
results+=$(generated_language) 
results+=$(source:source/%=result/%) 

tools+=simple
define diff_example_1
results+=result/Java/$(1)/HelloWorld--2.java result/Java/$(1)/HelloWorld-2-3.java
endef
$(foreach tool,$(tools),$(eval $(call diff_example_1,$(tool))))

example+=$(results)
target+=result/C/cid/vim73/eval.c
target+=$(bin)/normc 
target+=$(bin)/norm-include-c 
target+=$(bin)/norm-id-c 
target+=$(bin)/ProblemFrames/problemcc 
target+=$(bin)/Java/mdsdcc 
target+=$(bin)/Java/modelcc 
target+=$(bin)/Q7/q7c 
target+=$(bin)/Argument/argumentc 
target+=$(bin)/Verilog/verilog2c
target+=$(bin)/cc 
target+=$(program) $(results)
package=/home/share/sead/mct/mct-$(shell uname).tar.gz
package=${HOME}/Documents/demo/mct/mct-$(shell uname).tar.gz
#==== R U L E S ====
.PHONEY: all clean install
all: $(target)
	@if [ -f error.log ]; then cat error.log; fi

define example
result/$(1)/%.$(1): $(bin)/$(1)c source/$(1)/%.$(1)
	@mkdir -p result/$(1)
	$$^ -comment -o $$@
	if [ -e test/$(1)/$$*.$(1) ]; then diff $$@ test/$(1)/$$*.$(1); fi
endef

$(foreach ext,$(extensions),$(eval $(call example,$(ext))))

define diff_example_2
result/Java/$(1)/HelloWorld--2.java: $(bin)/Java/$(1)c source/Java/java/HelloWorld.java source/Java/java/HelloWorld-2.java 
	@mkdir -p result/Java/$(1)
	$(bin)/Java/$(1)c source/Java/java/HelloWorld.java -diff source/Java/java/HelloWorld-2.java -o $$@
	if [ -e test/Java/$(1)/HelloWorld--2.java ]; then diff $$@ test/Java/$(1)/HelloWorld--2.java; fi

result/Java/$(1)/HelloWorld-2-3.java: $(bin)/Java/$(1)c source/Java/java/HelloWorld-2.java source/Java/java/HelloWorld-3.java 
	@mkdir -p result/Java/$(1)
	$(bin)/Java/$(1)c source/Java/java/HelloWorld.java -diff source/Java/java/HelloWorld-2.java -o $$@
	if [ -e test/Java/$(1)/HelloWorld-2-3.java ]; then diff $$@ test/Java/$(1)/HelloWorld-2-3.java; fi
endef
$(foreach tool,$(tools),$(eval $(call diff_example_2,$(tool))))

Txl/norm.Txl: Txl/mct.grm Txl/mct-util.txl Txl/mct-kept.txl Txl/mct-ignored.txl Txl/mct-preferred.txl Txl/mct-ordered.txl Txl/redefine2define.txl Txl/include_all.txl Txl/mct-meta.txl
	touch Txl/norm.Txl

result/C/cid/vim73/eval.c: source/C/vim73/eval.c
	mkdir -p $$(dirname $@)
	grep -v "^#" $< > eval.c
	$(bin)/C/cidc eval.c | sort | uniq > $@
	rm -f eval.c

result/v/%.v: $(bin)/vc source/v/%.v
	@mkdir -p result/v
	sed "s/'/?/g" source/v/$*.v > result/v/$*.v.tmp
	$(bin)/vc result/v/$*.v.tmp -o $@
	rm -f result/v/$*.v.tmp
	if [ -e test/v/$*.v ]; then diff $@ test/v/$*.v; fi

result/verilog2/%.v: $(bin)/verilog2c source/v/%.v
	@mkdir -p result/verilog2
	$(bin)/verilog2c result/v/$*.v -o $@
	if [ -e test/verilog2/$*.v ]; then diff $@ test/verilog2/$*.v; fi

$(bin)/%c: Txl/%.Txl Makefile
	mkdir -p $$(dirname $@)
	if [ "$$(basename Txl/$*.Txl)" != "$*.Txl" ]; then cp Txl/$*.Txl Txl/$$(basename Txl/$*.Txl); fi
	$(txlc) -d DEFINE Txl/$$(basename Txl/$*.Txl)
	mv $$(basename $*.x) $@
	rm -f Txl/$$(basename Txl/$*.Txl)

$(bin)/%cc: Txl/%.Txl Makefile
	mkdir -p $$(dirname $@)
	cp Txl/$*.Txl Txl/$$(basename Txl/$*.Txl)
	$(txlc) -comment -d DEFINE -d COMMENTS Txl/$$(basename Txl/$*.Txl)
	mv $$(basename $*.x) $@
	rm -f Txl/$$(basename Txl/$*.Txl)

$(bin)/normc: Txl/norm.Txl Makefile
	$(txlc) -d DEFINE Txl/norm.Txl
	mv norm.x $@

$(bin)/%c: result/norm/%.Txl Makefile
	mkdir -p $$(dirname $@)
	cp result/norm/$*.Txl id.Txl
	$(txlc) -i Txl id.Txl
	mv id.x $@
	rm id.Txl

$(bin)/norm-include-c: Txl/norm.Txl Makefile
	$(txlc) Txl/norm.Txl
	mv norm.x $@

$(bin)/norm-id-c: Txl/norm.Txl Makefile
	$(txlc) -d ID Txl/norm.Txl
	mv norm.x $@

$(bin)/norm-no_clone-include-c: Txl/norm.Txl Makefile
	$(txlc) -d NO_CLONE Txl/norm.Txl
	mv norm.x $@

# default normalisation transformation
result/norm/%.Txl: $(bin)/normc source/norm/%.norm
	mkdir -p $$(dirname $@)
	/usr/bin/time $(bin)/normc -iTxl source/norm/$*.norm -o $TMPFILE
	TMPFILE=$$(mktemp /tmp/norm.XXXXXXXXXX) || exit 1
	echo $$TMPFILE
	sed -e 's/\/\*//' $TMPFILE | sed -e 's/*\//\/* *\//g' > $@
	rm -f $TMPFILE

$(bin)/%cc: result/norm/%.Txl Makefile
	mkdir -p $$(dirname $@)
	cp result/norm/$*.Txl comment.Txl
	$(txlc) -comment -d COMMENTS comment.Txl
	mv comment.x $@
	rm -f comment.Txl

# if the grammar does not handle comments, don't use -comment -d COMMENTS options yet
$(bin)/vc: Txl/v.Txl Makefile
	$(txlc) Txl/v.Txl
	mv v.x $@

$(bin)/xtextc: Txl/xtext.Txl Makefile
	$(txlc) Txl/xtext.Txl
	mv xtext.x $@

$(bin)/cc: Txl/C/c.Txl Makefile
	mkdir -p $$(dirname $@)
	cp Txl/C/c.Txl Txl/c.Txl
	$(txlc) Txl/c.Txl
	mv c.x $@
	rm -f Txl/c.Txl

result/norm/Verilog/verilog2.Txl: $(bin)/norm-include-c source/norm/Verilog/verilog2.norm
	mkdir -p $$(dirname $@)
	/usr/bin/time $^ -o $@
	TMPFILE=$$(mktemp /tmp/norm.XXXXXXXXXX) || exit 1
	echo $$TMPFILE
	/usr/bin/time $^ -o $TMPFILE
	sed -e 's/\/\*//' $TMPFILE | sed -e 's/*\//\/* *\//g' > $@
	rm -f $TMPFILE

result/norm/XML/xml-mct.Txl: $(bin)/norm-no_clone-include-c source/norm/XML/xml-mct.norm
	mkdir -p $$(dirname $@)
	/usr/bin/time $^ -o $@
	TMPFILE=$$(mktemp /tmp/norm.XXXXXXXXXX) || exit 1
	echo $$TMPFILE
	/usr/bin/time $^ -o $TMPFILE
	sed -e 's/\/\*//' $TMPFILE | sed -e 's/*\//\/* *\//g' > $@
	rm -f $TMPFILE

result/norm/C/cid.Txl: $(bin)/norm-id-c source/norm/C/cid.norm
	mkdir -p $$(dirname $@)
	/usr/bin/time $(bin)/norm-id-c -iTxl source/norm/C/cid.norm -o $@
	TMPFILE=$$(mktemp /tmp/norm.XXXXXXXXXX) || exit 1
	echo $$TMPFILE
	/usr/bin/time $^ -o $TMPFILE
	sed -e 's/\/\*//' $TMPFILE | sed -e 's/*\//\/* *\//g' > $@
	rm -f $TMPFILE

install: $(package) 
$(package): README.html $(program) $(norm) $(source) $(target) scripts # cvs
	rm -rf $(dir $(package))
	mkdir -p  $(dir $(package))
	tar cfz $@ $^ result/*.txt $(results)
	tar xfz $@ -C $(dir $(package))

source/norm/java.norm : Txl/java.grm Txl/javaCommentOverridesNorm.grm
	touch -f $@

clean:
	rm -rf ${target} $(generated_language)
#	git clean -X -f
