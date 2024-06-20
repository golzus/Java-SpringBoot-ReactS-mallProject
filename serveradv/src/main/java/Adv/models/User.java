package Adv.models;

import jakarta.persistence.*;
@Entity
@Table (name="app_user")
public class User{
	@Id
	private String email;
	@Column
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

