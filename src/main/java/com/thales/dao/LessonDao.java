package com.thales.dao;

import com.thales.model.Grade;
import com.thales.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface LessonDao extends JpaRepository<Lesson, Integer> {

    public List<Lesson> findByGrade_id(Integer gradeId);
}
