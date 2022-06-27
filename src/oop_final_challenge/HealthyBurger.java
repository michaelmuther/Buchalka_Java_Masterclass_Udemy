package oop_final_challenge;

public class HealthyBurger extends Hamburger{

    public HealthyBurger (String meat) {
        super("Healthy burger", "Brown rye bread", meat, 5.99);
        super.maxToppings = 6;
    }
}
