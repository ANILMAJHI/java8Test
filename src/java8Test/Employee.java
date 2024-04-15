package java8Test;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private List<String> citisWorkedIn;

	public Employee() {
		super();
	}

	public Employee(int id, String name, List<String> citisWorkedIn) {
		super();
		this.id = id;
		this.name = name;
		this.citisWorkedIn = citisWorkedIn;
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

	public List<String> getCitisWorkedIn() {
		return citisWorkedIn;
	}

	public void setCitisWorkedIn(List<String> citisWorkedIn) {
		this.citisWorkedIn = citisWorkedIn;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", citisWorkedIn=" + citisWorkedIn + "]";
	}

}
