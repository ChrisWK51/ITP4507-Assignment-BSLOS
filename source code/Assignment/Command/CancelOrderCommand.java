package Assignment.Command;

import java.util.Vector;

import Assignment.CareTaker.CareTaker;
import Assignment.LunchItems.LunchSet;

public class CancelOrderCommand implements Command{
	Vector orders ;
	int staffNum; 
	private CareTaker careTaker;
	public CancelOrderCommand(Vector orders , int staffNum ,CareTaker careTaker){
		this.orders = orders ;
		this.staffNum = staffNum;
		this.careTaker = careTaker;
	}
	@Override
	public void execute() {	
		for (int i = 0 ; i < orders.size() ; i++){
			LunchSet ls = (LunchSet) orders.elementAt(i);
			if (staffNum == ls.getStaffNum()){
				System.out.println(ls.toString());
				String code = ls.getCODE().toLowerCase();
				careTaker.restore(code);
				orders.remove(ls);
				System.out.println("Order Cancelled");
				return;
			}
			
		}
		System.out.println("No such order");
		if (orders.size() <= 0 ){
			System.out.println("no order right now");
		}
		
		
	}
    
}
