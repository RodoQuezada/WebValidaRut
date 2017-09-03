/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rodo
 */
@WebServlet(urlPatterns = {"/verificarRut.do"})
public class VerificarRut extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String error = "";
        int multiplica = 2, suma = 0, numDigito = 0;

        String rut = request.getParameter("rut");
        String digito = request.getParameter("digito").toUpperCase();
        boolean digitoCorrecto = false;

        if (digito.isEmpty()) {
            error += " - Debe ingresar digito verificador <br>";
        }

        if (rut.length() <= 6) {
            error += "- Largo de Rut incorrecto.<br>";
        }

        if (rut.isEmpty()) {
            error += "- Debe ingresar el rut <br>";
        } else {
            
            for (int i = (rut.length()-1); i >= 0; i--) {
                suma = suma + Integer.parseInt(rut.substring(i, i + 1)) * multiplica;
                multiplica++;
                if (multiplica == 8) {
                    multiplica = 2;
                }
            }
        //     numDigito = Integer.parseInt(digito);
            numDigito = 11 - (suma % 11);
            if (numDigito == 10 && digito.equals("K")) {
                digitoCorrecto = true;
            } else if (numDigito == 11 && Integer.parseInt(digito) == 0) {
                digitoCorrecto = true;
            } else if (numDigito == Integer.parseInt(digito)) {
                digitoCorrecto = true;
            }
            if (digitoCorrecto == false) {
                error += "- Rut no valido. <br>";
            }
        }
        
        //dispacher de error   
        if (error.isEmpty()) {
            request.setAttribute("ok", "Rut Validado");
        } else {
            request.setAttribute("error", error);
        }
        request.getRequestDispatcher("validarut.jsp").forward(request, response);

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
