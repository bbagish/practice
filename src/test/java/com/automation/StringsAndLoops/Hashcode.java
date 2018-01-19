package com.automation.StringsAndLoops;

public class Hashcode {
public static void main(String[] args) {
	String a="a";
	String b="what";
	StringBuilder c=new StringBuilder("a");
	System.out.println("Value of a is " +a+ " Value of b "+b+" Value of c is "+c.toString());
	System.out.println("Value of a is " +a.hashCode()+ " Value of b "+b.hashCode()+" Value of c is "+c.toString().hashCode());
	Hashcode hash=new Hashcode();
	hash.equals(8);
}
public void equals(int n1) {
	System.out.println("Overloading");
}
}
