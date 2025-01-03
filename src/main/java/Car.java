public class Car {
    String make;
    String model;

    void startEngine() {
        System.out.println("Engine of " + make + " " + model + " started");
    }
    Car(){}
    Car(String make, String model){
        this.make = make;
        this.model = model;
    }
    double kwToHp(int kw) {
        double hp = kw / 0.74;
        return hp;
    }
}
