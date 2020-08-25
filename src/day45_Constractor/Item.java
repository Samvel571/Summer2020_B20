package day45_Constractor;

public class Item {

    String name;
    double unitPrice;
    int quantity;

    public Item(String name,double unitPrice,int quantity){
        this.name=name;
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
                "Name: " + name  + ",\nunitPrice: " + unitPrice + ",\nquantity: " + quantity;
    }
}
