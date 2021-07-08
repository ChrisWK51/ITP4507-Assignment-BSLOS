package Assignment.Factory;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import Assignment.CareTaker.CareTaker;
import Assignment.Command.*;

public class PlaceOrderCommandFactory implements CommandFactory {
    private Vector _orders;
    private HashMap _menus ;
    protected String drink ;
    protected int staffNum , officeLoc ;
    private CareTaker careTaker;
    public PlaceOrderCommandFactory() {
        _orders = null;
    }

    @Override
    public void setOrders(Vector orders) {
        _orders = orders;

    }

    @Override
    public Command create(Scanner sc) throws Exception {
        HashMap<String, String> menuFactoryMap = new HashMap<String, String>() {{
            put("c", "PlaceChineseLunchSetOrderCommandFactory");
            put("w", "PlaceWesternLunchSetOrderCommandFactory");
        }};
        System.out.println("\nPlace Order");
        System.out.print("Chinese or Western(c|w):");
        String option = sc.nextLine();
        option = option.toLowerCase();
        String _factory = menuFactoryMap.get(option);
        if (_factory == null) {
            System.out.println("Invalid Option");
            return null;
        }
        PlaceOrderCommandFactory pCommandFactory = (PlaceOrderCommandFactory) Class.forName("Assignment.Factory."+_factory).newInstance();
        pCommandFactory.setOrders(_orders);
        pCommandFactory.setMenus(_menus);
        
        return pCommandFactory.create(sc);
    }
   
 
    @Override
    public void setMenus(HashMap menus) {
        _menus = menus;

    }
    public void setCareTaker(CareTaker careTaker) {
        this.careTaker = careTaker;

    }

    
}
