package com.techie.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Book;
import com.techie.model.BookLibrary;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		BookLibrary bookLib  = abstractApplicationContext.getBean("bookLibrary",BookLibrary.class);

         Book firstBook = bookLib.getFirstBook();
         System.out.println("First Book :" + firstBook.getBookName() + firstBook.getBookId());
		
         List<Book> bookList = bookLib.getAllBooks();
         for(Book books :bookList) {
        	 System.out.println(books.getBookName() + "   "  + books.getBookId());
         }
		abstractApplicationContext.close();
	}

}
