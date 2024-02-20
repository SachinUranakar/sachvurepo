package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
public class Location {
	@Id
	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
   // @Field(name ="locationmark")
	private String locationmark;
	public String getLocation_mark() {
		return locationmark;
	}

	public void setLocation_mark(String location_mark) {
		this.locationmark = location_mark;
	}

}
