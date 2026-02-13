package com.haruma.learn_jpa_and_hibernate;

import com.haruma.learn_jpa_and_hibernate.course.jdbc.CourseJdbcCommandLineRunner;
import com.haruma.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJpaAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaAndHibernateApplication.class, args);
	}

}
