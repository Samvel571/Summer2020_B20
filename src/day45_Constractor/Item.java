package day45_Constractor;

public class Item {

    String name;
    double unitPrice;
    int quantity;




    public Item(String Name,double unitPrice,int quantity){
        name=Name;
       this.unitPrice = unitPrice;
       this.quantity = quantity;
    }

    public double calcCost(){

        double total = quantity * unitPrice;

        return total;
    }

    @Override
    public String toString() {
        return
                "Name: " + name  + ",\nUnitPrice: " + unitPrice + "\nQuantity: " + quantity;
    }
}
