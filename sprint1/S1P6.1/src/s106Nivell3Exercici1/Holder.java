package s106Nivell3Exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class Holder<T> {

	public Holder(int i) {
		// TODO Auto-generated constructor stub
	}

	public Holder(String string) {
		// TODO Auto-generated constructor stub
	}

	public Holder(double d) {
		// TODO Auto-generated constructor stub
	}

	public Holder() {
		// TODO Auto-generated constructor stub
	}

	
//creanos funcion con Holder<List<?>> y aplicamos unos cuantos metodos para ver como van
	static void f1(Holder<List<?>> holder) {
		System.out.println(("Calling methods for the Holder: "));
		System.out.println("holder: " + holder);
		System.out.println("holder.get(): " + holder.get());
		System.out.println("Calling holder.set(Arrays.asList(1,2,3)");
		holder.set(Arrays.asList(1, 2, 3));
		System.out.println("holder.get(): " + holder.get());
		int[] ia = { 1, 2, 3 };
		System.out.println("int[] ia = {1,2,3}");

	}

	private List<?> get() {
		// TODO Auto-generated method stub
		return null;
	}

	private void set(List<Integer> asList) {
		// TODO Auto-generated method stub

	}
	//creanos funcion con List<Holder<?>> y aplicamos unos cuantos metodos para ver como van
	static void f2(List<Holder<?>> list) {
		System.out.println("Calling methods for the List: ");
		System.out.println("list = " + list);
		System.out.println("Adding Integer, String, Double");
		list.add(new Holder<Integer>(1));
		list.add(new Holder<String>("two"));
		list.add(new Holder<Double>(3.0));
		System.out.println("list = " + list);
		System.out.println("Elements of list: ");
		for (Holder h : list)
		System.out.println("h.get() = " + h.get());

	}
}
