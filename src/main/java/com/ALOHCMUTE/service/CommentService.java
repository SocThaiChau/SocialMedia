package com.ALOHCMUTE.service;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ALOHCMUTE.entity.Comments;
import com.ALOHCMUTE.entity.Posts;
import com.ALOHCMUTE.entity.Users;
import com.ALOHCMUTE.repository.CommentRepository;

@Service
public class CommentService{
	
	@Autowired
    private CommentRepository commentsRepository;

    public List<Comments> findAll() {
        return commentsRepository.findAll();
    }

    public List<Comments> getCommentById(int commentId) {
    	return commentsRepository.findById(commentId);
    }

    public void saveComment(Comments comment) {
        comment.setCreateTime(new Date());
        commentsRepository.save(comment);
    }
}
