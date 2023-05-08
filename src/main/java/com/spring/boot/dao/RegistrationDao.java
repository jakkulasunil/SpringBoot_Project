package com.spring.boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.entity.Registration;

public interface RegistrationDao extends CrudRepository<Registration, Long>{

}
