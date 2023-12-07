<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!-- comment.jsp -->

<!-- Comments Section -->
<div class="comments mt-3 ms-4 me-5">
    <%-- <c:forEach var="comment" items="${comments}">
        <div>
            <p>${comment.users.username}: ${comment.content}</p>
        </div>
    </c:forEach> --%>
    
    <!-- Display existing comments -->
    <div class="comment">
        <strong>John Doe:</strong> Nice picture!
    </div>
    <div class="comment">
        <strong>Jane Smith:</strong> I wish I could be there.
    </div>

    <!-- Form for adding new comments -->
    <form class="comment-form mt-3" action="/comments/add-comment" method="post" enctype="multipart/form-data">
        <div class="mb-3">
            <textarea class="form-control" rows="3" id="writePost" name="content" placeholder="Viết bình luận..."></textarea>
        </div>
        <div class="mb-3">
        <input type="file" class="form-control" id="image" name="image">
    	</div>
        <hr class="mb-3">
        <button type="submit" class="btn btn-primary writeComment__btnComment mb-3 justify-content-between">Post Comment</button>
    </form>
</div>
