package com.JNITRoster.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_credentials")
public class login implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;
	private String email;
	private Account_Type account_type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Account_Type getAccount_type() {
		return account_type;
	}
	public void setAccount_type(Account_Type account_type) {
		this.account_type = account_type;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		login other = (login) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
