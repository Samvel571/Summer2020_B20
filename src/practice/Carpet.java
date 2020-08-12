package practice;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian) {

        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

    }

    public double calcCost() {
        double total = (width * length) * unitPrice;
        if (isPersian) {
            return total + 200;
        }
        return total;
    }


    public void getCarpetInfo() {
        System.out.println("Width: " + width + ", Length: " + length + ", Unit price $" + unitPrice + ", Total Cost: $" + calcCost());
    }


}
