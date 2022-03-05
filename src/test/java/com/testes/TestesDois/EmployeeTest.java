package com.testes.TestesDois;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	Employee employeeOne;
	Employee employeeTwo;
	
	@Before
	public void init() {
		employeeOne = new Employee("Jhon", "Carter", 1000);
		employeeTwo = new Employee("Peter", "Parker", 2000);
		
	}
	
	@Test
	public void increaseSalaryTest() {
		System.out.println("Monthly salary of the two employees before the increase");
		System.out.println(employeeOne.getSalary());
		System.out.println(employeeTwo.getSalary());
		
		employeeOne.increaseSalaryInTenPercent();
		employeeTwo.increaseSalaryInTenPercent();
		
		System.out.println("Annual salary of the two employees after the increase");
		System.out.println(employeeOne.getAnnualSalary());
		System.out.println(employeeTwo.getAnnualSalary());
		
		assertEquals(13200, employeeOne.getAnnualSalary(),0.0);
		assertEquals(26400, employeeTwo.getAnnualSalary(),0.0);
	}
	
	@Test
	public void getFirstNameTest() {
		assertEquals("Jhon", employeeOne.getFirstName());
	}
	
	@Test
	public void getLastNameTest() {
		assertEquals("Carter", employeeOne.getLastName());
	}
	
	@Test
	public void setFirstNameTest() {
        employeeOne.setFirstName("test");
		assertEquals("test", employeeOne.getFirstName());
	}
	@Test
	public void setLastNameTest() {
        employeeOne.setLastName("lastname");
		assertEquals("lastname", employeeOne.getLastName());
	}
	@Test
	public void setSalaryTest() {
        employeeOne.setSalary(1500.00);
		assertEquals(1500.00, employeeOne.getSalary(),0.0);
	}
	
	@Test
	public void setNegativeSalaryTest() {
		employeeOne.setSalary(-1500.00);
		assertEquals(1000, employeeOne.getSalary(),0.0);
	}
	
	@Test
	public void negativeSalaryTest() {
		employeeOne = new Employee("Jhon", "Carter", -1000);
		assertEquals(0.0, employeeOne.getSalary(),0.0);
	}
}
