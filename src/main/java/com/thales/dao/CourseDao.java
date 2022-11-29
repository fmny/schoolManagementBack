package com.thales.dao;

import com.thales.model.ClassRoom;
import com.thales.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CourseDao extends JpaRepository<Course, Integer> {
    public long countBySchool_id(Integer schoolId);

    public List<Course> findBySchool_id(Integer schoolId);

}
