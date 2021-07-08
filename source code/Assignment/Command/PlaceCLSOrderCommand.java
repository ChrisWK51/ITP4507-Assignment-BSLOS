package Assignment.Command;

import java.util.Vector;

import Assignment.LunchItems.ChineseLunchSet;
import Assignment.LunchItems.LunchSet;
import Assignment.LunchItems.Menu;

public class PlaceCLSOrderCommand extends PlaceOrderCommand{

    public PlaceCLSOrderCommand(String drink, int staffNum, int officeLoc, Menu menu , Vector orders) {
        super(drink, staffNum, officeLoc, menu ,orders);
    }

    
    @Override
    public void execute() {
      
        LunchSet ls = new ChineseLunchSet(menu, staffNum, officeLoc, drink);
        orders.add(ls);
        menu.setAvailableCount(menu.getAvailableCount() - 1);
        System.out.println("Order Placed");
        
    }
    
}
