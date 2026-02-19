package com.haruma.learnjpaandhibernate.course;

import com.haruma.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.haruma.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJpaRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS", "Haruma"));
        repository.save(new Course(2, "Learn Azure", "Haruma"));
        repository.save(new Course(3, "Learn Devops", "Haruma"));
        repository.deleteById(1L);

        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("Haruma"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("Learn AWS"));
        System.out.println(repository.findByName("Learn Azure"));

    }
}
