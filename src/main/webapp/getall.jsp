<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Click on sumbit to get data</title>
</head>
<body>
<table>
<thead>
<tr>
<th>id</th>
<th>age</th>
<th>userName</th>
<th>emailId</th>
<th>Password</th>
<th>Update</th>
<th>Delete</th>

</tr>
</thead>
<tbody>
<c:forEach var="user" items="${userList}">
<tr>
<td>${user.getId()}</td>
<td>${user.getAge()}</td>
<td>${user.getUserName()}</td>
<td>${user.getEmailId()}</td>
<td>${user.getPassword()}</td>
<td><a href="update.jsp">edit</a>
<td><a href="deleteaccount.jsp">delete</a>
</tr>
</c:forEach>
</tbody>

</table>
</body>
</html>