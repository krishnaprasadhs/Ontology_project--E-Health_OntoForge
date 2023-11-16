/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author WINDOWS 10
 */
public class csvdata extends HttpServlet {

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
          
      
        try {  
            String url = "jdbc:mysql://localhost:3306/ontology";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "root");
            PreparedStatement ps;
  String a1="C:\\Users\\Jeffry\\Desktop\\dataset\\"+request.getParameter("a1");
       String s1=request.getParameter("s1");
 
        int batchSize = 3000;

       
   if(s1!=null){int count = 0, v1=0,v=0;
          
//            connection.setAutoCommit(false); 
          Statement st = con.createStatement();
             v=st.executeUpdate("delete  from cancer ");
            String sql = "INSERT INTO cancer VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
             BufferedReader lineReader = new BufferedReader(new FileReader(a1));
            String lineText = null;
             
             lineReader.readLine(); // skip header line
             while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String uid = data[0];
                String place = data[1];
                String city = data[2];
                String type = data[3];
                String category= data[4];
                String address = data[5];
                String lat = data[6];
                String log = data[7];
                String description=data[8];
                 String logs=data[9];
                 String uid1 = data[10];
                String place1 = data[11];
                String city1 = data[12];
                String type1 = data[13];
                String category1= data[14];
                String address1 = data[15];
                String lat1 = data[16];
                String log1 = data[17];
                String description1=data[18];
                 String logs1=data[19];
                   String uid2= data[20];
                String place2 = data[21];
                String city2 = data[22];
                String type2 = data[23];
                String category2= data[24];
                statement.setString(1, uid);
                statement.setString(2, place);
                statement.setString(3, city);
                statement.setString(4, type);
                statement.setString(5, category);
                statement.setString(6, address);
                statement.setString(7, lat);
                statement.setString(8, log);
                statement.setString(9, description);
                statement.setString(10, logs);
             statement.setString(11, uid1);
                statement.setString(12, place1);
                statement.setString(13, city1);
                statement.setString(14, type1);
                statement.setString(15, category1);
                statement.setString(16, address1);
                statement.setString(17, lat1);
                statement.setString(18, log1);
                statement.setString(19, description1);
                statement.setString(20, logs1);
               statement.setString(21, uid2);
                statement.setString(22, place2);
                statement.setString(23, city2);
                statement.setString(24, type2);
                statement.setString(25, category2);
              
               v1=statement.executeUpdate();
               
            }
          
                if((v1==1))  {

                    request.setAttribute("ok", "1");
                    request.setAttribute("msg", "Added  Successfully");
                    RequestDispatcher requestdispatcher = request.getRequestDispatcher("datacsv.jsp");
                    requestdispatcher.forward(request, response);
                }else{

                    request.setAttribute("ok", "1");
                    request.setAttribute("msg", "Adding data Failed");
                    RequestDispatcher requestdispatcher = request.getRequestDispatcher("datacsv.jsp");
                    requestdispatcher.forward(request, response);
                }

//            lineReader.close();
 
          
            statement.executeBatch();    
        }else{
            request.setAttribute("ok", "1");
                    request.setAttribute("msg", "please enter the button");
                    RequestDispatcher requestdispatcher = request.getRequestDispatcher("datacsv.jsp");
                    requestdispatcher.forward(request, response);
        }
          
// 
//            connection.commit();
//            connection.close();
 
        } catch (Exception ex) {
            System.err.println(ex);
        }
            finally {
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
