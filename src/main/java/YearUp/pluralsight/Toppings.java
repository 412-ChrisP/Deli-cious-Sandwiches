package YearUp.pluralsight;

import java.util.*;

public abstract class Toppings
{
    protected String name;

    public Toppings(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public static Toppings getToppingType()
    {
        Scanner scanner = new Scanner(System.in);
        Toppings toppingsSelection = null;

        boolean addingToppings = true;
        while (addingToppings)
        {
            System.out.println("\nSelect a topping category:");
            System.out.println("1) Meat");
            System.out.println("2) Cheese");
            System.out.println("3) Regular Toppings");
            System.out.println("4) Sauces");
            System.out.println("0) Done adding toppings");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1 -> toppingsSelection = MeatToppings.getMeatTopping();
                case 2 -> toppingsSelection = CheeseToppings.getCheeseTopping();
                case 3 -> toppingsSelection = RegularToppings.getRegularTopping();
                case 4 -> toppingsSelection = SauceToppings.getSauceTopping();
                case 0 -> addingToppings = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        return toppingsSelection;
    }

    public abstract double calcToppingPrice(SandwichSize size);
}