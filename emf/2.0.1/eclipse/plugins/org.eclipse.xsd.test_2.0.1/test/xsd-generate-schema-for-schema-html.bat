@echo off
echo Results will be saved to SchemaForSchema.html
xsd-generate-html SampleMarkup.xml ../../org.eclipse.xsd_2.0.1/cache/www.w3.org/2001/XMLSchema.xsd  2>&1 > SchemaForSchema.html

