package com.collection.demo.linkedlist;

import java.util.LinkedList;
import java.util.List;
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
public class LinkedListBookList {
	public static void main(String[] args) {
		// booklist linked list 
		List<Book> bookList = new LinkedList<Book>();
		//creating books
		Book b1 = new Book(1, "Learn Java", "Yash", "ABC", 5);
		Book b2 = new Book(2, "Learn JavaScript", "Vijay", "xyz", 2);
		Book b3 = new Book(3, "Learn C#", "Rakesh", "Generic", 4);
		Book b4 = new Book(4, "Learn Python", "Sam", "Bright star", 6);
		// adding books object to booklsit
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		
		for (Book b : bookList) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}

}
