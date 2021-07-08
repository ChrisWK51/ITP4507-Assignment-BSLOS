package Assignment.Command;

import java.util.*;

import Assignment.LunchItems.Menu;

public abstract class EditMenuCommand implements Command {
    protected Menu menu; 
    protected HashMap _menus;
    protected String mainDish;
    protected int price;
    protected int availableCount;
    

    public EditMenuCommand(HashMap _menus, String mainDish, int price, int availableCount) {

        this._menus = _menus;
        this.mainDish = mainDish;
        this.price = price;
        this.availableCount = availableCount;
    }
        

    public abstract void execute();
    
}
