<?xml version="1.0"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

 <xsl:import href="copyover.xsl"/>

 <xsl:param name="stylebook.project"/>
 <xsl:param name="copyright"/>
 <xsl:param name="id"/>

<!-- ====================================================================== -->
<!-- document section -->
<!-- ====================================================================== -->

 <xsl:template match="/">
  <!-- checks if this is the included document to avoid neverending loop -->
  <xsl:if test="not(book)">
    <html>
      <head>
        <title><xsl:value-of select="document/header/title"/></title>
        <link rel="stylesheet" type="text/css" href="resources/simple.css" title="Simple Style"/>
      </head>
      <body>
        <table border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="100%">
              <p class="title"><strong><xsl:value-of select="document/header/title"/></strong><br/>
              <em><xsl:value-of select="document/header/subtitle"/></em></p>
            </td>
            <td valign="top"><center><img src="resources/jesktop-banner.jpg"/><br/><img src="resources/TheJavaDesktop.jpg"/></center></td>
          </tr>
        </table>
        <xsl:if test="document/header/authors">
          <p class="author">
            by
            <xsl:for-each select="document/header/authors/person">
              <a href="mailto:{@email}"><xsl:value-of select="@name"/></a>
              <xsl:if test="not(position()=last())">, </xsl:if>
            </xsl:for-each>
          </p>
        </xsl:if>
        <table border="1" cellspacing="0">
          <tr>
            <td valign="top" width="20%" bgcolor="#f0f0f0">
              <xsl:apply-templates select="document($stylebook.project)"/>
            </td>
            <td valign="top" width="80%">
              <xsl:apply-templates/>
            </td>
          </tr>
        </table>
        <xsl:apply-templates select="document/footer/legal" mode="footer"/>
      </body>
    </html>
   </xsl:if>

   <xsl:if test="book">
    <xsl:apply-templates/>
   </xsl:if>
  </xsl:template>

  <xsl:template match="footer" mode="footer">
    <xsl:apply-templates/>
  </xsl:template>

  <xsl:template match="legal" mode="footer">
    <p class="legal">
      <xsl:apply-templates/>
      <br/>
      <center>        
        <table>
          <tr>
            <td>
              Hosting provided by : 
              <a href="http://sourceforge.net">
                <img src="http://sourceforge.net/sflogo.php?group_id=43962&amp;type=1" width="88" height="31" border="0" alt="SourceForge Logo"/> 
              </a>   
            </td>
            <td>
              <a href="http://sourceforge.net/projects/jesktop"> Jesktop API SourceForge project page</a>            
            </td>
          </tr>
        </table>
      </center> 
    </p>
  </xsl:template>

<!-- ====================================================================== -->
<!-- book section -->
<!-- ====================================================================== -->

  <xsl:template match="book">
    <div class="book">
        <xsl:apply-templates/>
    </div>
  </xsl:template>

  <xsl:template match="page|faqs|changes|todo|spec">
    <xsl:if test="@id=$id">
      <xsl:value-of select="@label"/>
    </xsl:if>
    <xsl:if test="@id!=$id">
      <a href="{@id}.html"><xsl:value-of select="@label"/></a>
    </xsl:if>
    <br/>
  </xsl:template>

  <xsl:template match="external">
    <a href="{@href}"><xsl:value-of select="@label"/></a><br/>
  </xsl:template>

  <xsl:template match="separator">
    <hr/>
  </xsl:template>

<!-- ====================================================================== -->
<!-- header section -->
<!-- ====================================================================== -->

 <xsl:template match="header">
  <!-- ignore on general document -->
 </xsl:template>

<!-- ====================================================================== -->
<!-- body section -->
<!-- ====================================================================== -->

  <xsl:template match="s1">
   <h1><xsl:value-of select="@title"/></h1>
	<div class="s1"><xsl:apply-templates/></div>
  </xsl:template>

  <xsl:template match="s2">
   <h2><xsl:value-of select="@title"/></h2>
	<div class="s2"><xsl:apply-templates/></div>
  </xsl:template>

  <xsl:template match="s3">
   <h3><xsl:value-of select="@title"/></h3>
	<div class="s3"><xsl:apply-templates/></div>
  </xsl:template>

  <xsl:template match="s4">
   <h4><xsl:value-of select="@title"/></h4>
	<div class="s4"><xsl:apply-templates/></div>
  </xsl:template>

<!-- ====================================================================== -->
<!-- footer section -->
<!-- ====================================================================== -->

 <xsl:template match="footer">
  <!-- ignore on general documents -->
 </xsl:template>

<!-- ====================================================================== -->
<!-- paragraph section -->
<!-- ====================================================================== -->

  <xsl:template match="note">
   <p class="note"><xsl:apply-templates/></p>
  </xsl:template>

  <xsl:template match="source">
   <pre><xsl:apply-templates/></pre>
  </xsl:template>

  <xsl:template match="fixme">
   <!-- ignore on documentation -->
  </xsl:template>

<!-- ====================================================================== -->
<!-- list section -->
<!-- ====================================================================== -->

 <xsl:template match="sl">
  <ul>
   <xsl:apply-templates/>
  </ul>
 </xsl:template>

 <xsl:template match="dt">
  <li>
   <strong><xsl:value-of select="."/></strong>
   <xsl:text> - </xsl:text>
   <xsl:value-of select="following::dd"/>
  </li>
 </xsl:template>

 <xsl:template match="dd">
  <!-- ignore since already used -->
 </xsl:template>

<!-- ====================================================================== -->
<!-- table section -->
<!-- ====================================================================== -->

<!-- since we cloned the XHTML model, we don't need any futher styling      -->

<!-- ====================================================================== -->
<!-- markup section -->
<!-- ====================================================================== -->

<!-- since we cloned the XHTML model, we don't need any futher styling      -->

<!-- ====================================================================== -->
<!-- images section -->
<!-- ====================================================================== -->

 <xsl:template match="figure|img|icon">
  <img src="{@src}" alt="{@alt}" class="{name(.)}"/>
 </xsl:template>

<!-- ====================================================================== -->
<!-- links section -->
<!-- ====================================================================== -->

 <xsl:template match="link">
   <a href="{@href}"><xsl:apply-templates/></a>
 </xsl:template>

 <xsl:template match="connect">
  <xsl:apply-templates/>
 </xsl:template>

 <xsl:template match="jump">
   <a href="{@href}#{@anchor}"><xsl:apply-templates/></a>
 </xsl:template>

 <xsl:template match="fork">
   <a href="{@href}" target="_blank"><xsl:apply-templates/></a>
 </xsl:template>

 <xsl:template match="anchor">
   <a name="{@id}"><xsl:comment>anchor</xsl:comment></a>
 </xsl:template>

</xsl:stylesheet>
