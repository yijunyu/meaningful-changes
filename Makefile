#==== P R O G R A M S ====
bin=bin.$(shell uname)
txl=$(bin)/txl
txlc=$(bin)/txlc
#==== T A R G E T S ====
grammars=$(wildcard grammar/*.grammar)
extensions=$(grammars:grammar/%.grammar=%)
program+=$(extensions:%=$(bin)/%c)
source+=$(foreach ext,$(extensions),$(wildcard $(ext)/*.$(ext)))
example+=$(source)
results+=$(source:%=result/%)
example+=$(results)
program+=$(bin)/java5c
target+=$(program) $(results)
#==== R U L E S ====
JUNK+=${target}

.PHONEY: all clean install
all: $(target)
	@if [ -f error.log ]; then cat error.log; fi
JUNK+=error.log

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
Txl/%.Txl: $(bin)/grammarc grammar/%.grammar
	$^ -o t.t
	sed -e 's/\/\*//' t.t | sed -e 's/*\//\/* *\//g' > $@
	rm -f t.t

install: mct.tar.gz
mct.tar.gz: README doc Makefile $(source) $(target)
	tar cfz $@ $^

clean:
	rm -rf ${target}
	rm -f *~ ${JUNK}
	rm -rf result
	git clean -X -f
