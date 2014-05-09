package com.luckypants.command;

import org.codehaus.jackson.map.ObjectMapper;

import com.luckypants.model.Book;
import com.luckypants.mongo.BooksConnectionProvider;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class CreateBookCommand {

	public boolean execute(Book book) {
		BooksConnectionProvider booksConn = new BooksConnectionProvider();
		DBCollection booksCollection = booksConn.getCollection();

		ObjectMapper mapper = new ObjectMapper();
		try {
			DBObject dbObject = (DBObject) JSON.parse(mapper
					.writeValueAsString(book));
			booksCollection.insert(dbObject);
		} catch (Exception e) {
			System.out.println("ERROR during mapping book to Mongo Object");
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		CreateBookCommand create = new CreateBookCommand();
		Book book = new Book();
		book.setAuthor("Gula");
		book.setTitle("Book2");
		book.setISBN("123");
		book.setCost("$150");
		book.setNoOfPages("1200");
		book.setUserRating("4");
		
		Book book1 = new Book();
		book1.setAuthor("Bhavana");
		book1.setTitle("MyBook");
		book1.setISBN("345");
		book1.setCost("$250");
		book1.setNoOfPages("1500");
		book1.setUserRating("3");
		
		
		Book book2 = new Book();
		book2.setAuthor("Jim");
		book2.setTitle("JimsBook");
		book2.setISBN("456");
		book2.setCost("$50");
		book2.setNoOfPages("1100");
		book2.setUserRating("5");
		
		
		if (create.execute(book)) {
			System.out.println("SUCCESS:Book Created");
		} else {
			System.out.println("ERROR:Failed to create book");
		}
		if (create.execute(book1)) {
			System.out.println("SUCCESS:Book Created");
		} else {
			System.out.println("ERROR:Failed to create book");
		}
		if (create.execute(book2)) {
			System.out.println("SUCCESS:Book Created");
		} else {
			System.out.println("ERROR:Failed to create book");
		}

	}
}
