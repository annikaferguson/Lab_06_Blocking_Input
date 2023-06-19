import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double fahrenheit = 0;
        double celsius = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter the temperature in Celsius: ");
            if(in.hasNextDouble())
                celsius = in.nextDouble();
                in.nextLine();
                fahrenheit = ((celsius * 1.8) + 32);
            System.out.println("The temperature in fahrenheit is " + fahrenheit);
        }
    }
}