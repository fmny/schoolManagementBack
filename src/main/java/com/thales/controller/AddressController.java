package com.thales.controller;

import com.thales.dao.AddressDao;

import com.thales.model.Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()

@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressDao addressDao;

    @GetMapping({"/", ""})
    public List<Address> getAll(){
      return this.addressDao.findAll();
    }


    @GetMapping({"{id}/", "{id}"})
    public Address findOne(@PathVariable int id) {
        return this.addressDao.findById(id).get();
    }


    @PostMapping({"/", ""})
    public void addAddress(@RequestBody Address address) {
        this.addressDao.save(address);
    }

    @DeleteMapping({"{id}/", "{id}"})
    public void deleteAddress(@PathVariable int id) {
        this.addressDao.deleteById(id);
    }

}
