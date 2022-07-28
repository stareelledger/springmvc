package com.spring.flightproject.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.flightproject.user.entities.User;

public interface UserRepository extends CrudRepository<User ,Integer>{

}
