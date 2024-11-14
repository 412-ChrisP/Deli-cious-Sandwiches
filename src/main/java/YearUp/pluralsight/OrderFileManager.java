package YearUp.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class OrderFileManager
{
    private static final String RECEIPT_FILE_PATH = "receipts.txt";

    public static void saveReceipt(Order order)
    {
        try
        {
            File receiptFile = new File(RECEIPT_FILE_PATH);
            if (!receiptFile.exists())
            {
                receiptFile.createNewFile();
            }

            String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
            String receiptContent = formatReceipt(order);

            try (FileWriter writer = new FileWriter(receiptFile, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(writer))
            {
                bufferedWriter.write("Order Timestamp: " + timestamp);
                bufferedWriter.write(receiptContent);
                bufferedWriter.write("--------------------------------------------------");
            }
            catch (IOException e)
            {
                throw new RuntimeException("Error writing to file: " + e.getMessage(), e);
            }

            System.out.println("Receipt saved successfully to " + RECEIPT_FILE_PATH);
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while saving the receipt: " + e.getMessage());
        }
    }

    private static String formatReceipt(Order order)
    {
        StringBuilder receiptBuilder = new StringBuilder();

        receiptBuilder.append("\nOrder Receipt:\n");
        receiptBuilder.append("Sandwiches:\n");
        for (Sandwich sandwich : order.getSandwiches())
        {
            receiptBuilder.append(sandwich.toString()).append("\n");
        }

        receiptBuilder.append("Drinks:\n");
        for (Drink drink : order.getDrinks())
        {
            receiptBuilder.append(drink.toString()).append("\n");
        }

        receiptBuilder.append("Chips:\n");
        for (Chips chips : order.getChips())
        {
            receiptBuilder.append(chips.toString()).append("\n");
        }

        receiptBuilder.append("Total: $").append(order.getTotal()).append("\n");

        return receiptBuilder.toString();
    }
}