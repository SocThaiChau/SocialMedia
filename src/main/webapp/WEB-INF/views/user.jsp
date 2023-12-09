<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Trang cá nhân</title>
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
	<div class="post_container">
        <p><b>Tên:</b> ${profiles.users.userName}</p>
        <p><b>Địa chỉ:</b> ${profiles.users.address}</p>
        <p><b>Email:</b> ${profiles.users.email}</p>
        <p><b>Điện thoại:</b> ${profiles.users.phone}</p>
        <p><b>Giới tính:</b> ${profiles.users.gender}</p>
        <p><b>Ngày sinh:</b> ${profiles.users.dob}</p>
        <hr>
        <h2>Bài viết của ${user.username}</h2>
        <c:forEach items="${posts}" var="post">
            <div class="card">
                <div class="card-header">
                    <a href="#" class="card-link">${post.title}</a>
                </div>
                <div class="card-body">
                    ${post.content}
                </div>
            </div>
        </c:forEach>
    </div>
</body>
</html>