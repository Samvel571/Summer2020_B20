package day39_CustomClass;

public class Carmax {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();


        car1.setCarInfo("Lexus","RX250",2019,"White",14000,45000);
        car2.setCarInfo("Lexus","Rx450",2020,"Black",1000,50000);
        car3.setCarInfo("Bugatti", "Veyron", 2018,"blue",23000,500000);
        car4.setCarInfo("Ford","Escape",2018,"Blue",53123,89650);
        car5.setCarInfo("Nissan","GT-R", 2015,"Gray", 89650, 13000);

        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();
        car4.getCarInfo();
        car5.getCarInfo();


        car3.start();




    }
}
