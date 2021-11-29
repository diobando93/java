package nivel2ej2;

public class Generic {
	public <T extends Interface1> void metodo1(T o) {
		o.f();
		o.g();
	}
	public <T extends Interface2> void metodo2(T o) {
		o.h();
		o.j();
	}

}
