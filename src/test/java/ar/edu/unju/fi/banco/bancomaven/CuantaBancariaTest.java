package ar.edu.unju.fi.banco.bancomaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CuantaBancariaTest {
	CuentaBancaria target;
	
	@Before
	public void setUp() throws Exception {
		target = new CuentaBancaria(2000,1,200);
	}
	
	@After
	public void tearDown() throws Exception {
		target = null;
	}

	@Test
	public void testExtraer() {

		target.extraer(500);
		assertTrue(target.getSaldoActual() == 2000);
	}
	
	@Test
	public void testDepositar() {
		
		target.agregar(500);
		assertTrue(target.getSaldoActual() == 2500);
	}

}
