all: meaningful.pdf

%.pdf: %.tex
	pdflatex --interaction=nonstopmode $<
	bibtex $*
	pdflatex --interaction=nonstopmode $<

clean:
	rm -f *.aux *.log *.bbl *.blg *~ *.pdf *.gz*
