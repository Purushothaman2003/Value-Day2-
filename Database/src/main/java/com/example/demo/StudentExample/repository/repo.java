package com.example.demo.StudentExample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.StudentExample.model.model;

@Repository
public interface repo extends JpaRepository<model, Integer>{
	
	@Override
	List<model>findAll();
	
}
