public class Main {
    public static void main(String[] args) {
        Car theCar = Car.getCar("Electric","RR",
                0,75,0,20);
        runRace(theCar);

        System.out.println();

        Car ferrari = new GasPoweredCar("2022 ferrari",15.4,6);
        runRace(ferrari);
        System.out.println();

        Car tesla = new ElectriCar("Red Tesla", 568, 75);
        runRace(tesla);
        System.out.println();

        Car ferrariHybrid = Car.getCar("Hybrid","2022 Black ferrari",
                16,8,8,0);
        runRace(ferrariHybrid);
    }
    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
