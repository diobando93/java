package org.itacademy.javatesting.assertj;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.ArrayList;

class TestMainClassAsserJ {

	//Exercici 1. Una asserci� que demostri que el valor de dos objectes sencers �s igual, i una altra que indiqui que no ho �s.
	@Test 
	void exercici1() {
		assertThat(6).isNotEqualTo(7);
	}
	//Exercici 2. Una asserci� que demostri que la refer�ncia a un objecte �s la mateixa que una altra, i una altra que indiqui que �s diferent.
	@Test
	void exercici2() {
        assertThat("Isabel").isEqualTo("Isabel");
        assertThat("Isa").isNotEqualTo("Isabel");
	}

	//Exercici 3. Una asserci� que indiqui que dues arrays d'enters s�n id�ntics.
	@Test
	void exercici3() {
		int pepe[]= {1,2,3};
		int jose[]= {1,2,3};
		assertThat(pepe).isEqualTo(jose);
	}

	//Exercici 4. Creu un array list contenidor de diversos tipus d'objectes (creu-los tamb�). 
	//Escrigui una asserci� per a verificar l'ordre dels objectes en el ArrayList segons van ser inserits.
	//Ara verifiqui que la llista anterior cont� els objectes en qualsevol ordre.
	//Verifiqui que, en la llista anterior, un dels objectes s'ha afegit nom�s una vegada. Deixi un dels elements sense afegir, i verifiqui no la llista no cont� aquest �ltim.
	@Test
	void exercici4() {
		ArrayList<Integer> pepe= new ArrayList<Integer>();
		ArrayList<Integer> jose= new ArrayList<Integer>();
		pepe.add(1); pepe.add(3); pepe.add(2);
		jose.add(1); jose.add(2); jose.add(3);
		assertThat(pepe).isEqualTo(jose);
	}

	/*@Test
	void a_test2() {
		assertThat("The Lord of the Rings").isNotNull().startsWith("The").contains("Lord").endsWith("Rings");

		assertThat("frodo").isNotEqualTo("sauron");
		assertThat("Frodo").startsWith("Fro").endsWith("do");
		// .isEqualToIgnoringCase("frodo");
	}

	@Test
	void a_test3() {
		assertThat("frodosam").hasSize(8).contains("frodo", "sam").doesNotContain("sauron");
	}*/

}
