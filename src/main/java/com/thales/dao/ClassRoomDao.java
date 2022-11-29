package com.thales.dao;


import com.thales.model.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ClassRoomDao extends JpaRepository<ClassRoom, Integer> {

    public long countBySchool_id(Integer schoolId);

}
