package com.testes.TestesDois;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InvoiceTest {
	Invoice invoice;
	
	@Before
	public void init() {
		invoice = new Invoice(null, null, 2, -2);
	}
	
	@Test
	public void getInvoiceAmountTest() {
		Invoice invoice = new Invoice(null, null, 2, 2.5);
		assertEquals(5, invoice.getInvoiceAmount(), 0.0);
	}
	
	@Test
	public void negativeAmountSetToZeroTest() {
		Invoice invoice = new Invoice(null, null, -2, 2);
		assertEquals(0, invoice.getQuantidade());
	}
	
	@Test
	public void negativePriceSetToZeroTest() {
		Invoice invoice = new Invoice(null, null, 2, -2);
		assertEquals(0, invoice.getPreco(), 0.0);
	}

	@Test
	public void getNumeroTest() {
		assertEquals(null, invoice.getNumero());
	}
	
	@Test
	public void getDescricaoTest() {
		assertEquals(null, invoice.getDescricao());
	}
	
	@Test
	public void setNumeroTest() {
        invoice.setNumero("123");
		assertEquals("123", invoice.getNumero());
	}
	
	@Test
	public void setDescricaoTest() {
        invoice.setDescricao("descricao");
		assertEquals("descricao", invoice.getDescricao());
	}
	
	@Test
	public void setQuantidadeTest() {
        invoice.setQuantidade(-1);
		assertEquals(0, invoice.getQuantidade());
	}
	
	@Test
	public void setPrecoTest() {
        invoice.setPreco(-1.0);
		assertEquals(0, invoice.getPreco(),0.0);
	}
	
	@Test
	public void setQuantidadePositivaTest() {
        invoice.setQuantidade(1);
		assertEquals(1, invoice.getQuantidade());
	}
	
	@Test
	public void setPrecoPositivoTest() {
        invoice.setPreco(1.0);
		assertEquals(1.0, invoice.getPreco(),0.0);
	}
}
