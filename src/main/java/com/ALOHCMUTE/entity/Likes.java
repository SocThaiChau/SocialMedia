package com.ALOHCMUTE.entity;

import java.io.Serializable;
import java.util.Optional;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Likes")
public class Likes implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LikeId")
    private int likeId;
    

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Posts posts;

	/**
	 * @return the likeId
	 */
	public int getLikeId() {
		return likeId;
	}

	/**
	 * @param likeId the likeId to set
	 */
	public void setLikeId(int likeId) {
		this.likeId = likeId;
	}

	/**
	 * @return the users
	 */
	public Users getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Users users) {
		this.users = users;
	}

	/**
	 * @return the posts
	 */
	public Posts getPosts() {
		return posts;
	}

	/**
	 * @param posts the posts to set
	 */
	public void setPosts(Posts posts) {
		this.posts = posts;
	}
    
    
}
