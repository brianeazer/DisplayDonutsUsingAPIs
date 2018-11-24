package com.extraPractice.Donut.model;

import java.util.List;

import javax.persistence.Entity;


public class Response {
	private Long count;
	private List<Donut> results;
	
	public Response() {
		
	}

	public Response(Long count, List<Donut> results) {
		super();
		this.count = count;
		this.results = results;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public List<Donut> getResults() {
		return results;
	}

	public void setResults(List<Donut> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Response [count=" + count + ", results=" + results + "]";
	}
	
	
}
