package Assignment.LunchItems;
public class WesternLunchSet extends LunchSet {
    private final String CODE = "W";
    private String starchDish ;
    public WesternLunchSet(Menu menu, int staffNum, int officeLocation, String drink , String starchDish) {
        super(menu , staffNum, officeLocation, drink);
        this.starchDish = starchDish;
        
    }

    public String getStarchDish() {
        return this.starchDish;
    }

    public void setStarchDish(String starchDish) {
        this.starchDish = starchDish;
    }



    public String getCODE() {
        return this.CODE;
    }

    public String toString(){
        String msg = String.format("%s: %d,%d,%s,%s,%s,%s", CODE , staffNum , officeLocation ,menu.getMainDish() , starchDish , menu.getSoup() , drink   );
        return msg ;
    }

    
}
