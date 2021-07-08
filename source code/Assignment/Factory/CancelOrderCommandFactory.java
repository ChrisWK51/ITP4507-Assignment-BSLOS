package Assignment.Factory;
import Assignment.CareTaker.CareTaker;
import Assignment.Command.*;
import java.util.*;
import Assignment.CareTaker.*;
public class CancelOrderCommandFactory implements CommandFactory {
    private Vector _orders ;
    private HashMap _menus;
    private CareTaker careTaker;
    public void setOrders( Vector orders ) {
        _orders = orders;

    }
    
    
    
	public Command create(Scanner sc) throws Exception {
        try{
            System.out.println("\nCancel Order");
            System.out.print("Staff Number:");
            int staffNum = Integer.parseInt(sc.nextLine());
            return new CancelOrderCommand(_orders,staffNum , careTaker);
        }catch (Exception e){
            return null;
        }
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
