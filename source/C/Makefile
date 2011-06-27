SRC=$(patsubst vim73/%,%,$(wildcard vim73/*.c))
all: $(SRC)
	echo $(SRC)

%.c: vim73/%.c
	gcc -E -Ivim73/src -Ivim73/src/proto $< | grep -v "^#" > t.c
	../../scripts/mct t.c > $@
	rm -f t.c
