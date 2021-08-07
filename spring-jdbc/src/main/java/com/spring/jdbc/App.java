package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dao.StudentDao;
import com.entities.Student;

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
       
       Student student = new Student();
       student.setName("Jatender");
       student.setCity("Umerkot");
       
       Integer result = studentDao.add(student);
       
       System.out.println("Recoreds inserted "+ result);
    }
}
