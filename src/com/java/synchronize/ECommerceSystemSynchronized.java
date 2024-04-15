package com.java.synchronize;

class Item {
	private String itemName;
	private boolean isBook = false;

	public Item() {
		super();
	}

	public Item(String itemName) {
		super();
		this.itemName = itemName;

	}

	public synchronized boolean bookItem(String customerName) {
		if (!isBook) {
			System.out.println(itemName + ":Item is successfully booked by:" + customerName);
			return true;
		} else {
			System.out.println(itemName + ": Is already booked...");
			return false;
		}
	}

}

public class ECommerceSystemSynchronized {

	public static void main(String[] args) {

		Item laptop = new Item("Laptop");
		Item tv = new Item("Tv");

		Thread t1 = new Thread(() -> {
			boolean booked1 = laptop.bookItem("user-1");
			boolean booked11 = laptop.bookItem("user-1");
		});
		Thread t3 = new Thread(() -> {
			boolean watch = laptop.bookItem("user3");
			boolean watch1 = laptop.bookItem("user3");
		});

		Thread t2 = new Thread(() -> {

			boolean booked2 = tv.bookItem("user-2");

		});
		t1.start();
		t2.start();
		t3.start();
	}

}
