package YearUp.pluralsight;

import java.util.*;

public class Sandwich
{
    private String size;
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
            case "4" -> this.size = String.valueOf(SandwichSize.FOUR_INCH);
            case "8" -> this.size = String.valueOf(SandwichSize.EIGHT_INCH);
            case "12" -> this.size = String.valueOf(SandwichSize.TWELVE_INCH);
            default -> throw new IllegalArgumentException("Invalid sandwich size: " + size);
        }
    }

    public double calculateSandwichPrice()
    {
        double totalPrice = 0.0;
        SandwichSize sandwichSize = SandwichSize.valueOf(size.toUpperCase());

        for (Toppings topping : toppings)
        {
            totalPrice += topping.calcToppingPrice(sandwichSize);
        }

        return totalPrice;
    }

    public void addToppings()
    {
        Toppings toppingsSelection = new Toppings()
        {
            @Override
            public double calcToppingPrice(SandwichSize size)
            {
                return 0;
            }
        };

        toppingsSelection.getToppingType();
    }

    public void setToasted(boolean toasted)
    {
        this.toasted = toasted;
    }

    @Override
    public String toString()
    {
        return "Sandwich{" +
                "size:'" + size + '\'' +
                ", bread:'" + bread + '\'' +
                ", toasted:" + toasted +
                ", toppings:" + toppings +
                '}';
    }
}