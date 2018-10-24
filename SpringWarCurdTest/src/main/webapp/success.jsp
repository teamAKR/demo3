<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function add()
{
	document.myform.action="registerpage";
	document.myform.submit();
	
}
function del()
{
	document.myform.action="delete";
	document.myform.submit();
		
	
}
function edit()
{
	document.myform.action="edit";
	document.myform.submit();
	
	
}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="myform">
<table border="2">
<tr>
<th>Name</th>
<th>Address</th>
<th>MobileNo</th>
<th>Uname</th>
<th>Password</th>
</tr>

<c:forEach items="${userlist}" var="s">
<tr>
<td> <input type="radio" name="id" value="${s.id}">
<td>${s.name}</td>
<td>${s.address }</td>
<td>${s.mobileno }</td>
<td>${s.login.uname }</td>
<td>${s.login.password }</td>
</c:forEach>
</table>
<input type="button" onclick="add()" value="add">
<input type="button" onclick="edit()" value="Edit">
<input type="button" onclick="del()" value="Delete">
</form>

</body>
</html>