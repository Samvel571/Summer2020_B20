package practice.Interface;

public abstract class Phone extends InvalidPriceException {

    String brand;
    String model;
    double price;
    double size;

    public abstract void texting(long number);

    public abstract void calling(long number);

    public Phone(String brand, String model, double price, double size) {
        super("Invalid Price, cannot be negative");
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
        if (price < 0) {
            throw new InvalidPriceException(getMessage());
        }
    }

    @Override
    public String toString() {
        return
                "Brand: " + brand + ", Model: " + model + ", Price: " + price + ", Size: " + size + " inches";
    }
}

