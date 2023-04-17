package com.example.SpringBootTutorial.Student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentService {
	public List<Student> getStudents() {
		return List.of(new Student(1L, "Chitra","chitraksonawane@gmail.com", LocalDate.of(1983, 12, 28),39));
	}
}
