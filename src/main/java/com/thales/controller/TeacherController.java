package com.thales.controller;


import com.thales.dao.TeacherDao;
import com.thales.model.Course;
import com.thales.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/teachers")
@CrossOrigin(origins = "http://localhost:4200")
public class TeacherController {
    @Autowired
    private TeacherDao teacherDao;

    @GetMapping({"/", ""})
    public List<Teacher> getAll(){
      return this.teacherDao.findAll();
    }

    @GetMapping({"count/{id}/", "count/{id}"})
    public long contBySchool(@PathVariable Integer id){
        return this.teacherDao.countBySchool_id(id);
    }

    @GetMapping({"find/{id}/", "find/{id}"})
    public List<Teacher> findBySchool(@PathVariable Integer id){
        return this.teacherDao.findBySchool_id(id);
    }

    @GetMapping({"{id}/", "{id}"})
    public Teacher findOne(@PathVariable int id) {
        return this.teacherDao.findById(id).get();
    }


    @PostMapping({"/", ""})
    public void addTeacher(@RequestBody Teacher teacher) {
        this.teacherDao.save(teacher);
    }


    @DeleteMapping({"{id}/", "{id}"})
    public void deleteTeacher(@PathVariable int id) {
        this.teacherDao.deleteById(id);
    }

}
