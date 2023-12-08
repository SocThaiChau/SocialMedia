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
    
    <link href="/template/message.css" rel="stylesheet">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>

<body>
<!-- content-area------------ -->
<div class="row bg-light">
    <!-- leftSidebar -->
    <div class="leftSidebar offset-1 col-3">
        <div class="card chat-app">
			<div id="plist" class="people-list">
				<h4 class="mt-3">Tin nhắn</h4>
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"><i class="fa fa-search"></i></span>
					</div>
					<input type="text" class="form-control" placeholder="Search...">
				</div>
				<ul class="list-unstyled chat-list mt-2 mb-0">
					<li class="clearfix mt-3" style="display: flex; align-items: center;"><img
						src="https://bootdey.com/img/Content/avatar/avatar1.png"
						alt="avatar" style="width: 50px; margin-right: 10px;">
						<div class="about">
							<div class="name">Vincent Porter</div>
							<div class="status">
								<i class="fa fa-circle offline"></i> left 7 mins ago
							</div>
						</div></li>
					<li class="clearfix active mt-3" style="display: flex; align-items: center;"><img
						src="https://bootdey.com/img/Content/avatar/avatar2.png"
						alt="avatar" style="width: 50px; margin-right: 10px;">
						<div class="about">
							<div class="name">Aiden Chavez</div>
							<div class="status">
								<i class="fa fa-circle online"></i> online
							</div>
						</div></li>
					<li class="clearfix mt-3" style="display: flex; align-items: center;"><img
						src="https://bootdey.com/img/Content/avatar/avatar3.png"
						alt="avatar" style="width: 50px; margin-right: 10px;">
						<div class="about">
							<div class="name">Mike Thomas</div>
							<div class="status">
								<i class="fa fa-circle online"></i> online
							</div>
						</div></li>
							<li class="clearfix mt-3" style="display: flex; align-items: center;"><img
						src="https://bootdey.com/img/Content/avatar/avatar7.png"
						alt="avatar" style="width: 50px; margin-right: 10px;">
						<div class="about">
							<div class="name">Christian Kelly</div>
							<div class="status">
								<i class="fa fa-circle offline"></i> left 10 hours ago
							</div>
						</div></li>
					<li class="clearfix mt-3" style="display: flex; align-items: center;"><img
						src="https://bootdey.com/img/Content/avatar/avatar8.png"
						alt="avatar" style="width: 50px; margin-right: 10px;">
						<div class="about">
							<div class="name">Monica Ward</div>
							<div class="status">
								<i class="fa fa-circle online"></i> online
							</div>
						</div></li>
					<li class="clearfix mt-3" style="display: flex; align-items: center;"><img
						src="https://bootdey.com/img/Content/avatar/avatar3.png"
						alt="avatar" style="width: 50px; margin-right: 10px;">
						<div class="about">
							<div class="name">Dean Henry</div>
							<div class="status">
								<i class="fa fa-circle offline"></i> offline since Oct 28
							</div>
						</div></li>
				</ul>
			</div>
    	</div>
    </div>
    
    <!-- content-area -->
    <div class="content-area col-7 mt-4 bg-white" style="max-height: 600px;">
        <div class="chat d-flex flex-column h-100">
			<div class="chat-header clearfix">
				<div class="row">
					<div class="col-lg-6" style="display: flex; align-items: center;">
    					<a href="javascript:void(0);" data-toggle="modal" data-target="#view_info">
        					<img src="https://bootdey.com/img/Content/avatar/avatar2.png" alt="avatar" style="width: 50px; margin-right: 10px;">
    					</a>
    					<div class="chat-about">
        					<h6 class="m-b-0">Aiden Chavez</h6>
        					<small>Last seen: 2 hours ago</small>
    					</div>
					</div>

					<div class="col-lg-6 text-lg-end text-sm-start mt-lg-0 mt-sm-3">
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
							<span class="message-data-time">10:10 AM, Today</span> <img
								src="https://bootdey.com/img/Content/avatar/avatar7.png"
								alt="avatar" style="width: 50px;">
						</div>
						<div class="message other-message float-right text-lg-end text-sm-start mt-lg-0 mt-sm-3">Hi Aiden,
							how are you? How is the project coming along?</div>
					</li>
					<li class="clearfix">
						<div class="message-data">
							<span class="message-data-time">10:12 AM, Today</span>
						</div>
						<div class="message my-message">Are we meeting today?</div>
					</li>
					<li class="clearfix">
						<div class="message-data">
							<span class="message-data-time">10:15 AM, Today</span>
						</div>
						<div class="message my-message">Project has been already
							finished and I have results to show you.</div>
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