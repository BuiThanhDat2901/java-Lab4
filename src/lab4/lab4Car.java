package lab4;

public class lab4Car {
    public static void main(String[] args) {
        SportCar c = new SportCar();
        c.accelerate();
        Car e = new LuxuryCar();
        e.accelerate();
        //Flowing is wrong because we are treating e as a Car not a Luxury Car
        ((LuxuryCar) e).service();
    }
}