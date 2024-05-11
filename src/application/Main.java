package application;

import java.time.LocalDate;

import com.smd.desafiobootcamp.domains.Content;
import com.smd.desafiobootcamp.domains.Course;
import com.smd.desafiobootcamp.domains.Mentoring;

public class Main {

	public static void main(String[] args) {
		Content java = new Course("Java Backend", "Java for backend dev", 8);
		Content javascript = new Course("Javascript Backend", "Javascript for backend dev", 10);
		
		System.out.println(java);
		System.out.println(javascript);
		
		Content javaMentoring = new Mentoring("Java Mentoring", "Topic about java development", LocalDate.of(2024, 6, 1));
		Content jsMentoring = new Mentoring("Javascript Mentoring", "Topic about javascript development", LocalDate.of(2024, 5, 31));

		System.out.println(javaMentoring);
		System.out.println(jsMentoring);
		
	}
}
