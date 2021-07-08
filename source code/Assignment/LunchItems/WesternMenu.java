package Assignment.LunchItems;
public class WesternMenu extends Menu {
    private String mainDish ;
    private String soup;

    public String getMainDish() {
        return this.mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }
    
    public WesternMenu() {
        super();
        mainDish ="";
        soup = "Western soup";
    }
    public WesternMenu(int price, int availableCount , String mainDish ) {
        super(price, availableCount);
        this.mainDish = mainDish;
        soup = "Western soup";
            
    
    }
    public String toString() {
        return "Western style Business Set Lunch\n" 
                + "main dish: " + mainDish 
                + "\nwith rice, Western soup, Chinese tea\n" 
                + super.toString(); 
    }

    public String getSoup() {
        return this.soup;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }

  

    
}
