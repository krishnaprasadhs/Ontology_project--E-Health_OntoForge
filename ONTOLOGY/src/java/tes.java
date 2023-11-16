/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class tes {
	public static void main(String[] args) throws FileNotFoundException {
		 try{
                     int  v=0;
                       String url = "jdbc:mysql://localhost:3306/ontology";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "root");
            PreparedStatement ps;
             Statement st = con.createStatement();
         v=st.executeUpdate("delete  from data");
         String sql = "INSERT INTO data VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
		
		TsvParserSettings settings = new TsvParserSettings();
		
		settings.getFormat().setLineSeparator("\n");	
		
		TsvParser parser = new TsvParser(settings);		
		
		List<String[]> allRows = parser.parseAll(new FileInputStream("D:\\var_drug_ann.tsv"));
	   for (int i = 1; i <=allRows.size(); i++){	//Ignore the first line
	    	
	    	System.out.println(Arrays.asList(allRows.get(i)));
	    	System.out.println(allRows.get(i)[0].trim());
	    	System.out.println(allRows.get(i)[1].trim());
	    	System.out.println(allRows.get(i)[2].trim());
	    	System.out.println(allRows.get(i)[3].trim());
	    	System.out.println(allRows.get(i)[4].trim());
                System.out.println(allRows.get(i)[5].trim());
	    	System.out.println(allRows.get(i)[6].trim());
		System.out.println(allRows.get(i)[7].trim());
                System.out.println(allRows.get(i)[8].trim());
	    	System.out.println(allRows.get(i)[9].trim());
                  statement.setString(1, allRows.get(i)[0].trim());
                statement.setString(2, allRows.get(i)[1].trim());
                statement.setString(3, allRows.get(i)[2].trim());
                statement.setString(4, allRows.get(i)[3].trim());
                statement.setString(5, allRows.get(i)[4].trim());
                statement.setString(6, allRows.get(i)[5].trim());
                statement.setString(7, allRows.get(i)[6].trim());
                statement.setString(8, allRows.get(i)[7].trim());
                statement.setString(9, allRows.get(i)[8].trim());
                statement.setString(10, allRows.get(i)[9].trim());
               v=statement.executeUpdate();
	    }
	parser.stopParsing();
                 }catch(Exception ex){
                     ex.getStackTrace();
                 }
	}
	
}
