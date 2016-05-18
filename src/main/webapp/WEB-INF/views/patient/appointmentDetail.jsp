<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="today" class="java.util.Date" />
<!DOCTYPE html>
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
	<div class="content">
		<h1>Appointment Detail</h1>
		<!-- main content -->

		<div class="main patient">
			<!-- latest posts related to the user -->
			
			
			<c:if test="${!empty appointment}">
				
			
					<div class="lists">
						<p>
							<c:choose>
								<c:when test="${today gt appointment.dateTime}">
								<i class="fa fa-heartbeat redcolor" aria-hidden="true"></i>&nbsp;
								<a href="/p/1">You</a> 
									had
								</c:when>
								<c:otherwise>
								<i class="fa fa-heartbeat greencolor" aria-hidden="true"></i> &nbsp;
								<a href="/p/1">You</a> 
									have 
								</c:otherwise>
							</c:choose>
							a appointment with
							<a href="doctor/profile/${appointment.doctor.id}">
							<i class="fa fa-stethoscope" aria-hidden="true"></i>
								${appointment.doctor.firstName}, ${appointment.doctor.lastName}
							</a> on <fmt:formatDate type="both" value="${appointment.dateTime}" />
						</p>
						<p>
							${appointment.description}
						</p>
					</div>
					
				
			</c:if>			
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