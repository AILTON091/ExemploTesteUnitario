package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		
		Calculadora cal = new Calculadora();		
		Integer resposta = cal.somar(2, 2);
		assertTrue(resposta==4);
		
	}

}
