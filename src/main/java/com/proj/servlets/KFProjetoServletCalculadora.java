package com.proj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KFProjetoServletCalculadora
 */
@WebServlet("/KFServletCalculadora")
public class KFProjetoServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KFProjetoServletCalculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//int var1 = Integer.parseInt(request.getParameter("valor1")); //SEMPRE TENHO Q CONVERTER PQ HTML � UMA LINGUAGEM DE HIPERTEXTO, MESMO Q O INPUT SEJA DO TIPO NUMBER, ELE VAI VER O NAME COMO TEXTO
		//int var2 = Integer.parseInt(request.getParameter("valor2"));
		//int result = var1 + var2;
		
		//response.getWriter().println("Resultado = " + result);
		//request.setAttribute("res", result); //requestScope-forward
		//request.getRequestDispatcher("/").forward(request, response); //redireciona para ele mesmo)
		
		//USANDO A MODEL
		if(request.getParameter("valor1") != null && request.getParameter("valor2") != null) {
			//leitura dos parametros
			int val1 = Integer.parseInt(request.getParameter("valor1"));
			int val2 = Integer.parseInt(request.getParameter("valor2"));
			
			//chamada da regra de neg�cio
			Calculadora c = new Calculadora(val1, val2);
			int resultadoSoma = c.somar();
			
			//resultado da regra de neg�cio
			request.setAttribute("resSoma", resultadoSoma);
		}
		
		request.getRequestDispatcher("/").forward(request, response);
	}

}
