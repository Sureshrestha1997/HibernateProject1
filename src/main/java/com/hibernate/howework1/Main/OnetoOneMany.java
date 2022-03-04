package com.hibernate.howework1.Main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.homework.entity.Category;
import com.homework.entity.Product;



public class OnetoOneMany {
	
public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	
	Session session = sf.openSession();
	session.beginTransaction();
	
	Product product1 = new Product("XPS", "16GB Ran", 120);
	Product product2 = new Product("Yoga", "12GB Ran", 420);
	Product product3 = new Product("Lenovo", "15GB Ran", 320);
	Product product4 = new Product("Dell", "160GB Ran", 220);
	Product product5 = new Product("Hp", "6GB Ran", 720);
	Product product6 = new Product("Spectre", "10GB Ran", 620);
	
	List<Product> products = new ArrayList<>();
	products.add(product6);
	products.add(product5);
	products.add(product4);
	products.add(product3);
	products.add(product2);
	products.add(product1);
	
	Category category = new Category();
	category.setName("Laptop");
	category.setProducts(products);
	
	Product product7 = new Product("Iphone", "16GB Ran", 120);
	Product product8 = new Product("Galaxy", "12GB Ran", 420);
	Product product9 = new Product("Pixel", "15GB Ran", 320);
	Product product10 = new Product("Oppo", "160GB Ran", 220);
	Product product11= new Product("OnePlus", "6GB Ran", 720);
	
	List<Product> products2 = new ArrayList<>();
	products2.add(product7);
	products2.add(product8);
	products2.add(product9);
	products2.add(product10);
	products2.add(product11);
	
	Category category2 = new Category();
	category2.setName("Mobiles");
	category2.setProducts(products2);;
	
	session.save(category);
	session.save(category2);
	
	session.getTransaction().commit();
	session.close();
	
	
	
	
}	

}
