<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>User Details</h2>
<h4>User Login : ${user.login}</h4>
<h4>User Name : ${user.name}</h4>
<h4>Location : ${user.location}</h4>
<h4>Public Repos : ${user.public_repos}</h4>
<img src="${user.avatar_url}" width="200" height="200">
</body>
</html>