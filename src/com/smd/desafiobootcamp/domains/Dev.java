package com.smd.desafiobootcamp.domains;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	private String name;
	private Set<Content> registeredContent = new LinkedHashSet<>();
	private Set<Content> finishedContent = new LinkedHashSet<>();
	
	public Dev( ) { }
	
	public Dev(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getRegisteredContent() {
		return registeredContent;
	}

	public Set<Content> getFinishedContent() {
		return finishedContent;
	}
	
	public void registerBootcamp(Bootcamp bootcamp) {
		this.registeredContent.addAll(bootcamp.getContent());
		bootcamp.getDevs().add(this);
	}
	
	public void progress() {
		if(!this.registeredContent.isEmpty()) {
			Content content = this.registeredContent.stream().findFirst().get();
			
			this.finishedContent.add(content);
			this.registeredContent.remove(content);
		} else {
			System.err.println("You're not registered in a Bootcamp.");
		}
	}
	
	public Double calculateTotalXP() {
		return this.finishedContent.stream().mapToDouble(Content::calcularXP).sum();
	}

	@Override
	public int hashCode() {
		return Objects.hash(finishedContent, name, registeredContent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(finishedContent, other.finishedContent) && Objects.equals(name, other.name)
				&& Objects.equals(registeredContent, other.registeredContent);
	}

	@Override
	public String toString() {
		return "Dev [name=" + name + ", registeredContent=" + registeredContent + ", finishedContent=" + finishedContent
				+ "]";
	}
	
}
