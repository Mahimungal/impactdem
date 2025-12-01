package com.example.demo.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImple  implements StudentService{
	@Autowired
	private	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		Student s1=studentRepository.save(student);
		return s1;
	}

	@Override
	public Student updateStudent(Student student, Integer id) {
		Student s1=studentRepository.findById(id).get();
		s1.setName(student.getName());
		s1.setCity(student.getCity());
		s1.setDept(student.getDept());
		return studentRepository.save(s1);
	}

	@Override
	public List<Student> getData() {
		List<Student> l1=studentRepository.findAll();
		return l1;
	}

	@Override
	public Student getData(Integer id) {
		Student s1=studentRepository.findById(id).get();
		return s1;
	}

	@Override
	public void deleteData(Integer id) {
		studentRepository.deleteById(id);

	}

}
