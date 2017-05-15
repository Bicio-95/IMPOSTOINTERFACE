package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import controller.Validador;

public class ValidadorTest {

	@Test
	public void recebeUmaStringDoubleRetornaDouble() {
		double atual = 5;
		double retorno = Validador.recebeStringRetornaDouble("5.0");
		assertEquals(retorno, atual, 0.005);
	}

	@Test (expected = IllegalArgumentException.class)
	public void recebeUmaStringTextoRetornaErro() {
		double retorno = Validador.recebeStringRetornaDouble("A");
	}
	
	@Test
	public void recebeUmaStringVaziaRetornaZero() {
		double atual = 0;
		double retorno = Validador.recebeStringRetornaDouble("");
		assertEquals(retorno, atual, 0.005);
	}
	
	public void recebeUmaStringNulaRetornaZero() {
		String nulo = null;
		double atual = 0;
		double retorno = Validador.recebeStringRetornaDouble(nulo);
		assertEquals(retorno, atual, 0.005);
	}
}
