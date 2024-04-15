package com.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("date: " + date);

		LocalTime time = LocalTime.now();
		System.out.println("Time: " + time);

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("dateTime: " + currentDateTime);

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = date.format(dateFormatter);
		System.out.println("Formatted date: " + formattedDate);

		LocalDate parsedDate = LocalDate.parse("15-04-2024", dateFormatter);
		System.out.println("Parsed date: " + parsedDate);

		// Formatting date and time
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = currentDateTime.format(dateTimeFormatter);
		System.out.println("Formatted date and time: " + formattedDateTime);

		// Parsing date and time
		LocalDateTime parsedDateTime = LocalDateTime.parse("15-04-2024 13:30:00", dateTimeFormatter);
		System.out.println("Parsed date and time: " + parsedDateTime);

	}

}
