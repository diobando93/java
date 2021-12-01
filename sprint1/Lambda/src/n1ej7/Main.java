package n1ej7;

public class Main {
	
	public static void main(String[] args) {
		
		InterfacePi pi = () -> 3.14516;
		System.out.println(pi.getPivalue());
		System.out.println(pi);
	}

}
