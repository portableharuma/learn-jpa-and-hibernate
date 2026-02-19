package com.haruma.learnjpaandhibernate.course.jpa;

import com.haruma.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Course course) {
        //All the values are already referenced through @Entity
        //This just connects the values of course into the entity manager.
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {
        entityManager.remove(findById(id));
    }

}
