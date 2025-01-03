import MyPackage.*;
import YourPackage.*;

public class JavaProgram {
    public static void main(String[] args) {

        Car myCar = new Car("Honda", "Civic");

//        myCar.make = "Honda";
//        myCar.model = "Civic";

        Car mySecondCar = new Car();
        mySecondCar.make = "Mercedes";
        mySecondCar.model = "Benz";

        myCar.startEngine();
        mySecondCar.startEngine();

//        System.out.println(myCar.kwToHp(150));
//        myCar.kwToHp(150);
//        mySecondCar.kwToHp(200);

        double horsePower = myCar.kwToHp(150);
        double horsePower2 = mySecondCar.kwToHp(200);

        System.out.println("Konjska snaga Honde je: " + horsePower);
        System.out.println("Konjska snaga Mercedesa je: " + horsePower2);

    }
    MyPackage.MyClass myClass = new MyPackage.MyClass();
    YourPackage.MyClass myClass2 = new YourPackage.MyClass();
}
