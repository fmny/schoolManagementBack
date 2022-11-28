package com.thales.controller;


import com.thales.dao.SchoolDao;
import com.thales.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/schools")
public class SchoolController {
    @Autowired
    private SchoolDao schoolDao;

    @GetMapping({"/", ""})
    public List<School> getAll(){
      return this.schoolDao.findAll();
    }


    @GetMapping({"{id}/", "{id}"})
    public School findOne(@PathVariable int id) {
        return this.schoolDao.findById(id).get();
    }

    @PostMapping({"/", ""})
    public void addSchool(@RequestBody School school) {
        this.schoolDao.save(school);
    }


    @DeleteMapping({"{id}/", "{id}"})
    public void deleteSchool(@PathVariable int id) {
        this.schoolDao.deleteById(id);
    }

}
