package com.ALOHCMUTE.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Posts implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PostId")
    private int postId;
    
    @Column(name = "Content", columnDefinition = "nvarchar(2000)")
    private String content;
    
    @Column(name = "Image", columnDefinition = "nvarchar(2000)")
    private String image;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "PostTime")
    private Date postTime;
    
    @Column(name = "PrivacyLevel")
    private boolean privacyLevel;

    @ManyToOne
    @JoinColumn(name = "userId") // Tên cột foreign key trong bảng Comments
    private Users users;

    @OneToMany(mappedBy = "posts", cascade = CascadeType.ALL)
    private List<Likes> likes;

    @OneToMany(mappedBy = "comments", cascade = CascadeType.ALL)
    private List<Comments> comments;
}
