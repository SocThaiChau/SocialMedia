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
	<div class="container">
		<div class="main-body">
			<div class="col-md-12 mb-5">
				<div class="card-body">
					<div class="d-flex flex-column align-items-center text-center">
						<img
							src="https://www.nawpic.com/media/2020/desktop-backgrounds-nawpic-14.jpg"
							alt="Background" class="img-fluid"
							style="width: 1400px; height: 300px; border-radius: 10px;">
						<img
							src="https://scontent.fsgn5-14.fna.fbcdn.net/v/t39.30808-6/395335595_1017822022755672_3434529236999802980_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=efb6e6&_nc_eui2=AeF7lyaVR-piGmBZi8I3LzD87Nl3PVJ8aa7s2Xc9UnxprhruZBvhySfYrHG_7ur4T6yHr45eJ7PPUoo8HArVIHor&_nc_ohc=xcTteRNHOcIAX8VuWeE&_nc_ht=scontent.fsgn5-14.fna&oh=00_AfCzQ_Do13AqtoCXAPHTpFZjQFe_d2Wq4FSnJFhxo-ER-w&oe=6577FA62"
							alt="Avatar" class="rounded-circle" width="150"
							style="position: absolute; top: 50%; left: 50%; transform: translate(-320%, 50%); z-index: 1;">
						<div class="mt-3 mb-5"
							style="position: absolute; top: 75%; right: 700px; transform: translateY(-50%); text-align: left; color: black;">
							<h4 style="margin-bottom: 2px;">Quỳnh My</h4>
							<p style="margin-bottom: 5px;">TP.Quảng Ngãi, Quảng Ngãi</p>
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
							<div class="col-sm-9 text-secondary">${profiles.user_name}
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-sm-3">
								<h6 class="mb-0">Gender</h6>
							</div>
							<div class="col-sm-9 text-secondary">${profiles.gender}</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-sm-3">
								<h6 class="mb-0">Day Of Birthday</h6>
							</div>
							<div class="col-sm-9 text-secondary">${profiles.dob}</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-sm-3">
								<h6 class="mb-0">Email</h6>
							</div>
							<div class="col-sm-9 text-secondary">${profiles.email}</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-sm-3">
								<h6 class="mb-0">Phone</h6>
							</div>
							<div class="col-sm-9 text-secondary">${profiles.phone}</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-sm-3">
								<h6 class="mb-0">Address</h6>
							</div>
							<div class="col-sm-9 text-secondary">${profiles.address}</div>
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
		</div>
	</div>
</body>
</html>