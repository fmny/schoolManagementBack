package com.thales.dao;


import com.thales.model.ClassRoom;
import com.thales.model.Grade;
import com.thales.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface GradeDao extends JpaRepository<Grade, Integer> {

    public long countBySchool_id(Integer schoolId);

    public List<Grade> findBySchool_id(Integer schoolId);

    //TODO ajouter méthode qui sauvegarde une grade avec un teacher (celui de la comboBox)
    //public Teacher findByGrade_id(Integer gradeId );
    //public Teacher findByGrade(Teacher teacher );


}
