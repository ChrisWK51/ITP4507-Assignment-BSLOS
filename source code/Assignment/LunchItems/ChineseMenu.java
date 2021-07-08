package Assignment.LunchItems;
public class ChineseMenu extends Menu {
    private String mainDish ;
    private String soup;

    public ChineseMenu(int price, int availableCount , String mainDish) {
        super(price, availableCount);
        this.mainDish = mainDish;
        soup = "Chinese soup";
   
    }
    public ChineseMenu(){
        super();
        mainDish = "";
        soup = "Chinese soup";
    }
    
    public String getSoup() {
        return this.soup;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }
    
    

    public String getMainDish() {
        return this.mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    
    
    public String toString() {
        return "Chinese style Business Set Lunch\n" 
                +"main dish: " + mainDish 
                + "\nwith rice, Chinese soup, Chinese tea\n" 
                + super.toString();   
    }
}

