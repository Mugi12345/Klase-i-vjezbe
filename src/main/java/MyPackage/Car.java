package MyPackage;

public class Car {
    public String make;
    public String model;

    public void startEngine() {
        System.out.println("Engine of " + make + " " + model + " started");
    }
    public  Car(){}
    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }
    public double kwToHp(int kw) {
        double hp = kw / 0.74;
        return hp;
    }
}
