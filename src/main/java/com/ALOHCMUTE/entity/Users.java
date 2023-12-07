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
@Table(name ="Users")
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private int userId;
    
    @Column(name = "UserName", columnDefinition = "nvarchar(200)")
    private String userName;
    
    @Column(name = "Address", columnDefinition = "nvarchar(200)")
    private String address;
    
    @Column(name = "Email", columnDefinition = "nvarchar(200)")
    private String email;
    
    @Column(name = "Phone", columnDefinition = "nvarchar(200)")
    private String phone;
    
    @Column(name = "Gender", columnDefinition = "nvarchar(200)")
    private String gender;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "Dob", columnDefinition = "nvarchar(200)")
    private Date dob;
    
    @Column(name = "Status")
    private boolean status;
    
    @Column(name = "Password", columnDefinition = "nvarchar(200)")
    private String password;


    @OneToOne(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private Profiles profiles;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Comments> comments;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Posts> posts;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Likes> likes;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Messages> messages;
}
