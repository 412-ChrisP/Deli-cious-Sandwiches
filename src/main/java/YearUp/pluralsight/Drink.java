package YearUp.pluralsight;

import java.util.*;

public class Drink
{
    private String size;

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
            default ->
            {
                System.out.println("Invalid size. Setting price to $0.00.");
                yield 0.0;
            }
        };
    }

    @Override
    public String toString()
    {
        return "Drink{" + "size: '" + size + '\'' + '}';
    }
}