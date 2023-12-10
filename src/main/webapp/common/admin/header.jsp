<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<nav
	class="navbar navbar-expand-sm navbar-dark bg-primary ps-3 fixed-top">
	<div class="container-fluid d-flex justify-content-between ">
		<a class="navbar-brand ms-3" href="#">ALOHCMUTE</a>
		<div style="width: 500px" id="navbarsExampleDefault">
			<ul class="navbar-nav m-auto">
				<li class="nav-item active"><a style="color: white"
					class="nav-link" href="/home">Home<span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item"><a style="color: white" class="nav-link"
					href="<c:url value='/profile/userId=${user.userId}'/>">Trang cá nhân</a></li>
			</ul>
		</div>
		<form method="post" action="/search" class="navbar__search me-3">
			<div class="input-group ml-10">
				<input type="text" class="form-control" id="search" name="keyword"
					placeholder="Search...">
				<div class="input-group-append">
					<button type="submit" class="btn btn-danger">
						<i class="fa fa-search"></i>
					</button>
				</div>
			</div>
		</form>
	</div>

	<div class="collapse navbar-collapse me-4" id="mynavbar">

		<div class="dropdown ">
			<img src="assets/avt-profile.png" alt="avatar"
				class="avatar-profile dropdown-toggle" data-bs-toggle="dropdown">
			<ul class="dropdown-menu dropdown-menu-end">
				<li class="mb-2"><a class="dropdown-item" href="/profile"> <i
						class="fa-solid fa-user me-1"></i> Profile
				</a></li>
				<li><hr class="dropdown-divider"></li>
				<li class="mb-2"><a class="dropdown-item" href="/"> <i
						class="fa-solid fa-right-from-bracket me-1"></i> Log out
				</a></li>
			</ul>
		</div>
	</div>
</nav>
