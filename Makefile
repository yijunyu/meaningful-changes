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
results+=$(source:source/v/%=result/verilog/%)
results+=$(source:source/v/%=result/verilog2/%)
example+=$(results)
target+=$(bin)/normc $(bin)/api_clone_javac $(program) $(results)
package=${HOME}/Documents/demo/mct/mct-$(shell uname).tar.gz
package=/home/share/sead/mct/mct-$(shell uname).tar.gz
#==== R U L E S ====
.PHONEY: all clean install
all: $(target)
	@if [ -f error.log ]; then cat error.log; fi

define example
result/$(1)/%.$(1): $(bin)/$(1)c source/$(1)/%.$(1)
	@mkdir -p result/$(1)
	$$^ -o $$@
	if [ -e test/$(1)/$$*.$(1) ]; then diff $$@ test/$(1)/$$*.$(1); fi
endef

$(foreach ext,$(extensions),$(eval $(call example,$(ext))))

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

$(bin)/%c: Txl/%.Txl
	$(txlc) Txl/$*.Txl 
	mv $*.x $@

$(bin)/%cc: Txl/%.Txl
	$(txlc) -d COMMENTS Txl/$*.Txl 
	mv $*.x $@

# normalise 
Txl/%.Txl: $(bin)/normc source/norm/%.norm
	/usr/bin/time $^ -o t.t
	sed -e 's/\/\*//' t.t | sed -e 's/*\//\/* *\//g' > $@
	rm -f t.t

install: $(package) 
$(package): README.html $(program) $(norm) $(source) $(target) cvs result/*.txt
	rm -rf $(dir $(package))
	mkdir -p  $(dir $(package))
	tar cfz $@ $^
	tar xfz $@ -C $(dir $(package))

source/norm/java.norm : Txl/java.grm Txl/javaCommentOverridesNorm.grm
	touch -f $@
source/norm/problem.norm : Txl/problem.grm
	touch -f $@

clean:
	rm -rf ${target} $(generated_language)
	rm -rf result
	git clean -X -f
