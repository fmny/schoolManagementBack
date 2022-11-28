package com.thales.controller;


import com.thales.dao.GradeDao;
import com.thales.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/grades")
public class GradeController {
    @Autowired
    private GradeDao gradeDao;

    @GetMapping({"/", ""})
    public List<Grade> getAll(){
      return this.gradeDao.findAll();
    }


    @GetMapping({"{id}/", "{id}"})
    public Grade findOne(@PathVariable int id) {
        return this.gradeDao.findById(id).get();
    }


    @PostMapping({"/", ""})
    public void addCourse(@RequestBody Grade grade) {
        this.gradeDao.save(grade);
    }


    @DeleteMapping({"{id}/", "{id}"})
    public void deleteGrade(@PathVariable int id) {
        this.gradeDao.deleteById(id);
    }

}