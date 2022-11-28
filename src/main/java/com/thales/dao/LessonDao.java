package com.thales.dao;

import com.thales.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LessonDao extends JpaRepository<Lesson, Integer> {

}
