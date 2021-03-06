package com.dao;

import java.util.List;

import com.entities.Student;

public interface StudentDao {
	public Integer add(Student student);
	public Integer update(Student student);
	public Integer delete(Integer studentId);
	public Student getStudent(Integer id);
	public List<Student> getAllStudents();
}
