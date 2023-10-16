public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red");
        car.setMake(null);
        car.setDoors(2);
        System.out.println("Bo = "+ car.getColor());
        car.describeCar();
    }
}
