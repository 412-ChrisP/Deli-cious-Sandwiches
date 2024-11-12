package YearUp.pluralsight;

public class RegularToppings extends Toppings
{
    public RegularToppings(String name)
    {
        super(name);
    }

    @Override
    public double calcToppingPrice(SandwichSize size)
    {
        return 0.0;
    }
}
