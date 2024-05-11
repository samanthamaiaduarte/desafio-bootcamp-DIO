package com.smd.desafiobootcamp.domains;

import java.time.LocalDate;

public class Mentoring extends Content {
	private LocalDate date;
	
	public Mentoring() {
		super();
	}
	
	public Mentoring(String title, String description, LocalDate date) {
		super(title, description);
		this.date = date;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Mentoring [title=" + super.getTitle() + ", description=" + super.getDescription() + ", date=" + date + "]";
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20;
	}
	
}
