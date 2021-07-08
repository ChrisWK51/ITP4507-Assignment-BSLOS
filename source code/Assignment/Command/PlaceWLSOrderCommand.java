package Assignment.Command;

import java.util.Vector;

import Assignment.LunchItems.LunchSet;
import Assignment.LunchItems.Menu;
import Assignment.LunchItems.WesternLunchSet;

public class PlaceWLSOrderCommand extends PlaceOrderCommand {
    private String starchDish;
    public PlaceWLSOrderCommand(String drink, int staffNum, int officeLoc, Menu menu , Vector orders , String starchDish) {
        super(drink, staffNum, officeLoc, menu ,orders);
        this.starchDish  = starchDish ;
    }

    
    @Override
    public void execute() {
        LunchSet ls = new WesternLunchSet(menu, staffNum, officeLoc, drink, starchDish);
        orders.add(ls);
        menu.setAvailableCount(menu.getAvailableCount() - 1);
        System.out.println("Order Placed");
        
    }
    
}
