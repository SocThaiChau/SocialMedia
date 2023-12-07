package com.ALOHCMUTE.entity;

import java.io.Serializable;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Messages")
public class Messages implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int messageId;
    @Column(columnDefinition = "nvarchar(2000)")
    private String content;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private int receiverId;
    private Boolean status;
    private String messageType;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users users;
}
