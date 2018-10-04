package ar.edu.unju.fi.banco.bancomaven;

//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BancoTestCase extends TestCase {
Banco target;
	
	@Before
	public void setUp() throws Exception {
		target = new Banco();
	}
	
	@After
	public void tearDown() throws Exception {
		target = null;
	}

	@Test
	public void testCrearCuenta() {
		CuentaBancaria cuenta = new CuentaBancaria(10,1,10);
		target.agregarCuenta(cuenta);
		assertTrue(target.getListacuentas().size() == 1);
	}
	

}
