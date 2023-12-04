package com.ALOHCMUTE.entity;
import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@Entity
//@Table(name="Userabc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long acountId;
	@Column(name="username", columnDefinition = "nvarchar(200)")
	private String username;
	private String password;

}
