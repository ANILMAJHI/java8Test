package com.java.designpartten;

public class EmployeeFactory {

	public static Employee getEmployee(String empType) {
		if (empType.trim().equalsIgnoreCase("DEVOPS DEVELOPER")) {
			return new DevOpsDeveloper();
		} else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
			return new WebDeveloper();

		} else if (empType.trim().equalsIgnoreCase("java developer")) {
			return new JavaDeveloper();
		} else {
			return null;
		}
	}

}
