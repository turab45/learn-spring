package com.spring.orm.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.ProductDao;
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
        
//        Product product = new Product();
//        product.setId(1);
//        product.setName("Oppo");
//        product.setPrice(12000.0f);
//        product.setStatus(true);
//        
//        Integer rows = productDaoImpl.add(product);
//        
//        System.out.println("Rows effected "+rows);
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("**************** WELCOME TO THE SPRING ORM APPLICATION ****************");
        
        
        
        while (true) {
        	
        	 System.out.println();
             System.out.println("\t1. Add Product");
             System.out.println("\t2. Update Product");
             System.out.println("\t3. Delete Product");
             System.out.println("\t4. Get Single Product");
             System.out.println("\t5. Get All Products");
             System.out.println("\t6. Exit");
             System.out.println();
             
             System.out.print("\tEnter your choice: ");
            
             try {
            	 Integer choice = Integer.parseInt(bf.readLine());
            	 Integer id = 0;
            	 String name = "";
            	 Float price= 0.0f;
            	 Boolean status = true;
            	 
            	 Product product = null;
            	 
            	 if (choice == 1) {
					System.out.println("--------------- ADD NEW PRODUCT ---------------");
					System.out.println();
					System.out.print("\tEnter product name: ");
					name = bf.readLine();
					System.out.print("\tEnter product price: ");
					price = Float.parseFloat(bf.readLine());
					
					product = new Product();
					product.setName(name);
					product.setPrice(price);
					product.setStatus(status);
					
					productDaoImpl.add(product);
					
					System.out.println("==== PRODUCT HAS BEEN ADDED SUCCESSFULLY! ====");
					
					
				}else if (choice == 2) {
					System.out.println("--------------- UPDATE PRODUCT ---------------");
					System.out.println();
					System.out.print("\tEnter product id: ");
					id = Integer.parseInt(bf.readLine());
					product = productDaoImpl.getProductById(id);
					if (product != null) {
						System.out.println("==== PRODUCT FOUND! ====");
						System.out.println();
						System.out.print("\tEnter new product name: ");
						name = bf.readLine();
						System.out.print("\tEnter new product price: ");
						price = Float.parseFloat(bf.readLine());
						
						product.setName(name);
						product.setPrice(price);
						
						productDaoImpl.update(product);
						System.out.println("==== PRODUCT HAS BEEN UPDATED SUCCESSFULLY! ====");
					}else {
						System.out.println("==== PRODUCT NOT FOUND! ====");
					}
					
				}else if (choice == 3) {
					System.out.println("--------------- DELETE PRODUCT ---------------");
					System.out.println();
					System.out.print("\tEnter product id: ");
					id = Integer.parseInt(bf.readLine());
					product = productDaoImpl.getProductById(id);
					if (product != null) {
						System.out.println("==== PRODUCT FOUND! ====");
						System.out.println();
						System.out.print("Do you really want to delete this product?\n\t1.yes\n\t2.No\n\tEnter your choice: ");
						
						Integer delete = Integer.parseInt(bf.readLine());
						
						if (delete == 1) {
							productDaoImpl.delete(product.getId());
							System.out.println("==== PRODUCT HAS BEEN UPDATED SUCCESSFULLY! ====");
						}
						
					}else {
						System.out.println("==== PRODUCT NOT FOUND! ====");
					}
				}else if (choice == 4) {
					System.out.println("--------------- GET SINGLE PRODUCT ---------------");
					System.out.println();
					System.out.print("\tEnter product id: ");
					id = Integer.parseInt(bf.readLine());
					product = productDaoImpl.getProductById(id);
					if (product != null) {
						System.out.println("==== PRODUCT FOUND! ====");
						System.out.println();
						
						System.out.println("Product ID\tProduct Name\tProduct Price");
						System.out.println(product.getId()+" \t "+product.getName()+" \t "+product.getPrice());
						
					}else {
						System.out.println("==== PRODUCT NOT FOUND! ====");
					}
				}else if (choice == 5) {
					System.out.println("--------------- GET ALL PRODUCTS ---------------");
					System.out.println();
					
					System.out.println("Product ID\tProduct Name\tProduct Price");
					for(Product product2: productDaoImpl.getAllProducts()) {
						System.out.println(product2.getId()+" \t "+product2.getName()+" \t "+product2.getPrice());
						
					}
						
					

				}else if (choice == 6) {
					System.out.println("**************** THANKYOU FOR USING OUT SYSTEM ********************");
					break;
				}else {
					System.out.println("Please choose the correct input.");
				}
            	 
			} catch (Exception e) {
				// Catch the exception
				System.out.println("Invalid input, please try another one.");
			}
		}
        
        
        
    }
}
