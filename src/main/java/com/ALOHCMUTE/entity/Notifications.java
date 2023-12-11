package com.ALOHCMUTE.entity;

import java.io.Serializable;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity // đánh dấu đây là một entity được quản lý bởi JPA/Hibernate
@Data  // Một annotation từ Lombok, tạo getter, setter, toString, hashCode, và equals cho tất cả các trường
@AllArgsConstructor  // Tạo các constructor có tham số
@NoArgsConstructor  //  Tạo các constructor không tham số
@Table(name = "Notifications")  // Xác định tên bảng trong CSDL
public class Notifications implements Serializable {
    @Id // Đánh dấu trường notificationId là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Xác định cách sinh khóa chính tự động
    private int notificationId;
    @Column(columnDefinition = "nvarchar(2000)") // Định nghĩa thuộc tính cột trong cơ sở dữ liệu, trong trường này là kiểu nvarchar với độ dài tối đa là 2000 ký tự.
    private String activity;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private int receiverId;
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users users;
    
    @ManyToOne
    @JoinColumn(name = "postId")
    private Posts posts;
 public Posts getPosts() {
		return posts;
	}
	public void setPosts(Posts posts) {
		this.posts = posts;
	}
	// Thêm phương thức setter cho trường status
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    public void setUsersId(int userId ) {
        this.users.setUserId (userId);
    }
    public void setCreateTime(Date createTime ) {
        this.createTime = createTime;
    }
    public void setPostId(int postId ) {
        this.posts.setPostId (postId);
    }
}
