<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="register.lti" enctype="multipart/form-data">
	Enter Your Name: <input type="text" name="name"/><br/>
	Enter Your Age: <input type="number" name="age"/><br/>
	Enter Your Email: <input type="email" name="email"/><br/>
	Enter Your City: <input type="text" name="city"/><br/>
	Upload Your Profile Picture: <input type="file" name="profilePic"><br/>
	<button type="submit">Register</button>
	
</form>
</body>
</html>