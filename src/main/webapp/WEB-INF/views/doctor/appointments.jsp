<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>CS4 - Home</title><spring:url value="/resources/css/main.css" var="cssUrl"></spring:url>
<link rel="stylesheet" type="text/css" href="${cssUrl}">
<link rel="stylesheet" type="text/css"
	href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css">
</head>
<body>
	<div class="header">
		<h1>
			CS4 - <span>there is nothing at the top but lets do it</span>
		</h1>
		<ul>
			<li><a href="../../..">Home</a></li>
			<li><a class="active" href="list">Doctors</a></li>
			<li><a href="profile.html">Profile</a></li>
			<li><a href="appointment.html">Appointment</a></li>
			<li><a href="profile.html">List</a></li>
			<li class="right"><a href="#about">Login</a></li>
			<li class="right">
				<form>
					<input type="text" class="search" placeholder="Search..."></input>
				</form>
			</li>

		</ul>
	</div>
	<!-- header ends -->

	<div class="content">
		<h1>Search Results</h1>

		<div class="main">
			<!-- latest posts related to the user -->
						<c:if test="${!empty listAppointments}">
				<c:forEach items="${listAppointments}" var="appointment">
			
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
								<a href="../../profile/${doctor.id}">You</a> 
									have 
								</c:otherwise>
							</c:choose>
							a appointment with
							<a href="doctor/profile/${appointment.patient.id}">
								<i class="fa fa-stethoscope" aria-hidden="true"></i>
								${appointment.patient.firstName}, ${appointment.patient.lastName}
							</a> on <fmt:formatDate pattern="yyyy-MMM-dd hh:MM" type="both" value="${appointment.dateTime}" />
							<a href="doctor/profule/${doctor.id}" class="readmore" href="#">View Details</a>
						</p>
					</div>
					
				</c:forEach>
			</c:if>
			<!-- latest posts ends -->
		</div>
	</div>

	<!-- header footer starts -->
	<div class="footer">
		<p>All right reserved @2016</p>
		<p>Appointment reserved system</p>
	</div>
</body>
</html>