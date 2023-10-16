public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        // super.price += 19.10;
        System.out.println("Deluxe hamburger on a White roll with Sausage & Bacon," +
                "price is 14.54");
        System.out.println("Added Chips for and extra 2.75");
        System.out.println("Added Drink for and extra 1.81");
        System.out.println("Total Deluxe Burger price is 19.10");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        // super.price += price;
        // super.addHamburgerAddition1(name, price);
        System.out.println("No Additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        // super.addHamburgerAddition2(name, price);
        // super.price += 19.10;
        System.out.println("No Additional items can be added to a deluxe burger");

    }


    @Override
    public void addHamburgerAddition3(String name, double price) {
        // super.addHamburgerAddition3(name, price);
        // super.price += price;
        System.out.println("No Additional items can be added to a deluxe burger");

    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        // super.addHamburgerAddition4(name, price);
        // super.price += price;
        System.out.println("No Additional items can be added to a deluxe burger");

    }

}
