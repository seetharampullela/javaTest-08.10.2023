public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine() {
        System.out.println("Car Engine started");
    }
    public void drive() {
        System.out.println("driving, type is "+getClass().getSimpleName());
        this.runEngine();
    }
    protected void runEngine() {
        System.out.println("Engine is running");
    }
    public static Car getCar(String type, String description, int avgKmPerLiter,
                             int batterySize,int cylinders,int avgKmPerCharge) {
        return switch(type) {
            case "Electric":
                yield new ElectriCar(description,avgKmPerCharge,batterySize);
            case "Hybrid":
                yield new HybridCar(description,cylinders,batterySize,
                        avgKmPerLiter);
            default:
                yield new Car(description);
        };
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds average: @.2f%n",avgKmPerLiter);
    }
}

class ElectriCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectriCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery On, Ready!%n", batterySize);
    }

    @Override
    public void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f !%n", avgKmPerCharge);
    }

}

class HybridCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLiter, int cylinders,
                     int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> switch %d kWh battery On, Ready!%n", batterySize);
        System.out.printf("Hybrid -> switch %d kWh battery On, Ready!%n", batterySize );
    }

    @Override
    public void runEngine() {
        System.out.printf("Hybrid -> usage under the average: %.2f !%n", avgKmPerLiter);
    }
}


