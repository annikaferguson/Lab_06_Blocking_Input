import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonalOne = 0;
        double diagonalTwo = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter the wdith of the rectangle: ");
            System.out.println("Enter the height of the rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                height = in.nextDouble();
                in.nextLine();
                area = width * height;
                System.out.println("The area of the rectangle is: " + area);
                perimeter = (width * 2) + (height * 2);
                System.out.println("The perimeter of the rectangle is: " + perimeter);
                diagonalOne = ((width * width) + (height * height));
                diagonalTwo = Math.sqrt(diagonalOne);
                System.out.println("The diagonal of the rectangle is: " + diagonalTwo);
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: ");
                System.out.println("Please enter a valid number.");
            }
        } while(!done);
    }
}
