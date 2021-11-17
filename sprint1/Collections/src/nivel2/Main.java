package nivel2;
import java.util.PriorityQueue;


public class Main {
	
	public static void main(String [] args) {
		
		
		PriorityQueue<Numero> cola = new PriorityQueue<>();
		Numero numero1 = new Numero();
		Numero numero2 = new Numero();
		Numero numero3 = new Numero();
		Numero numero4 = new Numero();
		Numero numero5 = new Numero();
		
		cola.add(numero5);
		cola.add(numero1);
		cola.add(numero3);
		cola.add(numero2);
		cola.add(numero4);
		
		System.out.println(cola);
		System.out.println(cola.size());
		int colaSize = cola.size();
		
		for( int i = 0; i < colaSize; i++) {
			
			System.out.println(cola.poll());
			//System.out.println(i);
			
		}
	}

}
