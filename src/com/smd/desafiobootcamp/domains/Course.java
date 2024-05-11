package com.smd.desafiobootcamp.domains;

public class Course {
	private String title;
	private String description;
	private Integer duration;
	
	public Course() { }
	
	public Course(String title, String description, Integer duration) {
		this.title = title;
		this.description = description;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getDuration() {
		return duration;
	}
	
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", description=" + description + ", duration=" + duration + "]";
	}
	
}
