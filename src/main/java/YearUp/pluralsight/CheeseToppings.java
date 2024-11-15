package YearUp.pluralsight;

import java.util.*;

public class CheeseToppings extends Toppings
{
    public CheeseToppings(String name)
    {
        super(name);
    }

    public static Toppings getCheeseTopping()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cheese topping (american - provolone - cheddar - swiss): ");
        String cheeseName = scanner.nextLine();
        System.out.println("Added " + cheeseName);
        return new CheeseToppings(cheeseName);
    }

    @Override
    public double calcToppingPrice(SandwichSize size)
    {
        return switch (size)
        {
            case FOUR_INCH -> 0.75;
            case EIGHT_INCH -> 1.50;
            case TWELVE_INCH -> 2.25;
            default -> 0.0;
        };
    }

    @Override
    public String toString()
    {
        return name;
    }
}