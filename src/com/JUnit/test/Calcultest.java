package com.JUnit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.JUnit.main.Calcul;

class Calcultest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSomme() {
		
		Calcul calcul = new Calcul();
		if (calcul.somme(2, 3) != 5)
			fail("faux pour 2 entiers positifs");
		if (calcul.somme(-2, -3) != -5)
			fail("faux pour 2 entiers negatifs");
		if (calcul.somme(-2, 3) != 1)
			fail("faux pour 2 entiers de signe different");
		if (calcul.somme(0, 3) != 3)
			fail("faux pour x nul");
		if (calcul.somme(2, 0) != 2)
			fail("faux pour y nul");
		if (calcul.somme(0, 0) != 0)
			fail("faux pour x et y nul");
//		fail("Not yet implemented");
	}
	
	@Test
	void testSoustraction() {
		
		Calcul calcul = new Calcul();
		assertTrue("2 entiers positifs", calcul.soustraction(3, 2) == 1);
		assertTrue("2 entiers negatifs", calcul.soustraction(-3, -2) == -1);
		assertTrue("2 entiers de signe different", calcul.soustraction(3, -2) == 5);
		assertTrue("entier x nul", calcul.soustraction(0, 2) == -2);
		assertTrue("entier y nul", calcul.soustraction(3, 0) == 3);
		assertTrue("entier x et y nul", calcul.soustraction(0, 0) == 0);
		//		fail("Not yet implemented");
	}

	@Test
	void testMultiplication() {
		
		Calcul calcul = new Calcul();
		assertTrue("2 entiers positifs", calcul.multiplication(3, 2) == 6);
		assertTrue("2 entiers negatifs", calcul.multiplication(-3, -2) == 6);
		assertTrue("2 entiers de signe different", calcul.multiplication(3, -2) == -6);
		assertTrue("entier x nul", calcul.multiplication(0, 2) == 0);
		assertTrue("entier y nul", calcul.multiplication(3, 0) == 0);
		assertTrue("entier x et y nul", calcul.multiplication(0, 0) == 0);
		//		fail("Not yet implemented");
	}


	@Test
	void testDivision() {
		Calcul calcul = new Calcul();
		assertFalse("2 entiers positifs", calcul.division(15, 3) == 0);
		assertEquals("2 entiers negatifs", 5, calcul.division(-15, -3));
		assertNotNull("2 entiers de signes different", calcul.division(-15, 3));
		assertTrue("entier x nul", calcul.division(0, 3) == 0);

		Throwable e = null;
		try {
			calcul.division(15, 0);
		} catch (Throwable ex) {
			e = ex;
		}
		assertTrue("entier y nul", e instanceof ArithmeticException);

		e = null;
		try {
			calcul.division(0, 0);
		} catch (Throwable ex) {
			e = ex;
		}
		assertTrue("entier x et y nul", e instanceof ArithmeticException);

//		fail("Not yet implemented");
	}

}
