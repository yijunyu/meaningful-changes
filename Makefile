#==== P R O G R A M S ====
bin=bin.$(shell uname -s -m | sed 's/ /_/')
txl=$(bin)/txl
txlc=$(bin)/txlc
#==== T A R G E T S ====
norm=$(wildcard source/norm/*.norm)
extensions+=$(norm:source/norm/%.norm=%)
languages+=$(wildcard Txl/*.Txl)
generated_language=$(norm:source/norm/%.norm=Txl/%.Txl)
extensions+=$(languages:Txl/%.Txl=%)
program+=$(extensions:%=$(bin)/%c)
source+=$(foreach ext,$(extensions),$(wildcard source/$(ext)/*.$(ext)))
example+=$(source)
results+=$(source:source/%=result/%)
example+=$(results)
target+=$(bin)/normc $(bin)/norm-include-c $(bin)/api_clone_javac $(bin)/api_clone_javacc $(bin)/problemcc $(bin)/mdsdcc $(bin)/verilog2cc $(program) $(results)
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

Txl/api_clone_java.Txl: Txl/java.grm Txl/javaCommentOverrides.grm
Txl/mdsd.Txl: Txl/java.grm Txl/javaCommentOverrides.grm
Txl/norm.Txl: Txl/mct.grm Txl/mct-util.txl Txl/mct-kept.txl Txl/mct-ignored.txl Txl/mct-preferred.txl Txl/mct-ordered.txl Txl/redefine2define.txl Txl/include_all.txl
Txl/problem.Txl: Txl/problem.grm
Txl/xtext.Txl: Txl/xtext.grm

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
	$(txlc) -d DEFINE Txl/$*.Txl
	mv $*.x $@

$(bin)/%cc: Txl/%.Txl Makefile
	$(txlc) -comment -d COMMENTS Txl/$*.Txl
	mv $*.x $@

$(bin)/norm-include-c: Txl/norm.Txl Makefile
	$(txlc) Txl/norm.Txl
	mv norm.x $@

$(bin)/verilog2c: Txl/verilog2.Txl Makefile
	$(txlc) Txl/verilog2.Txl
	mv verilog2.x $@

$(bin)/problemc: Txl/problem.Txl Makefile
	$(txlc) Txl/problem.Txl
	mv problem.x $@

$(bin)/problemcc: Txl/problem.Txl Makefile
	$(txlc) -comment -d COMMENTS Txl/problem.Txl
	mv problem.x $@

# if the grammar does not handle comments, don't use -comment -d COMMENTS options yet
$(bin)/vc: Txl/v.Txl Makefile
	$(txlc) Txl/v.Txl
	mv v.x $@

$(bin)/xtextc: Txl/xtext.Txl Makefile
	$(txlc) Txl/xtext.Txl
	mv xtext.x $@

# normalise 
Txl/%.Txl: $(bin)/normc source/norm/%.norm
	/usr/bin/time $^ -o $@
	TMPFILE=$$(mktemp /tmp/norm.XXXXXXXXXX) || exit 1
	echo $$TMPFILE
	/usr/bin/time $^ -o $TMPFILE
	sed -e 's/\/\*//' $TMPFILE | sed -e 's/*\//\/* *\//g' > $@
	rm -f $TMPFILE

Txl/verilog2.Txl: $(bin)/norm-include-c source/norm/verilog2.norm
	/usr/bin/time $^ -o $@
	TMPFILE=$$(mktemp /tmp/norm.XXXXXXXXXX) || exit 1
	echo $$TMPFILE
	/usr/bin/time $^ -o $TMPFILE
	sed -e 's/\/\*//' $TMPFILE | sed -e 's/*\//\/* *\//g' > $@
	rm -f $TMPFILE

install: $(package) 
$(package): README.html $(program) $(norm) $(source) $(target) scripts # cvs
	rm -rf $(dir $(package))
	mkdir -p  $(dir $(package))
	tar cfz $@ $^ result/*.txt
	tar xfz $@ -C $(dir $(package))

source/norm/java.norm : Txl/java.grm Txl/javaCommentOverridesNorm.grm
	touch -f $@

clean:
	rm -rf ${target} $(generated_language)
#	git clean -X -f
