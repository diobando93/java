package ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonthTester {

	@Test
	void compruebaLongitud() {
		String pepe[]=	{"Enero","Febrero","Marzo","Abril","Mayo",
		 "Junio","Julio","Agosto","Septiembre",
		 "Octubre","Noviembre","Diciembre"};
		Month mc = new Month(pepe);		
		assertEquals(mc.getSize(),12);		
	}
	
	@Test  //junit5
	void compruebaNoEsNula() {
		String pepe[]=	{"Enero","Febrero","Marzo","Abril","Mayo",
		 "Junio","Julio","Agosto","Septiembre",
		 "Octubre","Noviembre","Diciembre"};
		Month mc = new Month(pepe);		
		assertNotNull(mc);		
	}
	@Test  //junit5
	void compruebaAgosto() {
		String pepe[]=	{"Enero","Febrero","Marzo","Abril","Mayo",
		 "Junio","Julio","Agosto","Septiembre",
		 "Octubre","Noviembre","Diciembre"};
		Month mc = new Month(pepe);		
		assertEquals(mc.getElement(7),"Agosto");		
	}
	

}
