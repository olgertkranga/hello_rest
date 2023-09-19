package net.codejava;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	Product product = new Product();

	@Test
	public void testGetId_Equals() {
		product.setId(10);
		assertEquals(10, product.getId());
	}

	@Test
	public void testGetId_NotEquals() {
		product.setId(20);
		assertNotEquals(10, product.getId());
	}

	@Test
	public void testSetId() {
		product.setId(10);
		assertEquals(10, product.getId());
	}

	@Test
	public void testGetName_Equals() {
		product.setName("Robinson Cruzo");
		assertEquals("Robinson Cruzo", product.getName());
	}

	@Test
	public void testGetName_NotEquals() {
		product.setName("Robinson");
		;
		assertNotEquals("Robinson Cruzo", product.getName());
	}

	@Test
	public void testSetName() {
		product.setName("Robinson Cruzo");
		;
		assertEquals("Robinson Cruzo", product.getName());
	}

	@Test
	public void testGetPrice_Equals() {
		product.setPrice(100);
		assertEquals("100.0", String.valueOf(product.getPrice()));
	}

	@Test
	public void testGetPrice_NotEquals() {
		product.setPrice(1000);
		assertNotEquals(100, product.getPrice());
	}

	@Test
	public void testSetPrice() {
		product.setPrice(100);
		assertEquals("100.0", String.valueOf(product.getPrice()));
	}

	@Test
	public void testEqualsObject() {
		assertTrue(product.equals(new Product()));
	}
	
	@Test
	public void testEqualsObject_Null() {
		assertFalse(product.equals(null));
	}
	
	@Test
	public void testEqualsObject_Object() {
		assertFalse(product.equals(new Object()));
	}

	@Test
	public void testToString() {
		product.setId(10);
		product.setName("Robinson Cruzo");
		product.setPrice(100);
		assertEquals("Product [id=10, name=Robinson Cruzo, price=100.0]", product.toString());
	}

}
