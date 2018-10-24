<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<pre>
<table>
<%-- <c:forEach items="${edata}" var="s" > --%>
<tr><td><input type="hidden" name="id" value="${edata.id}"></td></tr>
<tr><td>Name:<input type="text" name="name" value="${edata.name}"></td></tr>
<tr><td>City:<input type="text" name="city" value="${edata.city}"></td></tr>
<tr><td>Dept:<input type="text" name="dept" value="${edata.dept}"></td></tr>
<tr><td>Username:<input type="text" name="uname" value="${edata.uname}"></td></tr>
<tr><td>Password:<input type="password" name="pass" value="${edata.pass}"></td></tr>
<tr><td colspan="5"><input type="submit" name="register" value="update"></td></tr>
<%-- </c:forEach> --%>
</table>
</pre>




</form>
</body>
</html>