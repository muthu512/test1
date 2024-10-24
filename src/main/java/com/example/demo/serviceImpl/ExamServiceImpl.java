package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ExamDto;
import com.example.demo.model.ExamModel;
import com.example.demo.repository.ExamRepositoryInt;
import com.example.demo.repositoryImpl.ExamRepositoryImpl;
import com.example.demo.serviceInt.ExamService;

@Service
public class ExamServiceImpl implements ExamService{

	@Autowired
	private ExamRepositoryImpl examRepositoryImpl;
	@Override
	public ExamModel saveExam(ExamDto examDto) {
		 
		ExamModel examModel = new ExamModel();
		
		examModel.setId(examDto.getId());
		examModel.setName(examDto.getName());
		
		return examRepositoryImpl.save(examModel);
	}

	
}
