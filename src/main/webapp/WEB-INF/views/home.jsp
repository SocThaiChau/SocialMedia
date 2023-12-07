<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>ALOHCMUTE</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <link rel="stylesheet" href="/template/home.css">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>

<body>
<!-- content-area------------ -->
<div class="row bg-light">
    <!-- leftSidebar -->
    <div class="leftSidebar col-3 ">
        <div class="advertisement bg-white mt-3 ms-3">
            <div class="advertisement__title d-flex m-2 pt-3 ps-3">
                <h6 class="mb-1" style="font-size: 14px;">Advertisement</h6>
            </div>
            <img src="/assets/Advertisement-img.png" alt="" class="advertisement__img me-2 ms-2 pe-3 ps-3 pb-3">
        </div>
        <div class="notification bg-white mt-3 ms-3">
            <div class="advertisement__title  m-2 pt-3 ps-3 d-flex">
                <i class="fa-solid fa-bell me-2"></i>
                <h6 class="mb-1 text-" >Notification</h6>
            </div>
            <div class="notification__content m-2 pt-3 ps-3 pb-3 d-flex">
                <h6 class="mb-1" style="font-size: 14px;">Nguyễn Chí Thanh đã nhắc đến bạn trong 1 bình luận</h6>

            </div>

        </div>
    </div>
    <!-- content-area -->
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
            </div>
            <div class="status__content">
                <p class="ms-4 me-5">Lorem Ipsum Dolor Sit Amet Consectetur Adipisicing Elit. Corporis Dolores Praesentium Dicta Laborum Nihil Accusantium Odit Laboriosam, Sed Sit Autem!</p>
                <img src="https://dulichtoday.vn/wp-content/uploads/2017/04/vinh-Ha-Long.jpg" alt="img" class="status__contentImg ms-4 me-5">
            </div>
            <hr class="ms-4 me-5">
            <div class="activity-icon ms-3 pb-3">
                <i class="fa-regular fa-thumbs-up ps-3 pe-3"> 50 </i>
                <i class="fa-regular fa-comment ps-3 pe-3"> 50 </i>
            </div>
            
            <!-- Like, Comment, Share Section -->
    		<div class="buttonDisplay ms-3 pb-3">
        		<!-- Like Form -->
        		<form action="/path/to/like_handler" method="post">
            		<input type="hidden" name="status_id" value="1">
            		<button class="btn btn-light btn-sm" type="submit"><i class="fa-regular fa-thumbs-up me-1"></i> Like</button>
        		</form>

        		<!-- Comment Form -->
        		<form action="/path/to/comment_handler" method="post">
            		<input type="hidden" name="status_id" value="1">
            		<button class="btn btn-light btn-sm" type="submit"><i class="fa-regular fa-comment me-1"></i> Comment</button>
        		</form>

        		<!-- Share Form -->
        		<form action="/path/to/share_handler" method="post">
            		<input type="hidden" name="status_id" value="1">
            		<button class="btn btn-light btn-sm" type="submit"><i class="fa-regular fa-share me-1"></i> Share</button>
        		</form>
    		</div>
            
            <!-- Comments Section -->
    		<div class="comments mt-3 ms-4 me-5">
    			<c:forEach var="comment" items="${comments}">
        			<div>
            			<p>${comment.users.username}: ${comment.content}</p>
        			</div>
    			</c:forEach>
    			
        		<!-- Form for adding new comments -->
        		<form class="comment-form mt-3" action="/comments/add-comment" method="post">
    				<input type="hidden" name="commentId" value="1">
    				<div class="mb-3">
        				<textarea class="form-control" rows="3" id="writePost" name="content" placeholder="Viết bình luận..."></textarea>
    				</div>
    				<hr class="mb-3">
    				<button type="submit" class="btn btn-primary writeComment__btnComment mb-3 justify-content-between">Post Comment</button>
				</form>
    		</div>
        </div>

        <div class="status bg-white">
            <div class="status__userProfile d-flex m-2 pt-3 ps-3">
                <img src="/assets/avt-profile.png" alt="" class="status__userImg me-1">
                <div>
                    <h6 class="mb-1" style="font-size: 14px;">Nguyễn Chí Thanh</h6>
                    <p class="mb-1" style="font-size: 12px;">Public</p>
                <div class="status__content">
                    <p class="ms-4 me-5">${post.content}</p>
                    <c:if test="${not empty base64Images[loop.index]}">
                    	<img src="data:image/jpeg;base64,${base64Images[loop.index]}" alt="img" class="status__contentImg ms-4 me-5">
					</c:if>
                </div>
                <hr class="ms-4 me-5">
                <div class="activity-icon ms-3 pb-3" style="display: flex;  justify-content: space-between;">
                        <div >
                            <i class="fa-regular fa-thumbs-up ps-3 pe-3"> 50 </i>
                            <i class="fa-regular fa-comment ps-3 pe-3"> 50 </i>
                        </div>
                        <div class="me-4">
                            <a href="/edit/${post.postId}" > <i class="fa-solid fa-pen-to-square ps-3 pe-3"></i></a>
                            <a data-bs-toggle="modal" data-bs-target="#ModalDeletePost${post.postId}" data-post-id="${post.postId}"><i class="fa-solid fa-trash ps-3 pe-3 text-danger"></i></a>
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
            </div>
            <div class="status__content">
                <p class="ms-4 me-5">Lorem Ipsum Dolor Sit Amet Consectetur Adipisicing Elit. Corporis Dolores Praesentium Dicta Laborum Nihil Accusantium Odit Laboriosam, Sed Sit Autem!</p>
                <img src="https://dulichtoday.vn/wp-content/uploads/2017/04/vinh-Ha-Long.jpg" alt="img" class="status__contentImg ms-4 me-5">
            </div>
            <hr class="ms-4 me-5">
            <div class="activity-icon ms-3 pb-3">
                <i class="fa-regular fa-thumbs-up ps-3 pe-3"> 50 </i>
                <i class="fa-regular fa-comment ps-3 pe-3"> 50 </i>
            </div>
            
            <!-- Like, Comment, Share Section -->
    		<div class="buttonDisplay ms-3 pb-3">
        		<!-- Like Form -->
        		<form action="/path/to/like_handler" method="post">
            		<input type="hidden" name="status_id" value="1">
            		<button class="btn btn-light btn-sm" type="submit"><i class="fa-regular fa-thumbs-up me-1"></i> Like</button>
        		</form>

        		<!-- Comment Form -->
        		<form action="/path/to/comment_handler" method="post">
            		<input type="hidden" name="status_id" value="1">
            		<button class="btn btn-light btn-sm" type="submit"><i class="fa-regular fa-comment me-1"></i> Comment</button>
        		</form>

        		<!-- Share Form -->
        		<form action="/path/to/share_handler" method="post">
            		<input type="hidden" name="status_id" value="1">
            		<button class="btn btn-light btn-sm" type="submit"><i class="fa-regular fa-share me-1"></i> Share</button>
        		</form>
    		</div>
            
            <!-- Comments Section -->
    		<div class="comments mt-3 ms-4 me-5">
        		<!-- Form for adding new comments -->
        		<form class="comment-form mt-3" action="/path/to/comment_handler" method="post">
    				<input type="hidden" name="status_id" value="1">
    				<div class="mb-3">
        				<textarea class="form-control" rows="3" id="writePost" name="text" placeholder="Viết bình luận..."></textarea>
    				</div>
    				<hr class="mb-3">
    				<button type="submit" class="btn btn-primary writeComment__btnComment mb-3 justify-content-between">Post Comment</button>
				</form>
    		</div>
        </div>
        </c:forEach>


    </div>
    <!-- rightSidebar -->
    <div class="rightSidebar col-3 bg-light ps-3">
        <p class="pt-2 m-2">Người liên Hệ</p>
        <hr>

        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>
        <div class="d-flex rightSidebar__user mb-2">
            <img src="/assets/avt-profile.png" alt="" class="rightSidebar__userImg me-2">
            <p class="rightSidebar__userName">Nguyễn Chí Thanh</p>
        </div>


    </div>
</div>
<script >
</script>
</body>
</html>