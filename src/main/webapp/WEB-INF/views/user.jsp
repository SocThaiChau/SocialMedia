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
        <div class="content-area col-6 bg-white">
     
           <a href="/add" class="btn btn-primary justify-content-between" style="width:100%">Post</a>

        <c:forEach items="${posts}" var="post" varStatus="loop">
            <div class="status bg-white">
                <div class="status__userProfile d-flex m-2 pt-3 ps-3">
                    <img src="/assets/avt-profile.png" alt="" class="status__userImg me-1">
                    <div>
                        <h6 class="mb-1" style="font-size: 14px;">${post.postId}</h6>
                        <p class="mb-1" style="font-size: 12px;">${post.privacyLevel == true ? 'Public': 'Private'}</p>
                        <p class="mb-1" style="font-size: 12px;">${post.postTime}</p>
                    </div>
                </div>
                <div class="status__content">
                    <p class="ms-4 me-5">${post.content}</p>
                    <c:if test="${not empty base64Images[loop.index]}">
                    	<img src="data:image/jpeg;base64,${base64Images[loop.index]}" alt="img" class="status__contentImg ms-4 me-5">
					</c:if>
                </div>
                <hr class="ms-4 me-5">
                <div class="activity-icon ms-3 pb-3" style="display: flex;  justify-content: space-between;">
                	<div >
                        <i style="cursor: pointer;" class="fa-regular fa-thumbs-up ps-3 pe-3"> 50 </i>
                        <a href="/comments/${post.postId}" class="btn btn-link"><i class="fa-regular fa-comment ps-3 pe-3"> 50 </i></a>
                    </div>
                    <div class="me-4">
                        <a href="/edit/${post.postId}" > <i class="fa-solid fa-pen-to-square ps-3 pe-3"></i></a>
                        <a data-bs-toggle="modal" style="cursor: pointer;" data-bs-target="#ModalDeletePost${post.postId}" data-post-id="${post.postId}"><i class="fa-solid fa-trash ps-3 pe-3 text-danger"></i></a>
                    </div>
               </div>
            		<!-- The Modal Button Delete Post-->
					<div class="modal" id="ModalDeletePost${post.postId}">
					  <div class="modal-dialog">
					    <div class="modal-content">
					
					
					      <!-- Modal body -->
					      <div class="modal-body">
					        Bạn có muốn xóa chứ ?
					      </div>
					
					      <!-- Modal footer -->
					      <div class="modal-footer">
					     	<a href="/delete/${post.postId}" type="button" class="btn btn-danger">Delete</a>
					        <button type="button" class="btn btn-success" data-bs-dismiss="modal">Close</button>
					      </div>
					
					    </div>
					  </div>
					</div>
				<c:forEach items="${comments}" var="comment" varStatus="loop">
					<p class="ms-4 me-5">${comment.content}</p>
				</c:forEach>
				<!-- Form for adding new comments -->
				<form class="comment-form ms-4 me-5" action="/comments/save-comment" method="post" enctype="multipart/form-data">
					<input type="hidden" name="postId" value="${post.postId}"></input>
    				<div class="mb-3 position-relative">
        				<textarea class="form-control" rows="3" id="writeComment" name="content" placeholder="Viết bình luận..."></textarea>
        				<div class="d-flex justify-content-end align-items-end position-absolute bottom-0 end-0 p-2">
            				<label style="cursor: pointer;" for="image" class="image-icon-label me-2"><i class="fas fa-image"></i></label>
            				<button type="submit" class="btn btn-primary writeComment__btnComment ms-2"><i class="fas fa-paper-plane fa-xs"></i></button>
        				</div>
    				</div>
    				<hr class="mb-3">
    				<div class="mb-3"><input type="file" class="form-control visually-hidden" id="image" name="image" accept="image/png, image/jpeg"></div>
				</form>

            </div>
        </c:forEach>
    </div>
</body>
</html>