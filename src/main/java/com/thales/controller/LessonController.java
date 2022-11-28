package com.thales.controller;


import com.thales.dao.LessonDao;
import com.thales.model.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/lessons")
public class LessonController {
    @Autowired
    private LessonDao lessonDao;

    @GetMapping({"/", ""})
    public List<Lesson> getAll(){
      return this.lessonDao.findAll();
    }


    @GetMapping({"{id}/", "{id}"})
    public Lesson findOne(@PathVariable int id) {
        return this.lessonDao.findById(id).get();
    }


    @PostMapping({"/", ""})
    public void addLesson(@RequestBody Lesson lesson) {
        this.lessonDao.save(lesson);
    }


    @DeleteMapping({"{id}/", "{id}"})
    public void deleteLesson(@PathVariable int id) {
        this.lessonDao.deleteById(id);
    }

}
