package Assignment.Memento;


import Assignment.LunchItems.Menu;

public class Memento {
    private Menu menu ;
    private int availableCount ;
 
    public Memento(Menu menu) {
        this.menu = menu;
        this.availableCount = menu.getAvailableCount();
  
    }
   
    public void restore() {
       menu.setAvailableCount(availableCount+1);
    }


    public int getAvailableCount() {
        return availableCount;
    }

    
}
