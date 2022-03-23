package nivel2ej1;

public class Main {
	
	public static void main(String[] args) {
		NbaPlayer[] players = new NbaPlayer[10];
		for(int i = 1; i <= players.length; i++) {
			players[i - 1] = new NbaPlayer("Michael Jordan", "Escolta", 1.90);
		}
		
		NbaPlayerWrapper nbaplwrapper = new NbaPlayerWrapper();
		System.out.println("--------------------------------");
		System.out.println("Dades anotacio:");
		System.out.println(nbaplwrapper.getFileToSerialize());
		System.out.println("--------------------------------");
		
		
	}


}
