package com.thales.dao;


import com.thales.model.ClassRoom;
import com.thales.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface GradeDao extends JpaRepository<Grade, Integer> {

    public long countBySchool_id(Integer schoolId);

    public List<Grade> findBySchool_id(Integer schoolId);

}
