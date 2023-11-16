package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class datatsv_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Qrcode Based Airport System</title>\r\n");
      out.write("\t\t<link href=\"screen.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"unitpngfix.js\"></script>\r\n");
      out.write("<![endif]--> <script type=\"text/javascript\" src=\"js/datetimepicker_css.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/general.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {color: #FFFFFF}\r\n");
      out.write(".style2 {\r\n");
      out.write("\tcolor: #993300;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".style3 {color: #990000; font-weight: bold; }\r\n");
      out.write(".style4 {color: #FF0000}\r\n");
      out.write(".style8 {font-size: 10px; }\r\n");
      out.write(".style9 {font-size: 12px; }\r\n");
      out.write("-->\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("    <body bgcolor=\"#993333\">\r\n");
      out.write("         <form action=\"tsvdata\" method=\"post\">");

   String ok=(String)request.getAttribute("ok");
   String msg="";
 
    if(ok!=null)
   {
   msg=(String)request.getAttribute("msg");

     }
    
      out.write("<table width=\"1052\" border=\"0\" align=\"center\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"1046\" height=\"206\"><table width=\"1157\" border=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("   <td width=\"1151\"><img src=\"image/banner.jpg\" width=\"1150\" height=\"406\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" \r\n");
      out.write("</table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"1095\" border=\"0\" bgcolor=\"#663300\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"149\" height=\"31\"><div align=\"center\"><a href=\"admin.jsp\" class=\"style1\">HOME</a></div></td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t <td width=\"188\"><div align=\"center\"><a href=\"datacsv.jsp\" class=\"style1\">DATA CSV </a></div></td>\r\n");
      out.write("\t\t <td width=\"188\"><div align=\"center\"><a href=\"datatsv.jsp\" class=\"style1\">DATA TSV </a><a href=\"datatsv.jsp\" class=\"style1\"></a></div></td>\r\n");
      out.write("        <td width=\"181\"><div align=\"center\"><a href=\"login.jsp\" class=\"style1\">LOGOUT</a></div></td>\r\n");
      out.write("        \r\n");
      out.write("\t\t \r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"263\"><p class=\"style2\">&nbsp;</p>\r\n");
      out.write("      <p class=\"style3\">&nbsp;</p>\r\n");
      out.write("      <table width=\"504\" border=\"1\" bordercolor=\"#CC6600\" align=\"center\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"494\" height=\"41\" align=\"center\"  bgcolor=\"#CC6600\"><span class=\"style8 style1\"><strong>DATA CSV </strong></span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"135\"><table width=\"478\" border=\"0\" align=\"center\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"127\" height=\"36\">FileUpload  <span class=\"style4\">*</span> </td>\r\n");
      out.write("            <td width=\"7\">&nbsp;</td>\r\n");
      out.write("            <td width=\"330\"><label>\r\n");
      out.write("              <input type=\"file\" name=\"a1\" size=\"30px;\">\r\n");
      out.write("            </label></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td><label>\r\n");
      out.write("              <input type=\"submit\" name=\"s1\" value=\"Submit\" style=\"background-color:#993300; border-bottom-color:#993333;\">&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" name=\"s2\" value=\"View\" style=\"background-color:#993300; border-bottom-color:#993333; \">&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" name=\"s3\" value=\"Cancel\" style=\"background-color:#993300; border-bottom-color:#993333; \">\r\n");
      out.write("            </label></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("      <p align=\"center\">");
      out.print(msg);
      out.write("</p>\r\n");
      out.write("      <table width=\"1091\" border=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td width=\"1081\"><table width=\"1087\" border=\"0\" bgcolor=\"#CC6600\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"39\"><div align=\"center\" class=\"style9\"> Annotation ID</div></td>\r\n");
      out.write("              <td width=\"39\"><div align=\"center\" class=\"style9\"> Variant </div></td>\r\n");
      out.write("              <td width=\"39\"><div align=\"center\" class=\"style9\"> Gene </div></td>\r\n");
      out.write("              <td width=\"39\"><p align=\"center\" class=\"style9\"> Chemical </p></td>\r\n");
      out.write("              <td width=\"39\"><div align=\"center\" class=\"style9\"> PMID </div></td>\r\n");
      out.write("              <td width=\"39\"><div align=\"center\" class=\"style9\"> PhenotypeCategory </div></td>\r\n");
      out.write("              <td width=\"39\"><div align=\"center\" class=\"style9\"> Significance </div></td>\r\n");
      out.write("              <td width=\"39\"><div align=\"center\" class=\"style9\"> Notes </div></td>\r\n");
      out.write("              <td width=\"39\"><div align=\"center\" class=\"style9\"> Sentence </div></td>\r\n");
      out.write("              <td width=\"39\"><div align=\"center\" class=\"style9\"> StudyParameters </div></td>\r\n");
      out.write("        \r\n");
      out.write("            </tr>\r\n");
      out.write("          </table></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td><table width=\"1170\" border=\"0\">    ");
 int index=0;
	try
	{
	   
            String a11=null;
             	   HttpSession so = request.getSession(true);
 System.out.println(a11);

		int flag=0;
		String url="jdbc:mysql://localhost:3306/ontology";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,"root","root");
		Statement st=con.createStatement();
                Statement st1=con.createStatement();
                Statement st2=con.createStatement();
                Statement st3=con.createStatement();
                
		ResultSet rs = st.executeQuery("select * from data order by pid asc");

    while(rs.next())
		{	
       		
	 
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"37\">");
      out.print(rs.getString(1));
      out.write("</td>\r\n");
      out.write("              <td width=\"30\">");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("              <td width=\"36\">");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("              <td width=\"45\">");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("              <td width=\"59\">");
      out.print(rs.getString(5));
      out.write("</td>\r\n");
      out.write("              <td width=\"41\">");
      out.print(rs.getString(6));
      out.write("</td>\r\n");
      out.write("              <td width=\"64\">");
      out.print(rs.getString(7));
      out.write("</td>\r\n");
      out.write("              <td width=\"39\">");
      out.print(rs.getString(8));
      out.write("</td>\r\n");
      out.write("              <td width=\"37\">");
      out.print(rs.getString(9));
      out.write("</td>\r\n");
      out.write("              <td width=\"47\">");
      out.print(rs.getString(10));
      out.write("</td>\r\n");
      out.write("             \r\n");
      out.write("            </tr> ");

 
                                     } 								
													
													}
	catch (Exception e) {
		out.println(e);
	}
	
      out.write("\r\n");
      out.write("          </table></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"21\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t   </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
