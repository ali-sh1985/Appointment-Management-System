<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>CS4 - Home</title>
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
		<h1>Login</h1>
		<!-- main content -->

		<div class="loginContainer">
			<div class="loginbox">
				<form action="login.do" method="POST">
					<div class="row">
						<label>Username</label>
						<input name="username" type="text"></input>
					</div>
					<div class="row">
						<label>Password</label>
						<input type="password" name ="password"></input>
					</div>
					<div class="row">
						<input type="submit" title="Login"></input>
					</div>
				</form>
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