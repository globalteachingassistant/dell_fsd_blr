<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login JSP</title>
</head>
<body>
<body>
	<div align="center">
		<h3 style="text-decoration: underline;">Login Screen</h3>
		<form action="login" method="post">
			<table>
				<tr>
					<td><input type="text" name="username"
						placeholder="Enter Username"></td>
				</tr>
				<tr>
					<td><input type="password" name="password"
						placeholder="Enter Password"></td>
				</tr>
				<tr>
				<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
		<%if(request.getAttribute("error")!=null){%>
		<span style="color:red;"><%=request.getAttribute("error") %></span>
		<%
		request.removeAttribute("error");
		}%>
	</div>
</body>
</body>
</html>