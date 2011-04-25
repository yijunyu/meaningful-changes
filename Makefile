#==== P R O G R A M S ====
bin=bin.$(shell uname -s -m | sed -s 's/ /_/')
txl=$(bin)/txl
txlc=$(bin)/txlc
#==== T A R G E T S ====
norm=$(wildcard norm/*.norm)
extensions+=$(norm:norm/%.norm=%)
languages+=$(wildcard Txl/*.Txl)
generated_language=$(norm:norm/%.norm=Txl/%.Txl)
extensions+=$(languages:Txl/%.Txl=%)
program+=$(extensions:%=$(bin)/%c)
source+=$(foreach ext,$(extensions),$(wildcard $(ext)/*.$(ext)))
example+=$(source)
results+=$(source:%=result/%)
example+=$(results)
target+=$(bin)/normc $(program) $(results)
package=${HOME}/Documents/demo/mct/mct-$(shell uname).tar.gz
#==== R U L E S ====
.PHONEY: all clean install
all: $(target)
#	echo $(target)
	@if [ -f error.log ]; then cat error.log; fi

define example
result/$(1)/%.$(1): $(bin)/$(1)c $(1)/%.$(1)
	@mkdir -p result/$(1)
	$$^ -o $$@
endef
$(foreach ext,$(extensions),$(eval $(call example,$(ext))))

$(bin)/%c: Txl/%.Txl
	$(txlc) Txl/$*.Txl 
	mv $*.x $@

# normalise 
Txl/%.Txl: $(bin)/normc norm/%.norm
	$^ -o t.t
	sed -e 's/\/\*//' t.t | sed -e 's/*\//\/* *\//g' > $@
	rm -f t.t

install: $(package)
$(package): README $(program) $(norm) $(source) $(target)
	rm -rf $(dir $(package))
	mkdir -p  $(dir $(package))
	tar cfz $@ $^
	tar xfz $@ -C $(dir $(package))

norm/java.norm : Txl/java.grm Txl/javaCommentOverridesNorm.grm
	touch -f $@
norm/problem.norm : Txl/problem.grm
	touch -f $@

clean:
	rm -rf ${target} $(generated_language)
	rm -rf result
	git clean -X -f
