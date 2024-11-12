package YearUp.pluralsight;

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

    public void toppingType()
    {
        
    }

    public abstract double calcToppingPrice(SandwichSize size);
}