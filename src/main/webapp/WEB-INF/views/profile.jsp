<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<title>ALOHCMUTE</title>
	<meta charset="utf-8">
	<meta name="viewport"
		  content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link
			href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap"
			rel="stylesheet">

	<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
			crossorigin="anonymous">

	<link rel="stylesheet" href="/template/home.css">

	<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

	<link rel="stylesheet"
		  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
		  integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
		  crossorigin="anonymous" referrerpolicy="no-referrer" />

</head>
<body>
<div class="container" style="margin-top: 50px;">
	<c:forEach items="${listProfile}" var="profiles">
	<div class="col-md-12 mb-5">
		<div class="card-body">
			<div class="d-flex flex-column align-items-center text-center">
				<img
						src="${profiles.background}"
						alt="Background" class="img-fluid"
						style="width: 1400px; height: 300px; border-radius: 10px;">
				<img
						src="${profiles.avatar}"
						alt="Avatar" class="rounded-circle" width="150"
						style="position: absolute; top: 50%; left: 50%; transform: translate(-320%, 50%); z-index: 1;">
				<div class="mt-3 mb-5" style="position: absolute; top: 75%; left: 300px; transform: translateY(-50%); text-align: left; color: black;">
					<h4 style="margin-bottom: 2px;">${profiles.profileId}</h4>
					<p style="margin-bottom: 5px;">${profiles.profileId}</p>
					<button class="btn btn-primary">Follow</button>
					<button class="btn btn-outline-primary">Message</button>
				</div>
			</div>
		</div>
	</div>
	<div class="col-md-8 mb-5" style="padding-top: 55px;">
			<div class="card mb-3">
				<div class="card-body">

					<div class="row">
						<div class="col-sm-3">
							<h6 class="mb-0">Full Name</h6>
						</div>
						<div class="col-sm-9 text-secondary">${profiles.users.userName}
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-sm-3">
							<h6 class="mb-0">Gender</h6>
						</div>
						<div class="col-sm-9 text-secondary">${profiles.users.gender}</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-sm-3">
							<h6 class="mb-0">Day Of Birthday</h6>
						</div>
						<div class="col-sm-9 text-secondary">${profiles.users.dob}</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-sm-3">
							<h6 class="mb-0">Email</h6>
						</div>
						<div class="col-sm-9 text-secondary">${profiles.users.email}</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-sm-3">
							<h6 class="mb-0">Phone</h6>
						</div>
						<div class="col-sm-9 text-secondary">${profiles.users.phone}</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-sm-3">
							<h6 class="mb-0">Address</h6>
						</div>
						<div class="col-sm-9 text-secondary">${profiles.users.address}</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-sm-12">
							<a class="btn btn-info " target="__blank">Chỉnh sửa thông
								tin cá nhân</a>
						</div>
					</div>
				</div>

			</div>
		</div>
	</c:forEach>
</div>
</body>
</html>