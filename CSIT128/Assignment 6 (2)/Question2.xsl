<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/RecordList">

<html>

<body>
	<font size = "8">
	<h5>Patron Record: <xsl:value-of select="@name"/> </h5>
	</font>

	<xsl:for-each select="Record"><br/>
	<xsl:value-of select="title" /><br/>
	<xsl:value-of select="author" /><br/>
	<xsl:value-of select="Number" /><br/>
	<xsl:value-of select="date" /><br/>
	<xsl:value-of select="overDue" /><br/>
	</xsl:for-each>

</body>

</html>

</xsl:template>

</xsl:stylesheet>