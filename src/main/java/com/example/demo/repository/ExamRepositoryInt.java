package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ExamModel;

public interface ExamRepositoryInt extends JpaRepository<ExamModel, Long> {

	
}
