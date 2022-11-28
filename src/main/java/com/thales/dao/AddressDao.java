package com.thales.dao;

import com.thales.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressDao extends JpaRepository<Address, Integer> {

}
