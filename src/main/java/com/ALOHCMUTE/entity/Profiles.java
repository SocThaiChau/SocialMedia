package com.ALOHCMUTE.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profiles implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int profileId;
    private String avatar;
    private String background;

    @OneToOne
    @JoinColumn(name = "userId")
    private Users users;
}
