package com.automation.GetterAndSetters;


public class Book {
private String title;
private String author;
private String type;
private double price;
private boolean onSale;

public void setBookInformation(String title, String author, String type, double price1, boolean onSale1){
	setTitle(title);
	setAuthor(author);
	setType(type);
	price=price1;
	onSale=onSale1; //also possible directly assign, instead of set
	
}

public void setOnSale(boolean bOnSale){
	onSale=bOnSale;
}
public boolean getOnSale(){
	return onSale;
}

public void setTitle(String stTitle){
	title=stTitle;
}
public String getTitle(){
	return title;
}
public void setAuthor(String stAuthor){
	author=stAuthor;
}
public String getAuthor(){
	return author;
}
public void setType(String stType){
	type=stType;
}
public String getType(){
	return type;
}
public void setPrice(double stPrice){
	price=stPrice;
}
public double getPrice(){
	return price;
}
}
