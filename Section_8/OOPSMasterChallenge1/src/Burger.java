public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger() {
        extra1 = new Item();
        extra2 = new Item();
        extra3 = new Item();
    }

    public Burger(String name,  double price) {
        super(name, "Burger", price);
    }

    public Item getExtra1() {
        return extra1;
    }

    public Item getExtra2() {
        return extra2;
    }

    public Item getExtra3() {
        return extra3;
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1==null) ? 0 : extra1.getAdjustedPrice())+
                ((extra2==null) ? 0 : extra2.getAdjustedPrice())+
                ((extra3==null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1, String extra2,String extra3) {
        this.extra1 = new Item(extra1, "TOPPING",getExtraPrice(extra1));
        this.extra2 = new Item(extra2, "TOPPING",getExtraPrice(extra2));
        this.extra3 = new Item(extra3, "TOPPING",getExtraPrice(extra3));
    }
    public void printItemizedList() {
        printItem("BASE BURGER",getBasePrice());
        if(extra1 != null) {
            extra1.printItem();
        }if(extra2 != null) {
            extra2.printItem();
        }if(extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("_".repeat(30));
        super.printItem();
    }
}
