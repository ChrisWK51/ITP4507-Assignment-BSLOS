package Assignment.CareTaker;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import Assignment.LunchItems.Menu;
import Assignment.Memento.Memento;



public class CareTaker {

    private HashMap mementoMap;
    public CareTaker(){
       mementoMap = new HashMap<String, Memento>();
    }
    public void saveMenusState(HashMap<String,Menu> menus){

        for(String i : menus.keySet()){
        

            Menu menuValue =  menus.get(i);
            Memento mem = new Memento(menuValue);
            mementoMap.put(i, mem);
        }
    }
    public void restore(String code){
        Memento mem = (Memento) mementoMap.get(code);
        mem.restore();
    }
}
