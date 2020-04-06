package com.tekinikhil.TDD_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrefixARemoverTest {

	@Test
	void testCaseZero() 
	{
		PrefixARemover PrefixARemoverObject=new PrefixARemover();
		assertEquals("NCHOR",PrefixARemoverObject.removePrefixingAs("ANCHOR"));
	}
	@Test
	void testCaseOne() 
	{
		PrefixARemover PrefixARemoverObject=new PrefixARemover();
		assertEquals("B",PrefixARemoverObject.removePrefixingAs("AAB"));
	}
	@Test
	void testCaseTwo() 
	{
		PrefixARemover PrefixARemoverObject=new PrefixARemover();
		assertEquals("BDA",PrefixARemoverObject.removePrefixingAs("BADA"));
	}
	@Test
	void testCaseThree() 
	{
		PrefixARemover PrefixARemoverObject=new PrefixARemover();
		assertEquals("",PrefixARemoverObject.removePrefixingAs("AA"));
	}
	@Test
	void testCaseFour() 
	{
		PrefixARemover PrefixARemoverObject=new PrefixARemover();
		assertEquals("D",PrefixARemoverObject.removePrefixingAs("AD"));
	}
	@Test
	void testCaseFive() 
	{
		PrefixARemover PrefixARemoverObject=new PrefixARemover();
		assertEquals("D",PrefixARemoverObject.removePrefixingAs("DA"));
	}
	@Test
	void testCaseSeven() 
	{
		PrefixARemover PrefixARemoverObject=new PrefixARemover();
		assertEquals("",PrefixARemoverObject.removePrefixingAs("A"));
	}
}
