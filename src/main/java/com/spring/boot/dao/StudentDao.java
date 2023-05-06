package com.spring.boot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entity.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Long>{

}
