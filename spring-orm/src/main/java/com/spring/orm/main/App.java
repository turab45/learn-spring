package com.spring.orm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.ProductDao;
import com.spring.orm.daoimpl.ProductDaoImpl;
import com.spring.orm.entities.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        ProductDao productDaoImpl = (ProductDao) context.getBean("productDaoImpl");
        
        Product product = new Product();
        product.setId(1);
        product.setName("Oppo");
        product.setPrice(12000.0f);
        product.setStatus(true);
        
        Integer rows = productDaoImpl.add(product);
        
        System.out.println("Rows effected "+rows);
    }
}
