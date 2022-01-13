package conectionSQL;

import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "123");
			System.out.println("conexion ok");
		}catch(ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
	}
}
