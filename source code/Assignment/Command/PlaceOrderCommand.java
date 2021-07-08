package Assignment.Command;

import java.util.Vector;

import Assignment.LunchItems.Menu;

public abstract class PlaceOrderCommand implements Command {
    protected String drink ;
    protected int staffNum , officeLoc ; 
    protected Menu menu ;
    protected Vector orders ;


    public PlaceOrderCommand(String drink, int staffNum, int officeLoc, Menu menu , Vector orders) {
        this.drink = drink;
        this.staffNum = staffNum;
        this.officeLoc = officeLoc;
        this.menu = menu;
        this.orders = orders;
    }
    
    @Override
    public abstract void execute();
    
}
