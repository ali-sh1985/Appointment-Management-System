<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>CS4 - Home</title>
	<link rel="stylesheet" type="text/css" href="../../resources/css/main.css">
	<link rel="stylesheet" type="text/css" href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css">
</head>
<body>
	<div class="header">
		<h1>CS4 - <span>there is nothing at the top but lets do it</span></h1>
		<ul>
		  <li><a href="../../">Home</a></li>
		  <li><a class="active" href="../list">Doctors</a></li>
		  <li><a href="profile.html">Profile</a></li>
		  <li><a href="appointment.html">Appointment</a></li>
		  <li><a href="profile.html">List</a></li>
		  <li class="right"><a href="#about">Login</a></li>
		  <li class="right">
		  	<form> <input type="text" class="search" placeholder="Search..."></input></form>
		  </li>
		  
		</ul>
	</div>
	<div class="content">
		<h1>Dr. ${doctor.firstName} ${doctor.lastName}</h1>
		<!-- main content -->

		<div class="main">
			<!-- latest posts related to the user -->
			<div class="lists">
				<div class="imagesectionProfile">
					<img src="http://www.keenthemes.com/preview/metronic/theme/assets/pages/media/profile/profile_user.jpg" class="userpicBig" title="doctor" alt="doctor">
				</div>
				<div class="detailsection">
				 	<span class="name"><a href="">Dr. ${doctor.firstName} ${doctor.lastName}</a></span><br>
				 	<span>Specialist : ${doctor.specialty.name}</span><br>
					<span>Address : 1000 N Fairfield Iowa</span><br>
				 	<span>Contact : +1 641 451 3151</span><br>
				 	<span>Email : awesomedr@gmail.com</span>
				 	<hr>
				 	<div class="bio">
				 		<p>
				 			The data collected by the department is accurate to the best of the knowledge of the department, based on the information supplied by the physician who is the subject of the data. 
While the department utilizes a variety of sources of information in checking the accuracy of the data reported, we cannot be sure that all of the information on this website is right, complete, or up-to-date, and cannot be responsible for any information that is wrong or has been left out. 
Consumers are encouraged to consult other sources to verify or obtain additional information about a physician. 
Pending legal actions do not in any way indicate parties' guilt, liability or culpability. Cases may be dismissed, withdrawn, or settled without payments to plaintiffs. Any disposition to a case may be subject to appeal.
				 		</p>
				 	</div>
				</div>
			</div>

			
			<!-- latest posts ends -->
		</div>

		<!-- side bar -->
		<div class="sidebar">
			<ol>
			  <li><a href="#home">New Requests</a></li>
			  <li><a href="#news">My Patients</a></li>
			  <li><a href="#contact">Calender</a></li>
			  <li><a href="#about">Annual Report</a></li>
			</ol>
		</div>
	</div>

	<div class="footer">
		<p>All right reserved @2016</p>
		<p>Appointment reserved system</p>
	</div>
</body>
</html>