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
    <div class="leftSidebar col-3">
        <div class="card chat-app">
			<div id="plist" class="people-list">
				<h4>Tin nhắn</h4>
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"><i class="fa fa-search"></i></span>
					</div>
					<input type="text" class="form-control" placeholder="Search...">
				</div>
				<ul class="list-unstyled chat-list mt-2 mb-0">
					<li class="clearfix"><img
						src="/assets/avt-profile.png"
						alt="avatar">
						<div class="about">
							<div class="name">Nguyễn Chí Thanh</div>
							<div class="status">
								<i class="fa fa-circle offline"></i> Truy cập 7 phút trước
							</div>
						</div></li>
					<li class="clearfix active"><img
						src="/assets/avt-profile.png"
						alt="avatar">
						<div class="about">
							<div class="name">Nguyễn Chí Thanh</div>
							<div class="status">
								<i class="fa fa-circle online"></i> Vừa truy cập
							</div>
						</div></li>
					<li class="clearfix" style="display: flex; align-items: center;"><img
						src="/assets/avt-profile.png"
						alt="avatar">
						<div class="about">
							<div class="name">Nguyễn Chí Thanh</div>
							<div class="status">
								<i class="fa fa-circle online"></i> Vừa truy cập
							</div>
						</div></li>
							<li class="clearfix"><img
						src="/assets/avt-profile.png"
						alt="avatar">
						<div class="about">
							<div class="name">Nguyễn Chí Thanh</div>
							<div class="status">
								<i class="fa fa-circle offline"></i> Truy cập 10 giờ trước
							</div>
						</div></li>
					<li class="clearfix"><img
						src="/assets/avt-profile.png"
						alt="avatar">
						<div class="about">
							<div class="name">Nguyễn Chí Thanh</div>
							<div class="status">
								<i class="fa fa-circle online"></i> Vừa truy cập
							</div>
						</div></li>
					<li class="clearfix"><img
						src="/assets/avt-profile.png"
						alt="avatar">
						<div class="about">
							<div class="name">Nguyễn Chí Thanh</div>
							<div class="status">
								<i class="fa fa-circle offline"></i> Truy cập lần cuối 28/10
							</div>
						</div></li>
				</ul>
			</div>
    	</div>
    </div>
    
    <!-- content-area -->
    <div class="content-area col-9 bg-white">
        <div class="chat d-flex flex-column h-100">
			<div class="chat-header clearfix">
				<div class="row">
					<div class="col-lg-6" style="display: flex; align-items: center;">
    					<a href="javascript:void(0);" data-toggle="modal" data-target="#view_info">
        					<img src="/assets/avt-profile.png" alt="avatar" style="width: 50px; margin-right: 10px;">
    					</a>
    					<div class="chat-about">
        					<h6 class="m-b-0">Nguyễn Chí Thanh</h6>
        					<small>Truy cập 2 giờ trước</small>
    					</div>
					</div>

					<div class="col-lg-6 text-lg-end text-sm-start mt-lg-0 mt-sm-3">
						<a href="javascript:void(0);" class="btn btn-outline-info"><i class="fa fa-phone"></i></a>
						<a href="javascript:void(0);" class="btn btn-outline-secondary"><i
						class="fa fa-camera"></i></a> <a href="javascript:void(0);"
						class="btn btn-outline-primary"><i class="fa fa-image"></i></a>
						<a href="javascript:void(0);" class="btn btn-outline-info"><i
							class="fa fa-cogs"></i></a> <a href="javascript:void(0);"
							class="btn btn-outline-warning"><i class="fa fa-question"></i></a>
					</div>
				</div>
			</div>
			<div class="chat-history">
				<ul class="m-b-0">
					<li class="clearfix">
						<div class="message-data text-lg-end text-sm-start mt-lg-0 mt-sm-3">
							<span class="message-data-time">10:10 AM, Hôm nay</span> <img
								src="/assets/avt-profile.png"
								alt="avatar" style="width: 50px;">
						</div>
						<div class="message other-message float-right text-lg-end text-sm-start mt-lg-0 mt-sm-3">Chào</div>
					</li>
					<li class="clearfix">
						<div class="message-data">
							<span class="message-data-time">10:12 AM, Hôm nay</span>
						</div>
						<div class="message my-message">Chào</div>
					</li>
				</ul>
			</div>
			
			<div class="flex-grow-1"></div>
			
			<div class="chat-message clearfix">
            	<div class="input-group mb-0">
                	<input type="text" class="form-control" placeholder="Enter text here...">
                	<div class="input-group-append">
                    	<button class="btn btn-outline-secondary" type="button">
                        	<i class="fas fa-paper-plane fa-xs"></i>
                    	</button>
                	</div>
            	</div>
        	</div>
		</div>
    </div>
    
</div>
<script src="function.js"></script>
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript"></script>
</body>
</html>