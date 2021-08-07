package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dao.StudentDao;
import com.entities.Student;
import com.mysql.jdbc.UpdatableResultSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       
       StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//       ADD STUDENT
//       Student student = new Student();
//       student.setName("Jatender");
//       student.setCity("Umerkot");
//       
//       Integer result = studentDao.add(student);
       
//       UPDATE STUDENT
//       Student student = new Student();
//       student.setId(1);
//       student.setName("Turab Bajeer");
//       student.setCity("Islamkot, Thar");
//       
//       Integer result = studentDao.update(student);
       
// 		DELETE STUDENT
//       Integer result = studentDao.delete(2);
//       System.out.println("Student deleted "+result);
       
//		GET STUDENT BY ID
       Student student = studentDao.getStudent(1);
       System.out.println(student);
    }
}
