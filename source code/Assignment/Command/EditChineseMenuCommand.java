package Assignment.Command;
import java.util.*;

import Assignment.LunchItems.ChineseMenu;
public class EditChineseMenuCommand extends EditMenuCommand {
    public EditChineseMenuCommand(HashMap _menus, String mainDish, int price, int availableCount) {
        super(_menus, mainDish,price, availableCount) ;

    }

    @Override
    public void execute() {
        menu = new ChineseMenu(price , availableCount , mainDish);
        _menus.put("c", menu);
        System.out.println("Menu Updated");

    }
}
