public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price, String healthyExtra1Name, double healthyExtra1Price, String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
        System.out.println("Healthy hamburger on a " +
                "Brown rye roll with "+ meat + ", price is " + price);
    }

    public HealthyBurger(String meat, double price) {
        System.out.println("Healthy hamburger on a " +
                "Brown rye roll with "+ meat + ", price is " + price);
    }
    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Price = price;
        System.out.println("Added " + name  + " for an extra " + price);
    }
    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Price = price;

        System.out.println("Added " + name  + " for an extra " + price);
    }

    @Override
    public double itemizeHamburger() {
        return this.healthyExtra1Price + this.healthyExtra1Price;
    }
}
