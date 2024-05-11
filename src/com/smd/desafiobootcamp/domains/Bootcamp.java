package com.smd.desafiobootcamp.domains;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String name;
	private String description;
	private final LocalDate startDate;
	private final LocalDate finalDate;
	private Set<Content> contents = new LinkedHashSet<>();
	private Set<Dev> devs = new HashSet<>();
	
	public Bootcamp() {
		this.startDate = LocalDate.now();
		this.finalDate = startDate.plusDays(45);
		
	}
	
	public Bootcamp(String name, String description, LocalDate startDate) {
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.finalDate = startDate.plusDays(45);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getFinalDate() {
		return finalDate;
	}

	public Set<Content> getContent() {
		return contents;
	}

	public Set<Dev> getDevs() {
		return devs;
	}
	
	public void addContent(Content content) {
		this.contents.add(content);
	}

	@Override
	public int hashCode() {
		return Objects.hash(contents, description, devs, finalDate, name, startDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(description, other.description)
				&& Objects.equals(devs, other.devs) && Objects.equals(finalDate, other.finalDate)
				&& Objects.equals(name, other.name) && Objects.equals(startDate, other.startDate);
	}

	@Override
	public String toString() {
		return "Bootcamp [name=" + name + ", description=" + description + ", startDate=" + startDate + ", finalDate="
				+ finalDate + ", content=" + contents + "]";
	}
	
}
