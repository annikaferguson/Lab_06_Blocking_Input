import java.util.Scanner;
public class HighOrLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double randomNumber = 4;
        double guess = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter your guess between 1-10: ");
            if(randomNumber > guess && guess >= 1 && guess <= 10)
            {
                System.out.println("Your guess was less than the number! Try again!");
            } else if(randomNumber < guess && guess >= 1 && guess <= 10)
            {
                System.out.println("Your guess was greater than the number! Try again!");
            } else if(randomNumber == guess && guess >= 1 && guess <= 10)
            {
                System.out.println("You guessed correctly! Good job!");
                done = true; //end loop
            } else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number between 1 and 10");
            }
        } while (!done)

    }
}
