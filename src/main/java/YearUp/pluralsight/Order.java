package YearUp.pluralsight;

import java.util.*;

public class Order
{
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();

    public void addSandwich(Sandwich sandwich)
    {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink)
    {
        drinks.add(drink);
    }

    public void addChips(Chips chip)
    {
        chips.add(chip);
    }

    public void checkoutOrder()
    {
        double total = 0.0;
        for (Sandwich sandwich : sandwiches)
        {
            System.out.println(sandwich);
            total += sandwich.calculateSandwichPrice();
        }

        for (Drink drink : drinks)
        {
            System.out.println(drink);
            total += drink.getDrinkPrice();
        }

        for (Chips chips : chips)
        {
            System.out.println(chips);
            total += chips.getChipPrice();
        }

        System.out.println("Order Details:");
        System.out.println("Sandwiches: " + sandwiches.size());
        System.out.println("Drinks: " + drinks.size());
        System.out.println("Chips: " + chips.size());
        System.out.printf("Total: $%.2f%n", total);

    }

    public void cancelOrder()
    {
        sandwiches.clear();
        drinks.clear();
        chips.clear();
        System.out.println("Order canceled.");
    }
}
