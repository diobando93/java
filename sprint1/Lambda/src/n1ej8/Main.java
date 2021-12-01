package n1ej8;

public class Main {
	
	public static void main(String[] args) {
		
		Reverse reverseString = (str) -> {
			String result = "";
			for(int i = str.length() -1; i >= 0; i--) 
				result += str.charAt(i);
			return result;
		};
		
		System.out.println(reverseString.reverse("Hello world"));
	}
	
}
