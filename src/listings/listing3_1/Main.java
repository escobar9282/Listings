package listings.listing3_1;

public class Main
{
    public static void main(String[] args)
    {
        int y;

        System.out.println("The program calculates the value of the function y = 3*x");
        System.out.println("for x varying from 0 to 100");

        for (int x = 0; x <= 100; x++)
        {
            y = 3 * x;
            System.out.println("x = " + x + '\t' + "y = " + y);
        }
    }
}
