package Assignment.Command;

import java.util.*;

import Assignment.LunchItems.WesternMenu;

public class EditWesternMenuCommand extends EditMenuCommand {
    public EditWesternMenuCommand(HashMap _menus, String mainDish, int price, int availableCount) {
        super(_menus, mainDish,price, availableCount) ;

    }
    public void execute() {
        menu = new WesternMenu(price , availableCount , mainDish);
        _menus.put("w", menu);
        System.out.println("Menu Updated");

    }
}
