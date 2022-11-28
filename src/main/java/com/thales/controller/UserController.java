package com.thales.controller;


import com.thales.dao.UserDao;
import com.thales.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping({"/", ""})
    public List<User> getAll(){
      return this.userDao.findAll();
    }


    @GetMapping({"{id}/", "{id}"})
    public User findOne(@PathVariable int id) {
        return this.userDao.findById(id).get();
    }

    @PostMapping({"/", ""})
    public void addTeacher(@RequestBody User user) {
        this.userDao.save(user);
    }


    @DeleteMapping({"{id}/", "{id}"})
    public void deleteUser(@PathVariable int id) {
        this.userDao.deleteById(id);
    }

}
