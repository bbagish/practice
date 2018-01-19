package com.automation.StringsAndLoops;

public class unique {
public static void main(String[] args) {
String name="Eldarrrrwwww";
String unique="";
for (int i =0; i<name.length(); i++) {
	if(!unique.contains(name.charAt(i)+"")){
		unique+=name.charAt(i);
	}

}
System.out.println(unique);
}
}
