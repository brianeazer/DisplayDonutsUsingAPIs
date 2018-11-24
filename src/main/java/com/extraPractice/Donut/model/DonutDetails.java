package com.extraPractice.Donut.model;

import java.util.List;

public class DonutDetails {
	private Long id;
	private String ref;
	private String name;
	private Integer calories;
	private List<String> extras;
	private String photo;
	private String photo_attribution;
	
	DonutDetails(){
	
	}

	public DonutDetails(Long id, String ref, String name, Integer calories, List<String> extras, String photo,
			String photo_attribution) {
		super();
		this.id = id;
		this.ref = ref;
		this.name = name;
		this.calories = calories;
		this.extras = extras;
		this.photo = photo;
		this.photo_attribution = photo_attribution;
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

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public List<String> getExtras() {
		return extras;
	}

	public void setExtras(List<String> extras) {
		this.extras = extras;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPhoto_attribution() {
		return photo_attribution;
	}

	public void setPhoto_attribution(String photo_attribution) {
		this.photo_attribution = photo_attribution;
	}

	@Override
	public String toString() {
		return "DonutDetails [id=" + id + ", ref=" + ref + ", name=" + name + ", calories=" + calories + ", extras="
				+ extras + ", photo=" + photo + ", photo_attribution=" + photo_attribution + "]";
	}
	
	
}

