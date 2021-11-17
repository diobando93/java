package org.itacademy.javatesting.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMainClass {

	@Test  //junit5
	void compruebaLongitud() {
		String pepe[]=	{"Enero","Febrero","Marzo","Abril","Mayo",
		 "Junio","Julio","Agosto","Septiembre",
		 "Octubre","Noviembre","Diciembre"};
		MainClass mc = new MainClass(pepe);		
		assertEquals(mc.getSize(),12);		
	}
	
	@Test  //junit5
	void compruebaNoEsNula() {
		String pepe[]=	{"Enero","Febrero","Marzo","Abril","Mayo",
		 "Junio","Julio","Agosto","Septiembre",
		 "Octubre","Noviembre","Diciembre"};
		MainClass mc = new MainClass(pepe);		
		assertNotNull(mc);		
	}
	@Test  //junit5
	void compruebaAgosto() {
		String pepe[]=	{"Enero","Febrero","Marzo","Abril","Mayo",
		 "Junio","Julio","Agosto","Septiembre",
		 "Octubre","Noviembre","Diciembre"};
		MainClass mc = new MainClass(pepe);		
		assertEquals(mc.getElement(7),"Agosto");		
	}
	
	@Test  //junit5
	void compruebaLetra() {
		CalculoDni cd = new CalculoDni(46657936);		
		assertEquals(cd.getLetra(),"K");
		//cd = new CalculoDni(46257936);
		//assertEquals(cd.getLetra(),"K");
	}
	@Test  //junit5
	void compruebaOutOfBounds() {
		Numeros numeros = new Numeros();		
		//try {
			assertEquals(numeros.setyget(2, 2), 2);
			//assertEquals(numeros.setyget(10, 2), 2);
		//}catch(ArrayIndexOutOfBoundsException ae){
				
		//}
	}

}
