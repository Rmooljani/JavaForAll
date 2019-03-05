package com.techie.model;

import java.util.List;

public class BookLibrary {

	private List<Book> allBooks;
	private Book firstBook;
	
	public List<Book> getAllBooks() {
		return allBooks;
	}
	public void setAllBooks(List<Book> allBooks) {
		this.allBooks = allBooks;
	}
	public Book getFirstBook() {
		return firstBook;
	}
	public void setFirstBook(Book firstBook) {
		this.firstBook = firstBook;
	}
	
	
	
}
