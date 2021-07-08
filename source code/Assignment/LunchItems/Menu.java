package Assignment.LunchItems;
public abstract class Menu {
    private int price;
    private int availableCount ;

    public Menu(int price, int availableCount) {
        this.price = price;
        this.availableCount = availableCount;
    }
    public Menu(){
        price = 0 ;
        availableCount = 0 ;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailableCount() {
        return this.availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }
    public abstract String getSoup();
    
    @Override 
    public String toString() {
        return "price: " + price + "\n" +
            "availableCount : " + availableCount  ;
    }
	public abstract String getMainDish() ;

   
}
