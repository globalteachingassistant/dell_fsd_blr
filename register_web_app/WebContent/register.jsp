<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>
<form action="" method="post">
Full Name <input type="text" name="fullName"><br/>
Username(Email)<input type="email" name="email"><br/>
Password<input type="password" name="password"><br/>
Age<input type="number" name="age"><br/>
Country<select name="country">
<option value="INDIA">India</option>
<option value="Other Country">Others</option>
</select><br/>
Gender <input type="radio" name="gender" value="F">Female   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="gender" value="M">Male<br/>
Hobbies<br/>
<input type="checkbox" name="hobby" value="staying home">Stay Home<br/>
<input type="checkbox" name="hobby" value="going out for massage">Sneek Out<br/>
<input type="checkbox" name="hobby" value="be happy">Happiness<br/>
<input type="checkbox" name="hobby" value="shopping">Shopping<br/>
<input type="checkbox" name="hobby" value="Gaming">Gaming<br/>
<input type="checkbox" name="hobby" value="other hobby">Others<br/> 

<input type="submit" name="submit" value="Register"> 
<input type="reset" value="Cancel">
</form>
<%
if(request.getParameter("submit")!=null){%>
	<jsp:useBean id="user" class="com.model.User" scope="request"></jsp:useBean>
	<jsp:setProperty property="*" name="user"/>
	<jsp:forward page="register"></jsp:forward>
<%}
%>
</body>
</html>