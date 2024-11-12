package YearUp.pluralsight;

public class CheeseToppings extends Toppings
{
    public CheeseToppings(String name)
    {
        super(name);
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
}