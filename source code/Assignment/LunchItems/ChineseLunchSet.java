package Assignment.LunchItems;
public class ChineseLunchSet extends LunchSet{
    private final String CODE = "C";

    public ChineseLunchSet(Menu menu, int staffNum, int officeLocation, String drink) {
        super(menu , staffNum, officeLocation, drink);
      
        
    }



    public String getCODE() {
        return this.CODE;
    }

    public String toString(){
        String msg = String.format("%s: %d,%d,%s,%s,%s", CODE , staffNum , officeLocation ,menu.getMainDish(), menu.getSoup() , drink   );
        return msg ;
    }

    

}
