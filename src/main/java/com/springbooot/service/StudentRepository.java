package com.springbooot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbooot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
