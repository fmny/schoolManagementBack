package com.thales.controller;


import com.thales.dao.ClassRoomDao;
import com.thales.model.ClassRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/classrooms")
public class ClassRoomController {
    @Autowired
    private ClassRoomDao classRoomDao;

    @GetMapping({"/", ""})
    public List<ClassRoom> getAll(){
      return this.classRoomDao.findAll();
    }


    @GetMapping({"{id}/", "{id}"})
    public ClassRoom findOne(@PathVariable int id) {
        return this.classRoomDao.findById(id).get();
    }


    @PostMapping({"/", ""})
    public void addClassRoom(@RequestBody ClassRoom classRoom) {
        this.classRoomDao.save(classRoom);
    }


    @DeleteMapping({"{id}/", "{id}"})
    public void deleteClassRoom(@PathVariable int id) {
        this.classRoomDao.deleteById(id);
    }

}
