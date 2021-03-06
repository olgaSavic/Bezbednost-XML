package com.ftn.micro2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class AdditionalServices 
{
	@NotNull
	@Column
	private String name ;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	public AdditionalServices() 
	{
		
	}
	

	public AdditionalServices(Long id, @NotNull String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}



}
