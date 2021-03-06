package com.nunoRest.Model;

import javax.persistence.*;

@Entity
@Table(name = "public.User")
public class User {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "password")
	private String password;

	public User() {}

	public User(Long id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "User [id=]" + id + ",name=" + name + ", password="
	+ password +"]";
	}
	

}
