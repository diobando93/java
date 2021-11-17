package nivel2;
import java.util.Random;

public class Numero implements Comparable<Numero> {
	
	Random generaRandom = new Random();
	int num = generaRandom.nextInt(100);
	
	public Numero() {
		
	}
	public Numero(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}
	


	@Override
	public String toString() {
		return "Numero [num=" + num + "]";
	}



	@Override
	public int compareTo(Numero o) {
		// TODO Auto-generated method stub
		return this.getNum()-o.getNum();
	}
	
}
