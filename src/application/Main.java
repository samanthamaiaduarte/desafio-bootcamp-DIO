package application;

import java.time.LocalDate;

import com.smd.desafiobootcamp.domains.Bootcamp;
import com.smd.desafiobootcamp.domains.Content;
import com.smd.desafiobootcamp.domains.Course;
import com.smd.desafiobootcamp.domains.Dev;
import com.smd.desafiobootcamp.domains.Mentoring;

public class Main {

	public static void main(String[] args) {
		/*Creating content*/
		Content java = new Course("Java Backend", "Java for backend dev", 8);
		Content javascript = new Course("Javascript Backend", "Javascript for backend dev", 10);
		Content javaMentoring = new Mentoring("Java Mentoring", "Topic about java development", LocalDate.of(2024, 6, 1));
		Content jsMentoring = new Mentoring("Javascript Mentoring", "Topic about javascript development", LocalDate.of(2024, 5, 31));
		
		/*Creating bootcamp and adding content at it*/
		Bootcamp bootcampBackend = new Bootcamp("Dev Backend", "Be a backend dev", LocalDate.of(2004, 5, 13));
		bootcampBackend.addContent(java);
		bootcampBackend.addContent(javaMentoring);
		bootcampBackend.addContent(javascript);
		bootcampBackend.addContent(jsMentoring);
		
		System.out.println(bootcampBackend);
		
		/*Creating Devs*/
		Dev mariaGreen = new Dev("Maria Green");
		Dev alexBrown = new Dev("Alex Brown");
		Dev johnGrey = new Dev("John Grey");
		
		/*Registering Devs in the bootcamp*/
		mariaGreen.registerBootcamp(bootcampBackend);
		alexBrown.registerBootcamp(bootcampBackend);
		johnGrey.registerBootcamp(bootcampBackend);
		
		System.out.println(bootcampBackend.getDevs());

		System.out.println();
		
		System.out.println("Maria:");
		System.out.println(mariaGreen);
		mariaGreen.progress();
		System.out.println(mariaGreen);
		System.out.println("Maria's XP now: " + mariaGreen.calculateTotalXP());
		mariaGreen.progress();
		System.out.println(mariaGreen);
		System.out.println("Maria's XP now: " + mariaGreen.calculateTotalXP());

		System.out.println();
		
		System.out.println("Alex:");
		System.out.println(alexBrown);
		alexBrown.progress();
		System.out.println(alexBrown);
		System.out.println("Alex's XP now: " + alexBrown.calculateTotalXP());
		alexBrown.progress();
		System.out.println(alexBrown);
		System.out.println("Alex's XP now: " + alexBrown.calculateTotalXP());
		alexBrown.progress();
		System.out.println(alexBrown);
		System.out.println("Alex's XP now: " + alexBrown.calculateTotalXP());

		System.out.println();
		
		System.out.println("John:");
		System.out.println(johnGrey);
		johnGrey.progress();
		System.out.println(johnGrey);
		System.out.println("John's XP now: " + johnGrey.calculateTotalXP());
	}
}

