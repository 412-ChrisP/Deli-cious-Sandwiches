package YearUp.pluralsight;

public class MeatToppings extends Toppings
{
    public MeatToppings(String name)
    {
        super(name);
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
