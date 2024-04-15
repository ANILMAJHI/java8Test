package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StudentSerialization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private List<String> subjects;

	public StudentSerialization() {
		super();
	}

	public StudentSerialization(int id, String name, List<String> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		List<String> subjList = new ArrayList<>();
		subjList.add("Java");
		subjList.add("Oracle");

		StudentSerialization std1 = new StudentSerialization(1, "Ram", subjList);
		StudentSerialization std2 = new StudentSerialization(2, "Laxman", subjList);
		StudentSerialization std3 = new StudentSerialization(3, "Site", subjList);

		FileOutputStream fos = new FileOutputStream("student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(std1);
		System.out.println("one object is serialized successfully...");
		oos.writeObject(std2);
		System.out.println("2nd object is serialized successfully...");
		oos.writeObject(std3);
		
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ois.readObject();
		ois.close();

	}

}
