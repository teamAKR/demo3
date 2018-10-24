<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
<script type="text/javascript">
function del() 
{
	document.myForm.action="del";
	document.myForm.submit();
	
}
function add() 
{
	document.myForm.action="Register.jsp";
	document.myForm.submit();
	
}

function edit() 
{
	document.myForm.action="edit";
	document.myForm.submit();
	
}


</script>
</head>
<h3>${msg }</h3>
<body bgcolor="pink">
<form name="myForm">
<table>
<th>E_ID</th>
<th>E_Name</th>
<th>E_City</th>
<th>E_Dept</th>
<th>E_Username</th>
<th>E_Password</th>
<c:forEach items="${ edata}" var="emp">
<tr>
<td><input type="radio" name="id" value="${emp.id}"></td>
<td>${emp.name}</td>
<td>${emp.city}</td>
<td>${emp.dept}</td>
<td>${emp.uname}</td>
<td>${emp.pass}</td>


</tr>

</c:forEach>
<tr><td colspan="6"><input type="submit" value="Delete" onclick="del()"></td></tr>
<tr><td colspan="6"><input type="submit" value="Edit" onclick="edit()"></td></tr>
<tr><td colspan="6"><input type="submit" value="Add" onclick="add()"></td></tr>
</table>
</form>
</body>
</html>