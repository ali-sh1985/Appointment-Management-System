<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>CS4 - Home</title>
<link rel="stylesheet" type="text/css" href="../resources/css/main.css">
<link rel="stylesheet" type="text/css"
	href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css">
</head>
<body>
	<div class="header">
		<h1>
			CS4 - <span>there is nothing at the top but lets do it</span>
		</h1>
		<ul>
			<li><a href="../">Home</a></li>
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
			<c:if test="${!empty listDoctors}">
				<c:forEach items="${listDoctors}" var="doctor">
					<div class="lists">
						<div class="imagesection">
							<img
								src="http://www.keenthemes.com/preview/metronic/theme/assets/pages/media/profile/profile_user.jpg"
								class="userpic" title="doctor" alt="doctor">
						</div>
						<div class="detailsection">
							<span class="name"><a href="profile/${doctor.id}">Dr.
									${doctor.firstName} ${doctor.lastName}</a></span><br> <span>Specialist
								: ${doctor.speciality.name}</span><br> <span>Address :
								1000 N Fairfield Iowa</span><br> <span>Contact : +1 641 451
								3151</span><br> <span>Email : awesomedr@gmail.com</span>
						</div>
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