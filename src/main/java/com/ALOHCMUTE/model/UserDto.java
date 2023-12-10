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


	public UserDto() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}


	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the checkPass
	 */
	public String getCheckPass() {
		return CheckPass;
	}


	/**
	 * @param checkPass the checkPass to set
	 */
	public void setCheckPass(String checkPass) {
		CheckPass = checkPass;
	}


	


}
