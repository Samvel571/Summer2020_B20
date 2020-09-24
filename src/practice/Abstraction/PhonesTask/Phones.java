package practice.Abstraction.PhonesTask;

public abstract class Phones {

    String brand;
    String model;
    double size;
    double price;

    public Phones(String brand, String model, double size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
    }

    public abstract void call(long number);

    public abstract void text(long number);

}
