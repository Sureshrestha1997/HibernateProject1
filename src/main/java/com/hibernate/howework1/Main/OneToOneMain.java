package com.hibernate.howework1.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.homework.entity.Author;
import com.homework.entity.Book;

public class OneToOneMain {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		Author author1 = new Author();
		author1.setName("Sunil");
		author1.setEmail("sunilIsHandsome");
		
		Book book1 = new Book();
		book1.setAuthor(author1);
		book1.setTitle("Gajedi Ko sahar");
		book1.setDescription("Sab Gaja Khane haru lai best book");
		
		session.save(book1);
		
		session.getTransaction().commit();
		
		session.close();
		
		
	}

}
