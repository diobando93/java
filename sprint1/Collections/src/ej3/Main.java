package ej3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
        Generator gen = new Generator();

        /////////////////////////////////
        ArrayList<String> al = new ArrayList<String>();
        for(int i=0; i<20;i++) {
            al.add(gen.next());
        }
        ///////////////////////////////
        HashSet<String> hs = new HashSet<String>();
        for(int i=0; i<20;i++) {
            hs.add(gen.next());
        }
        /////////////////////////////
        TreeSet<String> ts = new TreeSet<String>();
        for(int i=0; i<20;i++) {
            ts.add(gen.next());
        }

    }

}
