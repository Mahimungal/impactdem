package com.example.serviceimple;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return  studentRepository.save(student);
	}
	
	
}
