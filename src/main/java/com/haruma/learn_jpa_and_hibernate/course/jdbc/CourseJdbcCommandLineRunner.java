package com.haruma.learn_jpa_and_hibernate.course.jdbc;

import com.haruma.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "Haruma"));
        repository.insert(new Course(2, "Learn Azure", "Haruma"));
        repository.insert(new Course(3, "Learn Devops", "Haruma"));

    }
}
