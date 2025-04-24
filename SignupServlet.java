package com.servlet_connection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int num= 8 ;
//     int num_1=num;
//        if(num>6) {
//        	num_1=num;
//        }else {
//        	++num;
//        	num_1=num;
//        }
//        
        
        String id = request.getParameter("id");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");

        // Database connection details
//        String jdbcURL = ;
//        String dbUser = ;
//        String dbPassword = ;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded...");
            // Establish connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DSA_Website", "root", "Tushar2004@");
            System.out.println("Connection done.......");
            // SQL Query to insert user data
            String sql = "INSERT INTO users (Number, id, phone, password) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, num);
            pst.setString(2, id);
            pst.setString(3, phone);
            pst.setString(4, password);

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                out.println("<h3>Signup Successful! <a href='login.jsp'>Login here</a></h3>");
            } else {
                out.println("<h3>Error in Signup. Please try again.</h3>");
            }

            // Close resources
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
	}
	
	}

}
