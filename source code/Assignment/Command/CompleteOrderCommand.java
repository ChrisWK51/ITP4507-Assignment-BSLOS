package Assignment.Command;

import java.util.Vector;

import Assignment.LunchItems.LunchSet;

public class CompleteOrderCommand implements Command{
    private Vector orders;
    public CompleteOrderCommand(Vector orders){
        this.orders = orders;
    }

    @Override
    public void execute() {
        if (orders.size() >0 ){
            LunchSet ls = (LunchSet) orders.elementAt(0);
            System.out.println(ls.toString());
            orders.remove(ls);
            System.out.println("Order marked as done");
        }else {
            System.out.println("No order now");
        }

    }
    
}
