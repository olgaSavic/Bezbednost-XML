package com.ftn.micro3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Period 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	
	@NotNull
	@Size(min = 1, max = 20)
	private String fromDate ;
	
	@NotNull
	@Size(min = 1, max = 20)
	private String toDate ;
	
	@NotNull
	@OneToOne
	private Accomodation accomodation;

	public Period() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Period(Long id, @Size(min = 1, max = 20) String fromDate, @Size(min = 1, max = 20) String toDate) {
		super();
		this.id = id;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public Accomodation getAccomodation() {
		return accomodation;
	}

	public void setAccomodation(Accomodation accomodation) {
		this.accomodation = accomodation;
	}
	
	
	
	
}
