/**
 * Created by katherine_celeste on 8/4/16.
 * This simple program displays pricing for phone parts. The user is asked to choose
 * between two popular phones.
 */
import java.util.Scanner;
import java.math.*;
public class PhoneRepairParts {

    public static void main(String[] args)
    {
        System.out.println("Please select which phone you need repair parts for");
        System.out.println("1) Apple iPhone 6");
        System.out.println("2) HTC One (M8)");
        System.out.print("\nYour response (enter 1 or 2): ");

        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        System.out.println();
        PhonePartsCatalogPricing firstUserSelection = new PhonePartsCatalogPricing(n);

        String phone;
        if (n == 1)
        {
            phone = "Apple iPhone 6";
        }
        else
        {
                phone = "HTC One (M8)";
        }

        System.out.println("*********************************************************");
        System.out.println("We have the following " + phone + " parts in stock: ");
        System.out.println(firstUserSelection);

        if (n == 1)
        {
            phone = "HTC One (M8)";
            n = 2;
        }
        else
        {
            phone = "Apple iPhone 6";
            n =1;
        }

        PhonePartsCatalogPricing secondUserSelection = new PhonePartsCatalogPricing(n);

        System.out.println("*********************************************************");
        System.out.print("\nAdditional Information: ");
        System.out.println("\nPricing for the " + phone + "parts\n");
        System.out.println(secondUserSelection);

        System.out.println("\n*********************************************************");
        System.out.println("Price difference between both phones: $" + PhonePartsCatalogPricing.priceDifference(firstUserSelection.calculateTotal(), secondUserSelection.calculateTotal()).abs());
    }
}
