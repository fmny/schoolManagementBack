package com.thales.dao;


import com.thales.model.School;
import com.thales.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TeacherDao extends JpaRepository<Teacher, Integer> {
    public long countBySchool_id(Integer schoolId);

}
