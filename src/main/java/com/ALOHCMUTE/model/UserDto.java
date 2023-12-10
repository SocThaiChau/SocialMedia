package com.ALOHCMUTE.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {


	private String email;
    private String userName;
    private String password;
    private String CheckPass;


	public UserDto(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }


}
