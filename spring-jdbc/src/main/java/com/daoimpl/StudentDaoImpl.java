package com.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;

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
	
	
}
