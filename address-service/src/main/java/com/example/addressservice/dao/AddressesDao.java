package com.example.addressservice.dao;

import com.example.addressservice.ds.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressesDao extends CrudRepository<Address,Integer> {
}
