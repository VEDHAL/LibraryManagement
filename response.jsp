<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration form</title>
</head>
<body>
<h1>welcome to the response file</h1>
<p> Username : <%= request.getAttribute("username") %></p>
<p> Email : <%= request.getAttribute("email") %></p>
<p> password : <%= request.getAttribute("password") %></p>
<p> ph number : <%= request.getAttribute("number") %></p>
<p> feedback : <%= request.getAttribute("message") %></p>
<p> Subscribe to newsletter : <%= request.getAttribute("subscribe") %></p>
<p> Gender : <%= request.getAttribute("gender") %></p>
<p> State : <%= request.getAttribute("state") %></p>
<p> File attached : <%= request.getAttribute("file") %></p>
<p> Date : <%= request.getAttribute("date") %></p>



</body>
</html>