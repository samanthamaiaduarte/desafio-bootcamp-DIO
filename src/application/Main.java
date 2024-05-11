package application;

import java.time.LocalDate;

import com.smd.desafiobootcamp.domains.Course;
import com.smd.desafiobootcamp.domains.Mentoring;

public class Main {

	public static void main(String[] args) {
		/*
		Course java = new Course();
		java.setTitle("Java Backend");
		java.setDescription("Java for backend dev");
		java.setDuration(8);
		*/
		Course java = new Course("Java Backend", "Java for backend dev", 8);
		
		Course javascript = new Course();
		javascript.setTitle("Javascript Backend");
		javascript.setDescription("Javascript for backend dev");
		javascript.setDuration(10);
		
		System.out.println(java);
		System.out.println(javascript);
		
		Mentoring javaMentoring = new Mentoring("Java Mentoring", "Topic about java development", LocalDate.of(2024, 6, 1));
		
		Mentoring jsMentoring = new Mentoring();
		jsMentoring.setTitle("Javascript Mentoring");
		jsMentoring.setDescription("Topic about javascript development");
		jsMentoring.setDate(LocalDate.of(2024, 5, 31));

		System.out.println(javaMentoring);
		System.out.println(jsMentoring);
		
	}
}
