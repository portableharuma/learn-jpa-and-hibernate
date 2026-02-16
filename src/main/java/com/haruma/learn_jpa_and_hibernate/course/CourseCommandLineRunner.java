package com.haruma.learn_jpa_and_hibernate.course;

import com.haruma.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.haruma.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;
    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "Haruma"));
        repository.insert(new Course(2, "Learn Azure", "Haruma"));
        repository.insert(new Course(3, "Learn Devops", "Haruma"));
        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
