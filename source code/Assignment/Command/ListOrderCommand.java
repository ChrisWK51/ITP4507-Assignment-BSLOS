package Assignment.Command;

import java.util.HashMap;
import java.util.Vector;

import Assignment.LunchItems.LunchSet;

public class ListOrderCommand implements Command {
    private Vector orders ;
    public ListOrderCommand(Vector orders){
        this.orders = orders;
    }
    @Override
    public void execute() {

        for (int i= 0 ; i < orders.size() ; i++){
            LunchSet ls = (LunchSet) orders.get(i);
            System.out.println(ls.toString());
        }

    }
    
}
