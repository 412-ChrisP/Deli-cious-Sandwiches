package YearUp.pluralsight;

import java.util.*;

public class Drink
{
    private final String size;

    public Drink(String size)
    {
        this.size = size;
    }

    public double getDrinkPrice()
    {
        return switch (size.toLowerCase())
        {
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> 0.00;
        };
    }

    @Override
    public String toString()
    {
        return "Drink{" + "size: '" + size + '\'' + '}';
    }
}