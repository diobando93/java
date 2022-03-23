package nivel2ej1;

@FileDestinationAnnotation(Folder="/home/israel/Desktop", FileName="\\nbaplayer.json")
public class NbaPlayer {
	
	private String nombre;
	private String posicion;
	private double altura;
	
	public NbaPlayer(String nombre, String posicion, double altura) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "NbaPlayer [nombre=" + nombre + ", posicion=" + posicion + ", altura=" + altura + "]";
	}

}
