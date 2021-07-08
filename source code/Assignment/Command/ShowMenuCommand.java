package Assignment.Command;

import java.util.HashMap;



public class ShowMenuCommand implements Command {
	private HashMap menus;
	public ShowMenuCommand(HashMap menus){
		this.menus = menus;
	}
	@Override
	public void execute() {
		menus.forEach((k,v)-> System.out.println("\n" + v.toString()));
			
	}

    
}