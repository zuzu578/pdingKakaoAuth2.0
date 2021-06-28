package com.mycompany.mypudingapp.dto;

public class UserDto 
{
	private String id;
	private String email;
	private String gender;
	private String nickname;
	
	public UserDto() {
		
	}
	

	public UserDto(String id, String email, String gender, String nickname) {
		super();
		this.id = id;
		this.email = email;
		this.gender = gender;
		this.nickname = nickname;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	@Override
	public String toString() {
		return "UserDto [id=" + id + ", email=" + email + ", gender=" + gender + ", nickname=" + nickname + ", getId()="
				+ getId() + ", getEmail()=" + getEmail() + ", getGender()=" + getGender() + ", getNickname()="
				+ getNickname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
