package com.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dao.StudentDao;
import com.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Integer add(Student student) {
		String query = "insert into student(name, city) values(?,?)";
		Integer result = this.jdbcTemplate.update(query, student.getName(), student.getCity());

		return result;
	}

	public Integer update(Student student) {
		// update query
		String query = "update student set name=?,city=? where id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

	public Integer delete(Integer studentId) {
		// Delete query
		String query = "delete from student where id=?";
		int result = this.jdbcTemplate.update(query, studentId);
		return result;
	}

	public Student getStudent(Integer id) {
		// Get Student By ID
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();

		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, id);

		return student;
	}

}
