package com.java.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Student {

	private final String name;
	private final int id;
	private final List<String> subjects;

	public Student(String name, int id, List<String> subjects) {
		super();
		this.name = name;
		this.id = id;
		this.subjects = Collections.unmodifiableList(new ArrayList<>(subjects));
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", subjects=" + subjects + "]";
	}

	public static void main(String[] args) {

		List<String> subject = new ArrayList<String>();
		subject.add("java");
		subject.add("oracle");
		subject.add(".net");
		Student s = new Student("hari", 2, subject);
		Student s1 = new Student("raju", 3, subject);
		 System.out.println(s);
		 System.out.println(s1);
		 System.out.println(s.hashCode()+" "+s1.hashCode());

		// s.name="hari";
		//s.subjects.add("C++"); //throw  java.lang.UnsupportedOperationException
		System.out.println(s.getSubjects());

	}

}
