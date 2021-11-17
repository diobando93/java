package ej3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
        Generator gen = new Generator();

        /////////////////////////////////
        ArrayList<String> al = new ArrayList<String>();
        for(int i=0; i<12;i++) {
            al.add(gen.next());
        }
        System.out.println(al);
        ///////////////////////////////
        HashSet<String> hs = new HashSet<String>();
        for(int i=0; i<12;i++) {
            hs.add(gen.next());
        }
        System.out.println(hs);
        /////////////////////////////
        TreeSet<String> ts = new TreeSet<String>();
        for(int i=0; i<12;i++) {
            ts.add(gen.next());
        }
        System.out.println(ts);

    }

}
