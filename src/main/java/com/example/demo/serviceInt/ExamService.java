package com.example.demo.serviceInt;

import com.example.demo.dto.ExamDto;
import com.example.demo.model.ExamModel;

public interface ExamService {

   ExamModel saveExam(ExamDto examDto);
}
