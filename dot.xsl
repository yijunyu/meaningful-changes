<?xml version="1.0"?>
<!DOCTYPE stylesheet [
    <!ENTITY xsl "http://www.w3.org/1999/XSL/Transform">
    <!ENTITY separator1 ":">
    <!ENTITY separator2 "&#10;">
    <!ENTITY separator3 ",">
]>
<xsl:stylesheet version="1.0" xmlns:xsl="&xsl;">
    <xsl:output method="text" indent="yes"/>
    <xsl:template match="/"><xsl:text>{&separator2;</xsl:text>
      <xsl:apply-templates> <xsl:with-param name="indent" select="1"/></xsl:apply-templates>
    <xsl:text>&separator2;}</xsl:text>
    </xsl:template>
    <xsl:template name="spaces"><xsl:param name="nb"/>               
            <xsl:if test="$nb &gt; 0"> <xsl:text>  </xsl:text>
                <xsl:call-template name="spaces">
                    <xsl:with-param name="nb" select="$nb - 1"/>
                </xsl:call-template>
            </xsl:if>
    </xsl:template>
    <xsl:template match="*"><xsl:param name="indent"/>
	<xsl:call-template name="spaces"><xsl:with-param name="nb" select="$indent"/> </xsl:call-template> 
        <xsl:value-of select="local-name()"/><xsl:text>&separator1;</xsl:text>
        <xsl:choose>
            <xsl:when test="count(child::*)=0">
                <xsl:text>&quot;</xsl:text><xsl:value-of select="."/><xsl:text>&quot;</xsl:text>
            </xsl:when>
            <xsl:otherwise>
		<xsl:text>{&separator2;</xsl:text>
                <xsl:for-each select="child::*"> 
                    <xsl:apply-templates select="."> <xsl:with-param name="indent" select="$indent + 1"/>
		    </xsl:apply-templates><xsl:if test="position()!=last()">&separator3;</xsl:if><xsl:text>&separator2;</xsl:text>
                </xsl:for-each>
		<xsl:call-template name="spaces"><xsl:with-param name="nb" select="$indent"/></xsl:call-template> 
                <xsl:text>}</xsl:text>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
</xsl:stylesheet>
