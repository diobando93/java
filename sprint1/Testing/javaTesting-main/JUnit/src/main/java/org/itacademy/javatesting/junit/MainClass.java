package org.itacademy.javatesting.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
	private List<String> lista;
	
	public MainClass(String[] elementos) {
		 this.lista= new ArrayList<String>
		            (Arrays.asList(elementos)); 
	}
	public int getSize() {
		return this.lista.size();
	}	
	
	public String getElement(int pos) {
		return lista.get(pos);
	}
	
}
