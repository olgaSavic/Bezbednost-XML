package com.ftn.micro3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Client 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 1, max = 20)
	@Column(unique = true, nullable = false)
	private String username;

	@Size(min = 3, max = 20)
	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String email;
	
	private String type;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(@Size(min = 1, max = 20) String username, @Size(min = 3, max = 20) String password, String email,
			String type) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
