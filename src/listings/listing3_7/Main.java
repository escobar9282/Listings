package listings.listing3_7;

public class Main
{
    public static void main(String[] args)
    {
        int sum = 1;
        System.out.println("The program that adds integer numbers up from 1 to 100");

        for (int i = 1; i <= 100; i++)
        {
            sum += i;
        }
        System.out.println("Sum of added integer digits is " + sum + ".");
    }
}
