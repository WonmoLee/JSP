package com.cos.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/table")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("request Get");
		response.setContentType("text/html; charset = UTF-8;");
		PrintWriter out = response.getWriter();
		String name = "여러가지 과일";
		String name1 = "사파이어";
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println(name);
		out.println("<br/>");
		out.println(name1);
		out.println("</h2>");		
		out.println("<table border='1'>");		
		out.println(" <tr><td>JAVA</td><td>Python</td><td>JS</td><td>Ruby</td><td>C++</td></tr>");		
		out.println(" <tr><td>C#</td><td>React</td><td>Django</td><td>Dart</td><td>GitHub</td></tr>");		
		out.println("</table>");		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("request Post");
	}

}
