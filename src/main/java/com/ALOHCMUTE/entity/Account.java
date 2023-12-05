package com.ALOHCMUTE.entity;
import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acountId;
	@Column(name="username", columnDefinition = "nvarchar(200)")
	private String username;
	private String password;

	@OneToOne
	@JoinColumn(name = "userId")
	private Users users;

}
