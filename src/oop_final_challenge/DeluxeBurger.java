package oop_final_challenge;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger (String bun, String meat) {
        super("Deluxe burger", bun, meat, 6.99);
        super.maxToppings = 2;
        toppings.add("fries");
        toppings.add("cola");
    }
}
