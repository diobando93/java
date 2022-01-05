package nivel3;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class Broker implements Order{
	
	private ArrayList<Order> orderList = new ArrayList<Order>(); 


	public void takeOrder(Order order){
		
		orderList.add(order);		
	}

	@Override
	public void execute(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		for(Order t: orderList) {
			if(t instanceof Arrancar) {
				t.execute(vehiculo);
			}else if(t instanceof Acelerar) {
				t.execute(vehiculo);
			}else if(t instanceof Frenar) {
				t.execute(vehiculo);
			}
		}
			
	}
	   
	   
	   

}
