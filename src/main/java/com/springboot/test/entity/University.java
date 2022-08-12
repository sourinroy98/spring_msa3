package com.springboot.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="uni_details")
public class University 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int total_clg;
	
	public University() {
		super();
	}

	public University(int id, String name, int total_clg) {
		super();
		this.id = id;
		this.name = name;
		this.total_clg = total_clg;
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

	public int getTotal_clg() {
		return total_clg;
	}

	public void setTotal_clg(int total_clg) {
		this.total_clg = total_clg;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", total_clg=" + total_clg + "]";
	}
	
	

}
