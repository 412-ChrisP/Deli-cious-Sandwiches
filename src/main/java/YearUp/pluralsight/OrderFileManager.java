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

    public static void saveReceipt(Order order, double total)
    {
        try
        {
            File receiptFile = new File(RECEIPT_FILE_PATH);
            if (!receiptFile.exists())
            {
                receiptFile.createNewFile();
            }

            String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
            String receiptContent = formatReceipt(order, total);

            try (FileWriter writer = new FileWriter(receiptFile, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(writer))
            {
                bufferedWriter.write("\nOrder Timestamp: " + timestamp);
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

    private static String formatReceipt(Order order, double total)
    {
        StringBuilder receiptBuilder = new StringBuilder();

        receiptBuilder.append("\nOrder Receipt:\n");
        for (Sandwich sandwich : order.getSandwiches())
        {
            receiptBuilder.append(sandwich.toString()).append("\n");
        }

        for (Drink drink : order.getDrinks())
        {
            receiptBuilder.append(drink.toString()).append("\n");
        }

        for (Chips chip : order.getChips())
        {
            receiptBuilder.append(chip.toString()).append("\n");
        }

        receiptBuilder.append("Total: $").append(String.format("%.2f", total)).append("\n");

        return receiptBuilder.toString();
    }
}