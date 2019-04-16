package com.springbooot.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Student {
	
	@Id
	@NotNull
	private int id;
	
	private String name;
	
	private String institution;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", institution=" + institution + "]";
	}
	
	
	

}
