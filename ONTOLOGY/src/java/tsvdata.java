/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author WINDOWS 10
 */
public class tsvdata extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       try{
             String a1="C:\\Users\\Jeffry\\Desktop\\dataset\\"+request.getParameter("a1");
       String s1=request.getParameter("s1");
                     int v=0,j=0;
                       String url = "jdbc:mysql://localhost:3306/ontology";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "root");
            PreparedStatement ps;
             Statement st = con.createStatement();
             if(s1!=null){
         v=st.executeUpdate("delete  from health");
         String sql = "INSERT INTO health VALUES (?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
		
		TsvParserSettings settings = new TsvParserSettings();
		
		settings.getFormat().setLineSeparator("\n");	
		
		TsvParser parser = new TsvParser(settings);		
		
		List<String[]> allRows = parser.parseAll(new FileInputStream(a1));
	   for (int i = 1; i <=allRows.size(); i++){	
	    	
	    	System.out.println(Arrays.asList(allRows.get(i)));
	    	System.out.println(allRows.get(i)[0].trim());
	    	System.out.println(allRows.get(i)[1].trim());
	    	System.out.println(allRows.get(i)[2].trim());
	    	System.out.println(allRows.get(i)[3].trim());
//	    	System.out.println(allRows.get(i)[4].trim());
//                System.out.println(allRows.get(i)[5].trim());
//	    	System.out.println(allRows.get(i)[6].trim());
//		System.out.println(allRows.get(i)[7].trim());
//                System.out.println(allRows.get(i)[8].trim());
//	    	System.out.println(allRows.get(i)[9].trim());
                  statement.setString(1, allRows.get(i)[0].trim());
                statement.setString(2, allRows.get(i)[1].trim());
                statement.setString(3, allRows.get(i)[2].trim());
                statement.setString(4, allRows.get(i)[3].trim());
//                statement.setString(5, allRows.get(i)[4].trim());
//                statement.setString(6, allRows.get(i)[5].trim());
//                statement.setString(7, allRows.get(i)[6].trim());
//                statement.setString(8, allRows.get(i)[7].trim());
//                statement.setString(9, allRows.get(i)[8].trim());
//                statement.setString(10, allRows.get(i)[9].trim());
               v=statement.executeUpdate(); 
              System.out.println(i);
             }
//          
           if((j==allRows.size()))  {

                    request.setAttribute("ok", "1");
                    request.setAttribute("msg", "Added  Successfully");
                    RequestDispatcher requestdispatcher = request.getRequestDispatcher("datatsv.jsp");
                    requestdispatcher.forward(request, response);
                }else{

                    request.setAttribute("ok", "1");
                    request.setAttribute("msg", "Adding data Failed");
                    RequestDispatcher requestdispatcher = request.getRequestDispatcher("datatsv.jsp");
                    requestdispatcher.forward(request, response);
                }

	parser.stopParsing();
         }else{
            request.setAttribute("ok", "1");
                    request.setAttribute("msg", "please enter the button");
                    RequestDispatcher requestdispatcher = request.getRequestDispatcher("datatsv.jsp");
                    requestdispatcher.forward(request, response);
        }
                 }catch(Exception ex){
                     ex.getStackTrace();
                     RequestDispatcher requestdispatcher = request.getRequestDispatcher("datatsv.jsp");
                    requestdispatcher.forward(request, response);
                 } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
