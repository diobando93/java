package ej3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumeroTester {

	@Test
	void compruba() {
		Numero numeros = new Numero();
		assertEquals(numeros.setyget(5, 2), 2);
	}

}
