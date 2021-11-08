package ej4;

public class Iterador {
	
    private String array[]  =new String[10];
    private int index;
    public Iterador() {
        index=0;
        array[0]="Frodo";
        array[1]="Gandalf";
        array[2]="Boromir";
        array[3]="Aragorn";
        array[4]="Arguen";
        array[5]="mateo";
        array[6]="jesus";
        array[7]="maria";
        array[8]="jose";
        array[9]="pedro";
    }
    public String next() {
        int temp=index;
        index = index+1;
        index = index%array.length;
        return array[temp];
    }

}
