package cat.barcelonactiva.s01.t07.n2;

public class Test {

	public static void main(String[] args) {

		Alumne[] alumnes = new Alumne[10];
		for (int i = 1; i <= 10; i++) {
			alumnes[i - 1] = new Alumne(i, "Nom alumne " + i, "Cognoms alumne " + i);
		}

		AlumneWrapper alumneWrapper = new AlumneWrapper();
		System.out.println("-------------------------------");
		System.out.println("Dades anotació:");
		System.out.println(alumneWrapper.getFileToSerialize());
		System.out.println("-------------------------------");

		//Serialtizem un o diversos alumnes
		alumneWrapper.serialitzaUnAlumne(alumnes[0]);
		//alumneWrapper.serialitzaArrayAlumnes(alumnes);
		
		

	}

}
