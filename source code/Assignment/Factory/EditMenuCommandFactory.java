package Assignment.Factory;

import Assignment.CareTaker.CareTaker;
import Assignment.Command.*;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class EditMenuCommandFactory implements CommandFactory {
    private Vector _orders;
    private HashMap _menus;
    protected String mainDish ;
    protected int price  , availableCount;
    private CareTaker careTaker;
    public EditMenuCommandFactory() {
        _orders = null;
    }

    @Override
    public void setOrders(Vector orders) {
        _orders = orders;

    }

    @Override
    public Command create(Scanner sc) throws Exception {
        HashMap<String, String> menuFactoryMap = new HashMap<String, String>() {{
            put("c", "EditChineseMenuCommandFactory");
            put("w", "EditWesternMenuCommandFactory");
        }};
        System.out.println("\nEdit Menu");
        System.out.print("Chinese or Western(c|w):");
        String option = sc.nextLine();
        option = option.toLowerCase();
        String _factory = menuFactoryMap.get(option);
        if (_factory == null) {
            System.out.println("Invalid Option");
            return null;
        }
        EditMenuCommandFactory menuCommandFactory = (EditMenuCommandFactory) Class.forName("Assignment.Factory."+_factory).newInstance();
        menuCommandFactory.setOrders(_orders);
        menuCommandFactory.setMenus(_menus);
        
        return menuCommandFactory.create(sc);
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
