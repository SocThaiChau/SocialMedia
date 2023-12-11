package com.ALOHCMUTE.model;

import java.util.Date;
import lombok.*;
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
	private int userId;
	private String userName;
	private String address;
	private String email;
	private String phone;
	private String gender;
	private Date dob;
	private boolean status;
	private String password;
}
