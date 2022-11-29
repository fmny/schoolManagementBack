package com.thales.controller;


import com.thales.dao.CourseDao;
import com.thales.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/courses")
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {
    @Autowired
    private CourseDao courseDao;

    @GetMapping({"/", ""})
    public List<Course> getAll(){
      return this.courseDao.findAll();
    }


    @GetMapping({"{id}/", "{id}"})
    public Course findOne(@PathVariable int id) {
        return this.courseDao.findById(id).get();
    }


    @PostMapping({"/", ""})
    public void addCourse(@RequestBody Course course) {
        this.courseDao.save(course);
    }


    @DeleteMapping({"{id}/", "{id}"})
    public void deleteCourse(@PathVariable int id) {
        this.courseDao.deleteById(id);
    }

}
