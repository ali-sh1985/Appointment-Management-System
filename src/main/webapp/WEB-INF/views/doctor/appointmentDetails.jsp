<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:useBean id="today" class="java.util.Date" />
<!DOCTYPE html>
<html>
<head>
<title>CS4 - Home</title><spring:url value="/resources/css/main.css" var="cssUrl"></spring:url>
<link rel="stylesheet" type="text/css"
	href="${cssUrl}">
<link rel="stylesheet" type="text/css"
	href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css">
</head>
<body>
	<div class="header">
		<h1>
			CS4 - <span>there is nothing at the top but lets do it</span>
		</h1>
		<ul>
		<spring:url value="/" var="home"></spring:url>
			<li><a href="${home}">Home</a></li>
			<li><a class="active" href="${home}/list">Doctors</a></li>
			<li><a href="profile.html">Profile</a></li>
			<li><a href="appointment.html">Appointment</a></li>
			<li><a href="profile.html">List</a></li>
			<li class="right"><a href="#about">Login</a></li>
			<li class="right">
				<form action="../../search" method="post"> <input name="query" type="text" class="search" placeholder="Search..."></input></form>
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
								<i class="fa fa-heartbeat fa-stethoscope redcolor" aria-hidden="true"></i>&nbsp;
								<a href="../profile/${appointment.patient.id}">You</a>  
									had
								</c:when>
							<c:otherwise>
								<i class="fa fa-heartbeat greencolor" aria-hidden="true"></i> &nbsp;
								<a href="../profile/${appointment.doctor.id}">You</a>  
									have 
								</c:otherwise>
						</c:choose>
						a appointment with <a
							href="../../doctor/profile/${appointment.doctor.id}"> <i
							class="fa fa-heartbeat" aria-hidden="true"></i>
							${appointment.patient.firstName}, ${appointment.patient.lastName}
						</a> on
						<fmt:formatDate type="both" value="${appointment.dateTime}" />
					</p>
					<hr>
					<div class="bio">
						<p><i class="fa fa-quote-left fa-2x fa-pull-left fa-border greencolor" aria-hidden="true"></i>
						 ${appointment.description}</p>
					</div>
				</div>


			</c:if>
			<!-- latest posts ends -->
		</div>

		<!-- side bar -->
		<div class="sidebar">
			<ol>
				<li><i class="fa fa-clock-o greencolor" aria-hidden="true"></i><a href="../">My Appointments</a></li>
				<li><i class="fa fa-user greencolor" aria-hidden="true"></i><a href="../profile/${appointment.patient.id}">My Profile</a></li>
			</ol>
		</div>
	</div>

	<div class="footer">
		<p>All right reserved @2016</p>
		<p>Appointment reserved system</p>
	</div>
</body>
</html>