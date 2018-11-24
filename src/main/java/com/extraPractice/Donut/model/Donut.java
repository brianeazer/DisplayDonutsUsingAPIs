package com.extraPractice.Donut.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Donut {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String ref;
	private String name;
	
	public Donut() {
		
	}
	
	public Donut(Long id, String ref, String name) {
		super();
		this.id = id;
		this.ref = ref;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Donut [id=" + id + ", ref=" + ref + ", name=" + name + "]";
	}
	
	
}
