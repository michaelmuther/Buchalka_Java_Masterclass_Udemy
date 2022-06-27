package oop_final_challenge;

import java.util.ArrayList;

public class Hamburger {

    private String name = "Hamburger";
    int maxToppings;
    private String bun;
    private String meat;
    private double basePrice;
    private double toppingPrice = 0.49;
    ArrayList<String> toppings = new ArrayList<>();

    public Hamburger(String name, String bun, String meat, double basePrice) {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.basePrice = basePrice;
        this.maxToppings = 4;
    }

    private double getTotalPrice() {
        return basePrice + toppingPrice * toppings.size();
    }

    public void add(String topping) {
        if (toppings.size() < maxToppings) {
            toppings.add(topping);
        }
    }

    public void burgerDescriptionAndPrice(){
        System.out.print("You ordered a " + name);
        if (toppings.size() > 0) {
            System.out.print(" with " + toppings.get(0));
        }
        if (toppings.size() >= 3) {
            for (int i = 1; i < toppings.size() - 1; i++) {
                System.out.print(", " + toppings.get(i));
            }
            System.out.print(",");
        }
        if (toppings.size() >= 2) {
            System.out.print(" and " + toppings.get(toppings.size() - 1));
        }
        System.out.print("!\n");
        System.out.println("The meat is " + meat + " and the bun is " + bun + ".");
        System.out.printf("The price is $%.2f.\n\n", getTotalPrice());
    }
}
