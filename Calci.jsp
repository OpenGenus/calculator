<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Calculator</title>
</head>
<body>
	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		double res = 0;
		String operation = request.getParameter("operation");
		switch(operation){
			case "+" : res = num1 + num2;
						break;
			case "-" : res = num1 - num2;
						break;
			case "*" : res = num1 * num2;
						break;
			case "/" : res = (double)num1 / (double)num2;
						break;
			
		}
		out.print("The result of "+ num1 + " "+ operation + " "+ num2 + "= " + res );
	%>
</body>
</html>
