package YearUp.pluralsight;

import java.util.*;

public class RegularToppings extends Toppings
{
    static Scanner scanner = new Scanner(System.in);

    public RegularToppings(String name)
    {
        super();
    }

    public static Toppings getRegularTopping()
    {
        System.out.print("Enter regular topping (lettuce - peppers - onions - tomatoes - jalepenos - cucumbers - pickles - guacamole - mushrooms): ");
        String regularToppingName = scanner.nextLine();
        System.out.println("Added " + regularToppingName);
        return new RegularToppings(regularToppingName);
    }

    @Override
    public double calcToppingPrice(SandwichSize size)
    {
        return 0.0;
    }
}
