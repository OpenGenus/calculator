package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class mycalci
 */
@WebServlet("/mycalci")
public class mycalci implements Servlet {

    /**
     * Default constructor. 
     */
    public mycalci() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		double result = 0.0;
		
		String operation = request.getParameter("operation");
		switch(operation) {
			case "+" : result = num1 + num2;
						break;
			case "-" : result = num1 - num2;
						break;
			case "*" : result = num1 * num2;
						break;
			case "/" : result = (double)num1 / (double)num2;
						break;
		}
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("Result of " + num1 + " " + operation + " " + num2 +" is : "+ result );
	
	}

}
