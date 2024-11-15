package YearUp.pluralsight;

import java.util.*;

public class SauceToppings extends Toppings
{
    static Scanner scanner = new Scanner(System.in);

    public SauceToppings(String name)
    {
        super(name);
    }

    public static Toppings getSauceTopping()
    {
        System.out.print("Enter sauce topping (mayo - mustard - ketchup - ranch - thousand islands - vinaigrette): ");
        String sauceName = scanner.nextLine();
        System.out.println("Added " + sauceName);
        return new SauceToppings(sauceName);
    }

    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public double calcToppingPrice(SandwichSize size)
    {
        return 0.0;
    }
}