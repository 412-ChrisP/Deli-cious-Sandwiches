package YearUp.pluralsight;

import java.util.*;

public class Userinterface
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean running = true;
        while (running)
        {
            System.out.println("\nWelcome to DELI-cious!");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    startNewOrder();
                    break;
                case 0:
                    running = false;
                    System.out.println("Thank you for visiting DELI-cious!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void startNewOrder()
    {
        Order currentOrder = new Order();
        boolean ordering = true;

        while (ordering)
        {
            System.out.println("\nOrder Menu:");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    addSandwich(currentOrder);
                    break;
                case 2:
                    addDrink(currentOrder);
                    break;
                case 3:
                    addChips(currentOrder);
                    break;
                case 4:
                    currentOrder.checkoutOrder();
                    ordering = false;
                    break;
                case 0:
                    currentOrder.cancelOrder();
                    System.out.println("Order has been canceled.");
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        }
    }

    public static void addSandwich(Order order)
    {
        System.out.print("Enter sandwich size (4\", 8\", 12\"): ");
        String size = scanner.nextLine();

        System.out.print("Enter bread type (white, wheat, rye, wrap): ");
        String bread = scanner.nextLine();

        System.out.print("Would you like the sandwich toasted? (yes/no): ");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich();
        sandwich.selectSize(size);
        sandwich.selectBread(bread);
        sandwich.setToasted(toasted);
        sandwich.addToppings();

        order.addSandwich(sandwich);
        System.out.println("Sandwich added to order.");
    }

    public static void addDrink(Order order)
    {
        System.out.print("Enter drink size (Small, Medium, Large): ");
        String size = scanner.nextLine();

        Drink drink = new Drink(size);
        order.addDrink(drink);
        System.out.println("Drink added to order.");
    }

    public static void addChips(Order order)
    {
        Chips chips = new Chips("Small");
        order.addChips(chips);
        System.out.println("Chips added to order.");
    }
}