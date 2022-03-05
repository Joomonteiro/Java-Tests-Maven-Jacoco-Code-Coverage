package com.testes.TestesDois;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		super();
		if (salary < 0) {
			this.firstName = firstName;
			this.lastName = lastName;
			return;
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 0) {
			return;
		}
		this.salary = salary;
	}
	
	public void increaseSalaryInTenPercent() {
		this.salary = this.salary*1.1;
	}
	
	public double getAnnualSalary() {
		return salary*12;
	}
	
}
