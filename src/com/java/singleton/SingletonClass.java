package com.java.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingleTClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SingleTClass() {
	}

	/*
	 * To overcome this issue, we need to override readResolve() method in the
	 * Singleton class and return the same Singleton instance. Update
	 * Singleton.java, with below method.
	 * 
	 * a Singleton class can be serialized and deserialized to create multiple
	 * instances. To address this, you can implement the readResolve method to
	 * return the existing Singleton instance during deserialization:
	 */
	protected Object readResolve() {
		return instance;

	}

	private static SingleTClass instance = null;

	public static SingleTClass getInstance() {
		if (instance == null) {
			instance = new SingleTClass();
		}
		return instance;
	}

}

public class SingletonClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SingleTClass instanceOne = SingleTClass.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(instanceOne);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
		SingleTClass instanceTwo = (SingleTClass) in.readObject();
		in.close();

		System.out.println("hashCode of instance 1 is - " + instanceOne.hashCode());
		System.out.println("hashCode of instance 2 is - " + instanceTwo.hashCode());
		/*
		 * SingleTClass singleTClass; SingleTClass singleTClass1; singleTClass =
		 * SingleTClass.getInstance(); singleTClass1 = SingleTClass.getInstance();
		 * System.out.println(singleTClass.hashCode());
		 * System.out.println(singleTClass1.hashCode());
		 */

	}

}
