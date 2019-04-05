/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpes_rcpl_project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author aayam
 */
@WebServlet(name = "Register", urlPatterns = {"/Reg"})
public class Register extends HttpServlet {

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
            Connection con=DBConnection.getConnection();
            
            PreparedStatement pst=con.prepareStatement("insert into loginDetails values(null,?,?,?,?)");
            pst.setString(1, request.getParameter("email"));
            pst.setString(2, request.getParameter("password"));
            pst.setString(3,request.getParameter("typee"));
            pst.setString(4,request.getParameter("fname"));
            PreparedStatement pst1=con.prepareStatement("insert into userDetails values(null,?,?,?,?,?)");
            pst1.setString(1,request.getParameter("fname"));
            pst1.setString(2,request.getParameter("lname"));
            pst1.setString(3,request.getParameter("email"));
            pst1.setString(4,request.getParameter("password"));
            pst1.setString(5,request.getParameter("phone"));
            if(pst.executeUpdate()>0)
                if(pst1.executeUpdate()>0)
                {
                    HttpSession session=request.getSession();
                    session.setAttribute("name", request.getParameter("fname"));
                    session.setAttribute("type", request.getParameter("typee"));
                    PreparedStatement pst2=con.prepareStatement("select uid from userDetails");
                    ResultSet rs=pst2.executeQuery();
                    rs.last();
                    session.setAttribute("uid",rs.getString("uid"));
                    RequestDispatcher rd=request.getRequestDispatcher("homepage.jsp");
                    rd.forward(request, response);
                }
        } catch (Exception e) {
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
