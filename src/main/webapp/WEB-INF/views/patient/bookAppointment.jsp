<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:useBean id="today" class="java.util.Date" />
<!DOCTYPE html>
<html>
<head>
<title>CS4 - Home</title>
<link rel="stylesheet" type="text/css"
	href="../../resources/css/main.css">
<link rel="stylesheet" type="text/css"
	href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css">
</head>
<body>
	<div class="header">
		<h1>
			CS4 - <span>there is nothing at the top but lets do it</span>
		</h1>
		<ul>
			<li><a class="active" href="index.html">Home</a></li>
			<li><a href="search.html">Doctors</a></li>
			<li><a href="profile.html">Profile</a></li>
			<li><a href="appointment.html">Appointment</a></li>
			<li><a href="profile.html">List</a></li>
			<li class="right"><a href="#about">Login</a></li>
			<li class="right">
				<form action="../../search" method="post">
					<input name="query" type="text" class="search"
						placeholder="Search..."></input>
				</form>
			</li>

		</ul>
	</div>
	<div class="content">
		<h1>Appointment Detail</h1>
		<!-- main content -->

		<div class="main patient">
			<!-- appointment book  -->
			<h1>Register Appointment</h1>
			<!-- appointment book  -->
		</div>

		<!-- side bar -->
		<div class="sidebar">
			<ol>
				<li><i class="fa fa-clock-o greencolor" aria-hidden="true"></i><a
					href="../">My Appointments</a></li>
				<li><i class="fa fa-user greencolor" aria-hidden="true"></i><a
					href="../profile/${appointment.patient.id}">My Profile</a></li>
			</ol>
		</div>
	</div>

	<div class="footer">
		<p>All right reserved @2016</p>
		<p>Appointment reserved system</p>
	</div>
</body>
</html>