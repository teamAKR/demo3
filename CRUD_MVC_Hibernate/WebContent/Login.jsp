<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<h1>Login Page</h1>
<body bgcolor="cyan">
<form action="log">
<h3>${msg }</h3>
<pre>
<table>
<tr><td>Username:<input type="text" name="uname"></td></tr>
<tr><td>Password:<input type="text" name="pass"></td></tr>
<tr><td colspan="2"><input type="submit" name="Login" value="Login"></td></tr>
<tr><td colspan="2"><a href="Register.jsp">RegisterHere</a></td></tr>
</table>
</pre>
</form>
</body>
</html>