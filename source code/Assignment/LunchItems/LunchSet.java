package Assignment.LunchItems;

public abstract class LunchSet {
    protected Menu menu;
    protected int staffNum ;
    protected int officeLocation ;
    protected String drink ;
    private final String CODE ="" ;

    public LunchSet(Menu menu, int staffNum, int officeLocation, String drink) {
        this.menu = menu;
        this.staffNum = staffNum;
        this.officeLocation = officeLocation;
        this.drink = drink;
        
    }

    public String getCODE() {
        return this.CODE;
    }

	public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getStaffNum() {
        return this.staffNum;
    }

    public void setStaffNum(int staffNum) {
        this.staffNum = staffNum;
    }

    public int getOfficeLocation() {
        return this.officeLocation;
    }

    public void setOfficeLocation(int officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getDrink() {
        return this.drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public Menu getMenu() {
        return menu;
    }
    public abstract String toString();
}

    
