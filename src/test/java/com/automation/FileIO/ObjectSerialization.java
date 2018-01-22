package com.automation.FileIO;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectSerialization {
	static File file=null;
	static FileOutputStream fo=null;
	static ObjectOutputStream output=null;
	static FileInputStream fi=null;
	static ObjectInputStream input=null;
	public static void main(String[] args) throws IOException{
		
		try {
		file = new File("students.txt");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Tom", 3.9));
		students.add(new Student("Belek", 4.0));
		students.add(new Student("Bill", 3.8));
		
		//serialize the collection of students
		
		fo=new FileOutputStream(file);
		output = new ObjectOutputStream(fo);
		for (Student s : students) {
			output.writeObject(s);
		}
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			output.close();
			fo.close();
		}
		//deseralize the file back into the collection
		ArrayList<Student> students2=null;
		try {
		fi=new FileInputStream(file);
		input= new ObjectInputStream(fi);
		ArrayList<Student> students21=new ArrayList<Student>();
		while(true) {
				Student s = (Student)input.readObject();
				students21.add(s);
			}
		
		}catch(EOFException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException c) {
			c.printStackTrace();
		}finally {
			
		}
		for(Student s :students2) {
			System.out.println(s);
		}
	}
}
