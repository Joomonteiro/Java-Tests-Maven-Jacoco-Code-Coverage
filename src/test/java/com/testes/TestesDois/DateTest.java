package com.testes.TestesDois;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DateTest {
	Date date;
	
	@Before
	public void init() {
		date = new Date(10, 12, 2022);
	}

	@Test
	public void getMesTest() {
		assertEquals(10, date.getMes());
	}
	
	@Test
	public void getDiaTest() {
		assertEquals(12, date.getDia());
	}

    @Test
	public void getAnoTest() {
		assertEquals(2022, date.getAno());
	}
	
	@Test
	public void displayDateTest() {
		assertEquals("10/12/2022", date.displayDate());
	}
	
	@Test
	public void setMesTest() {
        date.setMes(12);
		assertEquals(12, date.getMes());
	}
	
	@Test
	public void setDiaTest() {
        date.setDia(16);
		assertEquals(16, date.getDia());
	}
	
	@Test
	public void setAnoTest() {
        date.setAno(2023);
		assertEquals(2023, date.getAno());
	}
}
