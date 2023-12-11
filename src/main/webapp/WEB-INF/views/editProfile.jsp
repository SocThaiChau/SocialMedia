<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Trang cá nhân</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <link rel="stylesheet" href="/template/home.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>

<body>
		<div class="backGroundImg container-fluid">
            <img src="https://i.pinimg.com/736x/52/55/44/5255445017cd98fd66d7d589e6c10f58.jpg" style="width: 100%; height: 500px; background-color: white; border: none; object-fit: cover;">

        </div>           
                <div class=" border-right">
                    <div class="d-flex flex-column align-items-center text-center p-2">
                    	<c:if test="${not empty imageAvatarBase64}">
						    <img src="data:image/jpeg;base64,${imageAvatarBase64}" width="90" style="background-color: white;">
						</c:if>
						<c:if test="${empty imageAvatarBase64}">
		                    <img class="rounded-circle mt-5" src="/assets/avt-profile.png" width="90" style="background-color: white;">
						</c:if>
	                    <span class="font-weight-bold">${user.userName}</span>
	                    <span class="text-black-50">${user.email}</span>
	                    <span>Đang hoạt động</span>
                    </div>
                </div>

                <div class="d-flex justify-content-center container-fluid">
                    
                   <form method="POST" action="/user/${user.userId}/edit" enctype="multipart/form-data">
                        <div class="row mt-2">
                            <span class="my-2">UserName</span>
                            <input type="hidden" class="form-control" value="${user.userId}" name="userId">
                            <input type="hidden" class="form-control" value="${user.password}" name="password">
                            <div class="col">
                            	<input type="text" class="form-control" value="${user.userName}" name="userName">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <span class="my-2">Địa chỉ</span>
                            <div class="col">
                            	<input type="text" class="form-control" value="${user.address}" name="address">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <span class="my-2">Email</span>
                            <div class="col">
                            <input type="text" class="form-control" value="${user.email}" readonly name="email">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <span class="my-2">Số điện thoại</span>
                            <div class="col">
                            <input type="text" class="form-control" value="${user.phone}" name="phone">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <span class="my-2">Giới tính</span>
                            <div class="col">
                            <input type="text" class="form-control" value="${user.gender}" name="gender">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <span class="my-2">Ảnh đại diện</span>
                            <div class="col"><input type="file" class="form-control" id="fileAvt" accept="image/*" name="imageAvatar"></div>
                        </div>
                        <!--<div class="row mt-3">
                            <span class="my-2">Ảnh bìa</span>
                            <div class="col"><input type="file" class="form-control" id="fileBg" accept="image/*" name="imageBackGround"></div>
                        </div>-->
                        <div class="mt-5 d-flex justify-content-end">
                            <button type="submit" class="btn btn-primary profile-button " type="button">Save Profile</button>
                        </div>
                    </form>
                </div>

</body>
</html>