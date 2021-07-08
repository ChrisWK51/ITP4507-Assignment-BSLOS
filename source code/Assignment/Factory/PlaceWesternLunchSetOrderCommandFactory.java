package Assignment.Factory;

import java.util.*;

import Assignment.Command.Command;
import Assignment.Command.PlaceWLSOrderCommand;
import Assignment.LunchItems.Menu;

public class PlaceWesternLunchSetOrderCommandFactory extends PlaceOrderCommandFactory {
    private Vector _orders;
    private HashMap _menus;
    private String starchDish;
    public PlaceWesternLunchSetOrderCommandFactory() {
        _orders = null;
        _menus = null;
    }

    @Override
    public void setOrders(Vector orders) {
        _orders = orders;

    }

    @Override
    public Command create(Scanner sc) throws Exception {
        Menu wm =  (Menu)_menus.get("w");
            if (wm.getAvailableCount() <= 0){
                System.out.println("\nSold Out!");
                return null;
            }
        HashMap<String, String> starchDishMap = new HashMap<String, String>() {{
            put("r", "rice");
            put("s", "spaghetti");
            put("f", "French fires");
        }};
        HashMap<String, String> drinkDishMap = new HashMap<String, String>() {{
            put("ht", "Hot tea");
            put("it", "Iced tea");
            put("hc", "Hot coffee");
            put("ic", "Iced coffee");
        }};
        try {
            
            System.out.print("side: rice, spaghetti, French fries (r | s | f):");

            String option = sc.nextLine();
            option = option.toLowerCase();
            starchDish = starchDishMap.get(option);

            if (starchDish == null) {
                System.out.println("Invalid Option");
                return null;
            }

            System.out.print("tea or coffee, hot or iced (ht| it | hc | ic): ");
            option = sc.nextLine();
            option = option.toLowerCase();
            drink = drinkDishMap.get(option);

            if (drink == null) {
                System.out.println("Invalid Option");
                return null;
            }

            System.out.print("Staff Number: ");
            staffNum = Integer.parseInt( sc.nextLine());
            System.out.print("Office Location: ");
            officeLoc = Integer.parseInt(sc.nextLine());
            Menu menu = (Menu) _menus.get("w");
          
            
            return new PlaceWLSOrderCommand(drink, staffNum, officeLoc, menu , _orders, starchDish);
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
