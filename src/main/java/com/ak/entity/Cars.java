package com.ak.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cars {
	@Id
	private int id;
	private String name;
	
	public Cars() {}
	
	
	
	@Override
	public String toString() {
		return "Cars [id=" + id + ", name=" + name + "]";
	}




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




	public Cars(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
