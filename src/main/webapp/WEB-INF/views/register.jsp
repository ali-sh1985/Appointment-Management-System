<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>CS4 - Registration</title>
	<link rel="stylesheet" type="text/css" href="resources/css/main.css">
	<link rel="stylesheet" type="text/css" href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css">
</head>
<body>
	<div class="header">
		<h1>CS4 - <span>there is nothing at the top but lets do it</span></h1>
		<ul>
		  <li><a class="active" href="index.html">Home</a></li>
		  <li><a href="search.html">Doctors</a></li>
		  <li><a href="profile.html">Profile</a></li>
		  <li><a href="appointment.html">Appointment</a></li>
		  <li><a href="profile.html">List</a></li>
		  <li class="right"><a href="#about">Login</a></li>
		  <li class="right">
		  	<form> <input type="text" class="search" placeholder="Search..."></input></form>
		  </li>
		  
		</ul>
	</div>
	<!-- header ends here -->
	<div class="content">
		<h1>Registration</h1>
		<!-- main content -->

		<div class="loginContainer">
			<div class="registerbox">
			
			<form:form method="POST" modelAttribute="user">
				<p>
					<form:errors path="fname"> </form:errors>
					<form:errors path="lname"> </form:errors>
					<form:errors path="street"> </form:errors>
					<form:errors path="state"> </form:errors>
					<form:errors path="city"> </form:errors>
					<form:errors path="email"> </form:errors>
					<form:errors path="userCredentials.verifyPassword"> </form:errors>
					<form:errors path="userCredentials.password"> </form:errors>
					<form:errors path="userCredentials.authority"> </form:errors>
				</p>
				<p>
					My name is
					<form:input type="text" path="fname" id="fname"/>
					<form:input type="text" path="lname" id="lname" placeholder="last name"/>
					 
					
				</p>
				<p>
					My Address is 
					<form:input type="text" path="street" id="street" placeholder="street"/>
					, 
					<form:input type="text" path="city" id="city" placeholder="city"/>
					, 
					<form:input type="text" path="state" id="state" placeholder="state"/>
				</p>
				<p>
					My E-mail is <form:input type="email" path="email" id="email" placeholder="email"/>
				</p>
				<p>
					I would like to add my password as 
					<form:input type="password" path="userCredentials.password" id="userCredentials.password" placeholder="password"/>
					, yes my password is 
					<form:input type="password" path="userCredentials.verifyPassword" id="userCredentials.verifyPassword" placeholder="re-password"/>
				</p>
				<p>
					I would like to register as 
					<form:select id="role" path="userType">
			           <form:option value="Doctor" />
			           <form:option value="Patient" />
			         </form:select>
				</p>
				<p>
					Yes, now I want to <input type="submit" value="Register"></input>
				</p>
			</form:form>
			</div>
		</div>
		<br>
		
	</div>

	<!-- footer -->
	<div class="footer">
		<p>All right reserved @2016</p>
		<p>Appointment reserved system</p>
	</div>
</body>
</html>