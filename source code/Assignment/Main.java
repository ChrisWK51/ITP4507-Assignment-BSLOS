package Assignment;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import Assignment.CareTaker.CareTaker;
import Assignment.Command.Command;
import Assignment.Factory.CommandFactory;
import Assignment.LunchItems.ChineseMenu;
import Assignment.LunchItems.LunchSet;
import Assignment.LunchItems.Menu;
import Assignment.LunchItems.WesternMenu;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static CareTaker caretaker = new CareTaker();

    public static void main(String[] args) {
        Vector<LunchSet> orders = new Vector<>();
        HashMap<String, Menu> menus = new HashMap<String, Menu>() {
            {
                put("c", new ChineseMenu());
                put("w", new WesternMenu());
            }
        };
        HashMap<String, String> _factoryMap = new HashMap<String, String>() {
            {
                put("e", "EditMenuCommandFactory");
                put("s", "ShowMenuCommandFactory");
                put("p", "PlaceOrderCommandFactory");
                put("c", "CancelOrderCommandFactory");
                put("l", "ListOrderCommandFactory");
                put("d", "CompleteOrderCommandFactory");
            }
        };
       
        while (true) {
            try {
                System.out.println("\nPlease enter command: [e | s | p | c | l | d | q]\n"
                        + "e = Edit menu, s = Show menu, p = Place order, c = Cancel order,\n"
                        + "l = List orders, d = order is Done, q = Quit");
                String option = sc.nextLine();
                option = option.toLowerCase();
                String _factory = _factoryMap.get(option);
                
                if (_factory != null){

                    CommandFactory commandFactory = (CommandFactory) Class.forName("Assignment.Factory."+_factory).newInstance();
                    commandFactory.setOrders(orders);
                    commandFactory.setMenus(menus);
                    commandFactory.setCareTaker(caretaker);
                    Command cmd = commandFactory.create(sc);
                    if (cmd != null) {
                        cmd.execute();
                        caretaker.saveMenusState(menus);
                    }
                    
                }else if (option.equals("q")) {
                    System.out.println("System is closing");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Option");
                }
            } catch (NumberFormatException e){
                System.out.println("\nOnly Integer are accepted!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}