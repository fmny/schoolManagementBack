package com.thales.dao;

import com.thales.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CourseDao extends JpaRepository<Course, Integer> {
    public long countBySchool_id(Integer schoolId);


}
