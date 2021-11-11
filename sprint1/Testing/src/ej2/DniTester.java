package ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DniTester {

	@Test
	void compruebaLetra() {
		DNI cd = new DNI();		
		assertEquals(cd.obtenerLetra(46657936),"K");
		//cd = new CalculoDni(46257936);
		//assertEquals(cd.getLetra(),"K");
	}
}
