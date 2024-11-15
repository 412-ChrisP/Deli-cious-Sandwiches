package YearUp.pluralsight;

import java.util.*;

public class Sandwich
{
    private SandwichSize size;
    private String bread;
    private boolean toasted;
    private final List<Toppings> toppings = new ArrayList<>();

    public Sandwich()
    {}

    public void selectBread(String bread)
    {
        this.bread = bread;
    }

    public void selectSize(String size)
    {
        switch (size)
        {
            case "4" -> this.size = SandwichSize.FOUR_INCH;
            case "8" -> this.size = SandwichSize.EIGHT_INCH;
            case "12" -> this.size = SandwichSize.TWELVE_INCH;
            default -> throw new IllegalArgumentException("Invalid sandwich size: " + size);
        }
    }

    public double calculateSandwichPrice()
    {
        double totalPrice = 0.0;
        double breadPrice = 0.0;

        switch (size)
        {
            case FOUR_INCH -> breadPrice = 5.50;
            case EIGHT_INCH -> breadPrice = 7.00;
            case TWELVE_INCH -> breadPrice = 8.50;
        }

        for (Toppings topping : toppings)
        {
            totalPrice += topping.calcToppingPrice(size);
        }

        return breadPrice + totalPrice;
    }

    public void addToppings()
    {
        Toppings.getToppingType(toppings);
    }

    public void setToasted(boolean toasted)
    {
        this.toasted = toasted;
    }

    @Override
    public String toString()
    {
        return "\nSandwich\n" +
                "Size: " + size +
                "\nBread: " + bread +
                "\nToasted: " + toasted +
                "\nToppings: " + toppings;
    }
}