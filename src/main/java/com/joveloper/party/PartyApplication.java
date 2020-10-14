package com.joveloper.party;

import com.joveloper.party.model.Person;
import com.joveloper.party.repository.PartyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The main class for the party application.
 *
 * @author hrishikeshjoshi
 * @since 0.1
 */
@SpringBootApplication
public class PartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartyApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(final PartyRepository pr) {
		return args -> {
			Person p = pr.findByFirstNameAndLastName("Hrishikesh","Joshi");
			if (p == null)
				pr.save(new Person("Hrishikesh", "Joshi"));
		};
	}

}
