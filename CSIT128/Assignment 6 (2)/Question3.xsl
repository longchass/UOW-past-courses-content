<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/recordList">

<html>
<style>
	table {border-collapse: collapse;}
	td    {padding: 7px;}

</style>
<body>

	<font size = "8">
	<h5>Patron Record: <xsl:value-of select="@name"/></h5><br/>
	</font>
	
	<table border="1" border-collapse="1">
		
		<tr>
			<td align="left">Title</td>
			<td align="left">Author</td>
			<td align="left">Call Number</td>
			<td align="left">Due</td>
			<td align="left">Overdue</td>
		</tr>
	
			<xsl:for-each select="record">
		<tr>
			<td width="180"><xsl:value-of select="title" /></td>
			<td width="180"><xsl:value-of select="author" /></td>
			<td width="100"><xsl:value-of select="Number" /></td>
			<td width="100"><xsl:value-of select="date" /></td>
			<td width="70"><xsl:value-of select="overDue" /></td>
		</tr>
			</xsl:for-each>
	</table>

</body>

</html>

</xsl:template>

</xsl:stylesheet>