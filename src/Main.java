import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        Scanner console = new Scanner(System.in);
        double itemPrice = 0;
        final double SHIP_RATE = .02;
        final double FREE_SHIP = 100;
        double shipCost = 0;
        double totalCost = 0;

        String trash = " ";

        System.out.print("Enter the item price:");

        if (console.hasNextInt()) {
            itemPrice = console.nextDouble();
            console.nextLine();


            if (itemPrice >= FREE_SHIP) {
                shipCost = 0;
                totalCost = itemPrice;

            } else {
                shipCost = SHIP_RATE * itemPrice;
                totalCost = itemPrice + shipCost;

            }
            System.out.println("The ship cost is" + shipCost);
            System.out.println("The total cost is" + totalCost);


        } else // clearing the trash, non applicible value
        {

            trash = console.nextLine();
            System.out.print("You entered" + trash + "not a number");
            System.out.println("Run the program again with the correct input");

        }


    }

}