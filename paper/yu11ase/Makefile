all: meaningful.pdf #meaningful.rtf

%.pdf: %.tex
	pdflatex --interaction=nonstopmode $<
	bibtex $*
	pdflatex --interaction=nonstopmode $<
	pdflatex --interaction=nonstopmode $<

%.rtf: %.tex
	latex2rtf -Z1 $*

clean:
	rm -f *.aux *.log *.bbl *.blg *~ *.pdf *.gz*
