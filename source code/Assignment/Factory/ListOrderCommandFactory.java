package Assignment.Factory;

import Assignment.CareTaker.CareTaker;
import Assignment.Command.*;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class ListOrderCommandFactory implements CommandFactory {
    private Vector _orders;
    private HashMap _menus;
    private CareTaker careTaker;

    public ListOrderCommandFactory() {
        _orders = null;

    }

    @Override
    public void setOrders(Vector orders) {
        _orders = orders;

    }

    @Override
    public Command create(Scanner sc) throws Exception {
        System.out.println("\nOutstanding Orders");
        return new ListOrderCommand(_orders);
    }

    @Override
    public void setMenus(HashMap menus) {
        _menus = menus;

    }

    @Override
    public void setCareTaker(CareTaker careTaker) {
        this.careTaker = careTaker;

    }

    
    
}
