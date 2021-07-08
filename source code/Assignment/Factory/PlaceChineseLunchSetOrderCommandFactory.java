package Assignment.Factory;

import java.util.*;

import Assignment.Command.Command;
import Assignment.LunchItems.Menu;
import Assignment.Command.*;

public class PlaceChineseLunchSetOrderCommandFactory extends PlaceOrderCommandFactory {
    private Vector _orders;
    private HashMap _menus;
    private String starchDish;
    public PlaceChineseLunchSetOrderCommandFactory() {
        _orders = null;
        _menus = null;
    }

    @Override
    public void setOrders(Vector orders) {
        _orders = orders;

    }

    @Override
    public Command create(Scanner sc) throws Exception {
        Menu cm =  (Menu)_menus.get("c");
        if (cm.getAvailableCount() <= 0){
                System.out.println("\nSold Out!");
                return null;
        }
        HashMap<String, String> drinkDishMap = new HashMap<String, String>() {{
            put("h", "Hot Tea");
            put("i", "Iced Tea");
            
        }};
        
        try {

            System.out.print("Oolong Tea: hot or iced (h | i): ");
            String option = sc.nextLine();
            option = option.toLowerCase();
            drink = drinkDishMap.get(option);
            if (drink == null) {
                System.out.println("Invalid Option");
                return null;
            }
            System.out.print("Staff Number: ");
            staffNum =  Integer.parseInt(sc.nextLine());
            System.out.print("Office Location: ");
            officeLoc =  Integer.parseInt(sc.nextLine());
            Menu menu = (Menu) _menus.get("c");
          
            
            return new PlaceCLSOrderCommand(drink, staffNum, officeLoc, menu , _orders);
        }
        catch (Exception e){
            System.out.println("Invaild Integer");
            return null ;
        }
        
    }

    @Override
    public void setMenus(HashMap menus) {
        _menus = menus;

    }
}
