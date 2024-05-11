package com.smd.desafiobootcamp.domains;

public class Course extends Content {

	private Integer duration;
	
	public Course() {
		super();
	}
	
	public Course(String title, String description, Integer duration) {
		super(title, description);
		this.duration = duration;
	}
		
	public Integer getDuration() {
		return duration;
	}
	
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [title=" + super.getTitle() + ", description=" + super.getDescription() + ", duration=" + duration + "]";
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO * duration;
	}
	
}
