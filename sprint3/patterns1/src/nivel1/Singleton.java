package nivel1;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Properties;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;


import com.sun.tools.javac.util.List;

public class Singleton {
	
	private static Singleton instancia;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstancia() {
		
		if(instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}
	
	public void agregarComando() throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean Salir = false;
		ArrayList <String> guardarComando = new ArrayList();
		System.out.println("Agregar comandos: ");
		System.out.println("Para salir pulse 4");
		try (FileWriter fileWriter = new FileWriter("FileWriterTest.txt", true)) {
		    while(Salir == false) {
				String comando = sc.next();
				if(comando.equals("4")) {
					Salir = true;
					System.out.println("Comandos agregados: " + guardarComando.toString());
				}else {
					guardarComando.add(comando);
					fileWriter.write(comando.toString());
					fileWriter.write('\n');
				}
		    }
		}
	}
	
	public void buscarComando() {
		System.out.println("Buscar comando: ");
		System.out.println("Para salir pulse 4");
		boolean Salir = false;
		 try {
			  Scanner sc = new Scanner(System.in);
		      File myObj = new File("FileWriterTest.txt");
		      Scanner myReader = new Scanner(myObj);
		      
		      while(Salir == false) {
		    	  String comando = sc.next();
		    	  if(comando.equals("4")) {
		    		  Salir = true;
		    		  
		    	  }else {
				      
		    		  while (myReader.hasNextLine()) {
					        String data = myReader.nextLine();
					        System.out.println(data);
					      }
		    		  
		    	  }
		      }
		      
		      myReader.close();
		      
		      
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

		//abrir fichero txt e imprimir el texto
		//numerar 
		//esperar que ingrese 
		}
	
	public void eliminarComando() {
		System.out.println("Eliminar comando");
	}
	
	
}
