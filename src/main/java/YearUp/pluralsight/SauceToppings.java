package YearUp.pluralsight;

public class SauceToppings extends Toppings
{
    public SauceToppings(String name)
    {
        super(name);
    }

    @Override
    public double calcToppingPrice(SandwichSize size)
    {
        return 0.0;
    }
}