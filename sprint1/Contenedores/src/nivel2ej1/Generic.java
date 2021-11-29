package nivel2ej1;

public class Generic {
	
	public <T extends Interface> void Generica(T o) {
		o.f();
		o.f2();
	}
	
}
