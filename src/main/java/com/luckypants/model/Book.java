package com.luckypants.model;


public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private String Cost;
	private String NoOfPages;
	private String UserRating;
	
	public String getUserRating() {
		return UserRating;
	}
	public void setUserRating(String userRating) {
		UserRating = userRating;
	}
	public String getCost() {
		return Cost;
	}
	public void setCost(String cost) {
		Cost = cost;
	}
		
	public String getNoOfPages() {
		return NoOfPages;
	}
	public void setNoOfPages(String noOfPages) {
		NoOfPages = noOfPages;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	
}
