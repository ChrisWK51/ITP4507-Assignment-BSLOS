package Assignment.Factory;

import Assignment.CareTaker.CareTaker;
import Assignment.Command.*;

import java.util.*;

public class ShowMenuCommandFactory implements CommandFactory {
    private Vector _orders ; 
    private HashMap _menus;
    private CareTaker careTaker;
    
    public ShowMenuCommandFactory(){
        _orders = null;
    }
    @Override
    public void setOrders(Vector orders) {
        _orders = orders;

    }

    @Override
    public Command create(Scanner sc) throws Exception {
        
        return new ShowMenuCommand(_menus);
    }

    @Override
    public void setMenus(HashMap menus) {
        _menus = menus;
        
    }
    public void setCareTaker(CareTaker careTaker) {
        this.careTaker = careTaker;

    }

    
    
}
