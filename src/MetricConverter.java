import java.util.Scanner;
public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter the measurement in meters: ");
            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                miles = meters * 0.00062137;
                System.out.println("The measurement in miles is: " + miles);
                feet = meters * 3.2808399;
                System.out.println("The measurement in feet is: " + feet);
                inches = meters * 39.3700787;
                System.out.println("The measurement in meters is: " + inches);
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid measurement.");
            }
        } while(!done);
    }
}
