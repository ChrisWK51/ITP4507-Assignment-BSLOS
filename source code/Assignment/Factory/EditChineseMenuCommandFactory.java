package Assignment.Factory;

import java.util.*;

import Assignment.Command.*;

public class EditChineseMenuCommandFactory extends EditMenuCommandFactory {
    private Vector _orders;
    private HashMap _menus;
    public EditChineseMenuCommandFactory() {
        _orders = null;
        _menus = null;
    }

    @Override
    public void setOrders(Vector orders) {
        _orders = orders;

    }

    @Override
    public Command create(Scanner sc) throws Exception {

        try{

            System.out.print("Enter main dish:");
            mainDish = sc.nextLine();
            System.out.print("Enter price:");

            price =  Integer.parseInt(sc.nextLine());
            System.out.print("Enter available count:");
            availableCount =  Integer.parseInt(sc.nextLine());

            return new EditChineseMenuCommand(_menus , mainDish , price , availableCount );

        }catch (Exception e){

            
            return null ;
        }
       
    }

    @Override
    public void setMenus(HashMap menus) {
        _menus = menus;

    }
}
