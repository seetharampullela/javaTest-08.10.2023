public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public Customer(String name, double credit, String email) {
        this.name = name;
        this.creditLimit = credit;
        this.emailAddress = email;
    }
    public Customer() {
        this("Sai", 1500.0, "sai@email.com");
    }
    public Customer(String name, String email) {
        this(name, 10000, email);
    }
}
