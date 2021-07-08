package Assignment.Factory;
import Assignment.CareTaker.CareTaker;
import Assignment.Command.*;
import java.util.*;


public interface CommandFactory {

    abstract public void setOrders(Vector orders);
    abstract public void setMenus(HashMap menus);
    abstract public Command create(Scanner sc) throws Exception;
    abstract public void setCareTaker(CareTaker careTaker);
}
