package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Orders;
import com.biju.demo.entity.Student;
import com.biju.demo.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	public Student student(int id) {

		Optional<Student> student = studentRepo.findById(id);

		if (student.isPresent())
			return student.get();
		else
			return null;
	}

	// this method is used to save
	public String saveStudent(Student student) {
		String msg = "Success";

		try {

			studentRepo.save(student);

		} catch (Exception e) {
			System.out.println("Exception occured:::" + e);
			msg = "Failed";
		}

		return msg;

	}

	public String deleteOrderById(int id) {
		try {
			studentRepo.deleteById(id);
			return "Success";
		} catch (Exception e) {
			System.out.println("Exception occured while deleting record::::" + e);
			return "Failed";
		}

	}
}
