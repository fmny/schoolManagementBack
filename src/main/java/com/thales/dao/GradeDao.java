package com.thales.dao;


import com.thales.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GradeDao extends JpaRepository<Grade, Integer> {


}
