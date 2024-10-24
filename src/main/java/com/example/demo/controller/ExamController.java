package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ExamDto;
import com.example.demo.model.ExamModel;
import com.example.demo.serviceInt.ExamService;

@RestController
public class ExamController {
	
	@Autowired
	private ExamService examService;

	@GetMapping("/get")
	public String getexam() {
		return"WELCOME";
	}
	
	@PostMapping("/save")
	public ExamModel saveExam(@RequestBody ExamDto examDto) {
		return examService.saveExam(examDto);
	}
}
