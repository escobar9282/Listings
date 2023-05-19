package listings.zadanie3_7;

public class Main
{
    public static void main(String[] args)
    {
        int total = 0;
        System.out.println("Program totals the digits from 1 to 100");

        for (int i = 1; i <= 100; i++)
        {
            total += i;
        }
        System.out.println("Total of integers from 1 to 100 is " + total + ".");
    }
}
