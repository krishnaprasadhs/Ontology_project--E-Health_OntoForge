<%-- 
    Document   : datacsv
    Created on : Mar 8, 2021, 11:46:01 AM
    Author     : WINDOWS 10
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Qrcode Based Airport System</title>
		<link href="screen.css" rel="stylesheet" type="text/css" media="screen" />
<!--[if IE 6]>
	<script type="text/javascript" src="unitpngfix.js"></script>
<![endif]--> <script type="text/javascript" src="js/datetimepicker_css.js"></script>
		<script type="text/javascript" src="js/general.js"></script>

        <style type="text/css">
<!--
.style1 {color: #FFFFFF}
.style2 {
	color: #993300;
	font-weight: bold;
}
.style3 {color: #990000; font-weight: bold; }
.style4 {color: #FF0000}
.style8 {font-size: 10px; }
.style9 {font-size: 12px; }
-->
        </style>
</head>
    <body bgcolor="#993333">
         <form action="csvdata" method="post"><%
   String ok=(String)request.getAttribute("ok");
   String msg="";
 
    if(ok!=null)
   {
   msg=(String)request.getAttribute("msg");

     }
    %><table width="1052" border="0" align="center" bgcolor="#FFFFFF">
  <tr>
    <td width="1046" height="206"><table width="1157" border="0">
  <tr>
   <td width="1151"><img src="image/banner.jpg" width="1150" height="406"/></td>
  </tr>
 
</table></td>
  </tr>
  <tr>
    <td><table width="1095" border="0" bgcolor="#663300">
      <tr>
        <td width="149" height="31"><div align="center"><a href="admin.jsp" class="style1">HOME</a></div></td>


		 <td width="188"><div align="center"><a href="datacsv.jsp" class="style1">DATA CSV </a></div></td>
		 <td width="188"><div align="center"><a href="datatsv.jsp" class="style1">DATA TSV </a><a href="datatsv.jsp" class="style1"></a></div></td>
		  <td width="188"><div align="center"><a href="integrate.jsp" class="style1">ONTOLOGY</a><a href="datatsv.jsp" class="style1"></a></div></td>
        <td width="181"><div align="center"><a href="login.jsp" class="style1">LOGOUT</a></div></td>
        
		 
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="263"><p class="style2">&nbsp;</p>
      <p class="style3">&nbsp;</p>
      <table width="504" border="1" bordercolor="#CC6600" align="center">
      <tr>
        <td width="494" height="41" align="center"  bgcolor="#CC6600"><span class="style8 style1"><strong>DATA CSV </strong></span></td>
      </tr>
      <tr>
        <td height="135"><table width="478" border="0" align="center">
          <tr>
            <td width="127" height="36">FileUpload  <span class="style4">*</span> </td>
            <td width="7">&nbsp;</td>
            <td width="330"><label>
              <input type="file" name="a1" size="30px;">
            </label></td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td><label>
              <input type="submit" name="s1" value="Submit" style="background-color:#993300; border-bottom-color:#993333;">&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="s2" value="View" style="background-color:#993300; border-bottom-color:#993333; ">&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="s3" value="Cancel" style="background-color:#993300; border-bottom-color:#993333; ">
            </label></td>
          </tr>
        </table></td>
      </tr>
    </table>
      <p align="center"><%=msg%></p>
      <table width="1091" border="0">
        <tr>
          <td width="1081"><table width="1087" border="0" bgcolor="#CC6600">
            <tr>
              <td width="39"><div align="center" class="style9"> Patient id </div></td>
              <td width="39"><div align="center" class="style9"> Age range </div></td>
              <td width="39"><div align="center" class="style9"> Gender </div></td>
              <td width="39"><p align="center" class="style9"> Air Pollution </p></td>
              <td width="39"><div align="center" class="style9"> Alcoholuse </div></td>
              <td width="39"><div align="center" class="style9"> Dust Allergy </div></td>
              <td width="39"><div align="center" class="style9"> Occupational Hazards </div></td>
              <td width="39"><div align="center" class="style9"> Genetic Risk </div></td>
              <td width="39"><div align="center" class="style9"> chronic Lung Disease </div></td>
              <td width="39"><div align="center" class="style9"> Balanced Diet </div></td>
              <td width="39"><div align="center" class="style9"> Obesity </div></td>
              <td width="39"><div align="center" class="style9"> Smoking </div></td>
              <td width="39"><div align="center" class="style9"> Passive Smoker </div></td>
              <td width="39"><div align="center" class="style9"> Chest Pain </div></td>
              <td width="39"><div align="center" class="style9"> Coughing of Blood </div></td>
              <td width="39"><div align="center" class="style9"> Fatigue </div></td>
              <td width="39"><div align="center" class="style9"> Weight Loss </div></td>
              <td width="39"><p align="center" class="style9"> Shortness of Breath </p></td>
              <td width="39"><div align="center" class="style9"> Wheezing </div></td>
              <td width="39"><div align="center" class="style9"> Swallowing Difficulty </div></td>
              <td width="39"><p align="center" class="style9"> Clubbing of Finger_Nails </p></td>
              <td width="39"><div align="center" class="style9"> Frequent Cold </div></td>
              <td width="39"><p align="center" class="style9"> Dry Cough </p></td>
              <td width="42"><div align="center" class="style9"> Snoring </div></td>
			  <td width="42"><div align="center" class="style9"> Levels </div></td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td><table width="1170" border="0">    <% int index=0;
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
                
		ResultSet rs = st.executeQuery("select * from cancer order by pid asc");

    while(rs.next())
		{	
       		
	 %>
            <tr>
              <td width="37"><%=rs.getString(1)%></td>
              <td width="30"><%=rs.getString(2)%></td>
              <td width="36"><%=rs.getString(3)%></td>
              <td width="45"><%=rs.getString(4)%></td>
              <td width="59"><%=rs.getString(5)%></td>
              <td width="41"><%=rs.getString(6)%></td>
              <td width="64"><%=rs.getString(7)%></td>
              <td width="39"><%=rs.getString(8)%></td>
              <td width="37"><%=rs.getString(9)%></td>
              <td width="47"><%=rs.getString(10)%></td>
              <td width="47"><%=rs.getString(11)%></td>
              <td width="43"><%=rs.getString(12)%></td>
              <td width="37"><%=rs.getString(13)%></td>
              
              <td width="35"><%=rs.getString(14)%></td>
              <td width="40"><%=rs.getString(15)%></td>
              <td width="35"><%=rs.getString(16)%></td>
              <td width="46"><%=rs.getString(17)%></td>
              <td width="48"><%=rs.getString(18)%></td>
              <td width="56"><%=rs.getString(19)%></td>
              <td width="68"><%=rs.getString(20)%></td>
              <td width="43"><%=rs.getString(21)%></td>
              <td width="35"><%=rs.getString(22)%></td>
              <td width="38"><%=rs.getString(23)%></td>
			  <td width="66"><%=rs.getString(24)%></td>
			    <td width="66"><%=rs.getString(25)%></td>
            </tr> <%
 
                                     } 								
													
													}
	catch (Exception e) {
		out.println(e);
	}
	%>
          </table></td>
        </tr>
      </table>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p></td>
  </tr>
  <tr>
    <td height="21">&nbsp;</td>
  </tr>
</table>

	   </form>
    </body>
</html>

