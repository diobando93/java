package nivel1;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        Singleton undo = Singleton.getInstancia();
        //String opcion;
        boolean Salir = false;

        while(Salir == false) {

            System.out.println("Ingrese un numero: ");
            System.out.println("1. Agregar comandos");
            System.out.println("2. Buscar comandos");
            System.out.println("3. Eliminar comandos");
            System.out.println("4. Salir");

            //Ingrese datos usando BufferReader
            Scanner sc = new Scanner(System.in);

            // Leyendo datos usando readLine
            String opcion = sc.next();
            System.out.println("eligio la opcion " + opcion);


           //opcion = System.console().readLine();

            if(opcion.equals("1")) {
                undo.agregarComando();
                if(opcion.equals("4")) {
                    Salir = true;
                }
            }

            if(opcion.equals("2")) {
                undo.buscarComando();
                if(opcion.equals("4")) {
                    Salir = true;
                }
            }
            if(opcion.equals("3")) {
                undo.eliminarComando();
                if(opcion.equals("4")) {
                    Salir = true;
                }
            }
            if(opcion.equals("4")) {
                Salir = true;
            }
            //if(opcion != "1"  opcion != "2"  opcion != "3" || opcion != "4") {
                //System.out.println("Mal ingreso de opcion");
                //Salir = true;
            //}
        }
    }

}
