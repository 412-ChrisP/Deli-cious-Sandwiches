package YearUp.pluralsight;

import java.util.*;

public class MeatToppings extends Toppings
{
    static Scanner scanner = new Scanner(System.in);

    public MeatToppings(String name)
    {
        super();
    }

    public static Toppings getMeatTopping()
    {
        System.out.print("Enter meat topping (steak - ham - salami - roast beef - chicken - bacon): ");
        String meatName = scanner.nextLine();
        System.out.println("Added " + meatName);
        return new MeatToppings(meatName);
    }

    @Override
    public double calcToppingPrice(SandwichSize size)
    {
        return switch (size)
        {
            case FOUR_INCH -> 1.00;
            case EIGHT_INCH -> 2.00;
            case TWELVE_INCH -> 3.00;
            default -> 0.0;
        };
    }
}
