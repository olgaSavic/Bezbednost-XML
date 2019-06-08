package com.ftn.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


;

@Entity
@Table

public class Message implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	private User sender;

	@OneToOne
	private Agent recipient;

	@OneToOne
	private Response response;
	
	private Long idCore;
	
	private String text;



	public Message() {
		// TODO Auto-generated constructor stub
	}


	
	
	
	public Message(Long id, User sender, Agent recipient, Response response, Long idCore, String text) {
		super();
		this.id = id;
		this.sender = sender;
		this.recipient = recipient;
		this.response = response;
		this.idCore = idCore;
		this.text = text;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public User getSender() {
		return sender;
	}


	public void setSender(User sender) {
		this.sender = sender;
	}


	public Agent getRecipient() {
		return recipient;
	}


	public void setRecipient(Agent recipient) {
		this.recipient = recipient;
	}


	public Response getResponse() {
		return response;
	}


	public void setResponse(Response response) {
		this.response = response;
	}


	public Long getIdCore() {
		return idCore;
	}


	public void setIdCore(Long idCore) {
		this.idCore = idCore;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}

	
	
}