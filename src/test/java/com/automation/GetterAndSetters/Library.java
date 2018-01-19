package com.automation.GetterAndSetters;


public class Library {
public static void main(String[] args) {
	
	Book book1=new Book();
	book1.setTitle("Selenium Cookbook");
	book1.setAuthor("Unmesh");
	book1.setPrice(36.89);
	book1.setOnSale(false);
	
	
	Book book2=new Book();
	book2.setTitle("Java For Dummies");
	book2.setAuthor("American Publishing");
	book2.setPrice(49.99);
	book2.setOnSale(true);
	
	System.out.println(book1.getAuthor());
	System.out.println(book2.getPrice());
	System.out.println(book2.getTitle());
	
	book2=book1;
	System.out.println(book2.getTitle());
	System.out.println(book1.getAuthor());
	
	book2.setOnSale(true);
	System.out.println(book1.getOnSale());
	
	Book book3=new Book();
	book3.setBookInformation("Introduction to Java", "Yang", "Hardcover", 50.50, false);	

	System.out.println(book3.getTitle()+" by "+book3.getAuthor());
	}
}
