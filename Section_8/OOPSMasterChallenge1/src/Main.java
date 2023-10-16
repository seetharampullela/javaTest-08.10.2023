public class Main {
    public static void main(String[] args) {
//        Item mealItem = new Item("coke", "drink",1.50);
//        mealItem.printItem();
//        mealItem.setSize("LARGE");
//        mealItem.printItem();
//
//        Item avocado = new Item("avocado","Toppings",1.50);
//        avocado.printItem();
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder regMeal = new MealOrder();
//        regMeal.addBurgerTopping("BACON","CHEESE","CHAPATHI");
//        regMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
//        secondMeal.addBurgerTopping("HAM","CHEESE","AVOCADO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder secondMeal = new MealOrder("deluxe","7-up",
                "chili");
        secondMeal.addBurgerTopping("HAM","CHEESE","AVOCADO",
                "LETTUCE","BACON");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
    }
}
