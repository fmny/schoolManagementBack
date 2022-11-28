package com.thales.dao;

import com.thales.model.School;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SchoolDao extends JpaRepository<School, Integer> {

}
