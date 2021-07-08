package Assignment.Factory;

import java.util.*;

import Assignment.CareTaker.CareTaker;
import Assignment.Command.*;
public class CompleteOrderCommandFactory implements CommandFactory {
    private Vector _orders ;
    private HashMap _menus ;
    private CareTaker careTaker;
    public CompleteOrderCommandFactory() {
        _orders = null;
    }

    @Override
    public void setOrders(Vector orders) {
        _orders = orders;

    }

    @Override
    public Command create(Scanner sc) throws Exception {
        System.out.println("\nComplete Order");
        return new CompleteOrderCommand(_orders);
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
