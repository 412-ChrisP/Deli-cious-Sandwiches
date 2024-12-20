package YearUp.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ToppingsTest
{
    @Test
    public void meatTopping_calcToppingPrice_shouldReturnCorrectPrice()
    {
        // Arrange
        Toppings meatTopping = new MeatToppings("steak");
        double expectedPrice = 2.00;

        // Act
        double actualPrice = meatTopping.calcToppingPrice(SandwichSize.EIGHT_INCH);

        // Assert
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void cheeseTopping_calcToppingPrice_shouldReturnCorrectPrice()
    {
        // Arrange
        Toppings cheeseTopping = new CheeseToppings("cheddar");
        double expectedPrice = 0.75;

        // Act
        double actualPrice = cheeseTopping.calcToppingPrice(SandwichSize.FOUR_INCH);

        // Assert
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void sauceTopping_calcToppingPrice_shouldReturnZero()
    {
        // Arrange
        Toppings sauceTopping = new SauceToppings("ranch");
        double expectedPrice = 0.00;

        // Act
        double actualPrice = sauceTopping.calcToppingPrice(SandwichSize.EIGHT_INCH);

        // Assert
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void regularTopping_calcToppingPrice_shoudlReturnZero()
    {
        //Arrange
        Toppings regularTopping = new RegularToppings("lettuce");
        double expectedPrice = 0.00;

        //Act
        double actualPrice = regularTopping.calcToppingPrice(SandwichSize.TWELVE_INCH);

        //Assert
        assertEquals(expectedPrice, actualPrice);

    }
}
