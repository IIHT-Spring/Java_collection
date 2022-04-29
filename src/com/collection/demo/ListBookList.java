package com.collection.demo;

import java.util.*;

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int Quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = Quantity;
	}
}
public class ListBookList {
	public static void main(String[] args) {

		// creating the book list
		List<Book> Booklist = new ArrayList<Book>();
		// create the books
		Book b1 = new Book(1, "Learn Java", "Yash", "ABC", 5);
		Book b2 = new Book(2, "Learn JavaScript", "Vijay", "xyz", 2);
		Book b3 = new Book(3, "Learn C#", "Rakesh", "Generic", 4);
		Book b4 = new Book(4, "Learn Python", "Sam", "Bright star", 6);

		// adding books to the list
		Booklist.add(b1);
		Booklist.add(b2);
		Booklist.add(b3);
		Booklist.add(b4);
		for (Book b : Booklist) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}
