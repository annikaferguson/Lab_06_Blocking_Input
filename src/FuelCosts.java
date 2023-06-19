import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        double totalCost = 0;
        double possibleDistance = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.println("Enter the number of gallons in your tank: ");
            System.out.println("Enter the miles per gallon: ");
            System.out.println("Enter the price per gallon: ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                milesPerGallon = in.nextDouble();
                pricePerGallon = in.nextDouble();
                in.nextLine();
                totalCost = gallonsInTank + milesPerGallon + pricePerGallon;
                System.out.println("The total cost is: " + totalCost);
                possibleDistance = gallonsInTank * milesPerGallon;
                System.out.println("The car can go " + possibleDistance + " miles with the gas in the tank.");
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the number of gallons of gas in your tank was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);
    }
}
