package ej8;


public class Habitacion implements Comparable<Habitacion> {
	
	private String name;
	private int id;
	
	public Habitacion() {
		
	}
	public Habitacion(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Habitacion [name=" + name + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(Habitacion o) {
		return this.getName().compareTo(o.getName());
		//return this.getId()-o.getId();
	}
	

}