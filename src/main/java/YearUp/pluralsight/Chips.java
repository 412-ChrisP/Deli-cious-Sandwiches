package YearUp.pluralsight;

import java.util.*;

public class Chips
{
    private final String type;

    public Chips(String type)
    {
        this.type = type;
    }

    public double getChipPrice()
    {
        return 1.50;
    }

    @Override
    public String toString()
    {
        return "Chips{" + "type: '" + type + '\'' + '}';
    }
}