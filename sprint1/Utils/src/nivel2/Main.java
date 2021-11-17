package nivel2;

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

public class Main {
	
	public static void main(String[] args) {
		

		
		try(InputStream input = new FileInputStream("C:\\Users\\formacio\\Desktop\\java\\sprint1\\Utils\\config.properties")){
			
			Properties prop = new Properties();
			prop.load(input);
			System.out.println(prop.getProperty("direccionConfiguracion"));
			System.out.println(prop.getProperty("direccionGuardar"));
			FileWriter fl = new FileWriter(prop.getProperty("direccionGuardar"));
			PrintWriter pw = new PrintWriter(fl);
			buscarEnDirectorio(new File(prop.getProperty("direccionConfiguracion")), pw);
			
		}catch(IOException ex) {
			
		}
		
		
		
	}
	
	public static void buscarEnDirectorio(File directorio, PrintWriter pw) throws IOException {
		
        System.out.println("D " + directorio);
        File[] listado = directorio.listFiles();
        if (listado!=null) {
            for(File file:listado) {
                if (file.isDirectory())
                    buscarEnDirectorio(file, pw);
                else {
                	pw.println("F "+file+"-"+new Date(file.lastModified()));
                    System.out.println("F "+file+"-"+new Date(file.lastModified()));
                }
            }
        }else {
        	pw.println("D "+directorio);
           System.out.println("D "+directorio);
        }
    }

}


/*
 * 
 * 		try(OutputStream output = new FileOutputStream("config.properties")){
			
			Properties prop = new Properties();
			prop.setProperty("direccion", "C:\\\\Program Files\\\\Common Files\\\\microsoft shared");
			prop.store(output, null);
		
		}catch(IOException io) {
			io.printStackTrace();
		}
 */
