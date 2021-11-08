package ej4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class Main {
	
	public static void main(String [] args) {
		
		Iterador gen = new Iterador();
        ArrayList<String> al = new ArrayList<String>();
        for(int i=0; i<3;i++) {
            al.add(gen.next());
        }
        HashSet<String> hs = new HashSet<String>();
        for(int i=0; i<3;i++) {
            hs.add(gen.next());
        }

        TreeSet<String> ts = new TreeSet<String>();
        for(int i=0; i<3;i++) {
            ts.add(gen.next());
        }
        
        System.out.println("Array List");
        
        Iterator<String> it = al.iterator();
        
        while(it.hasNext()) {
        	  System.out.println(it.next());
        }
        
        System.out.println("Hash set");
        
        Iterator<String> hst = hs.iterator();
        
        while(hst.hasNext()) {
      	  System.out.println(hst.next());
        }
        
        System.out.println("Tree set");
        Iterator<String> tst = ts.iterator();
        
        while(tst.hasNext()) {
      	  System.out.println(tst.next());
        }
		
	}
}
