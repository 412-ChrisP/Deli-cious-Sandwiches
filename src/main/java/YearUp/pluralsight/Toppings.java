package YearUp.pluralsight;

import java.util.*;

public abstract class Toppings
{
    protected String name;

    public Toppings()
    {
    }

    public String getName()
    {
        return name;
    }

    public void getToppingType()
    {
        Scanner scanner = new Scanner(System.in);

        boolean addingToppings = true;
        while (addingToppings)
        {
            System.out.println("Select a topping category:");
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
                case 1 -> MeatToppings.getMeatTopping();
                case 2 -> CheeseToppings.getCheeseTopping();
                case 3 -> RegularToppings.getRegularTopping();
                case 4 -> SauceToppings.getSauceTopping();
                case 0 -> addingToppings = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public abstract double calcToppingPrice(SandwichSize size);
}