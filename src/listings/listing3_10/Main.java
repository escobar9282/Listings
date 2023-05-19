package listings.listing3_10;

public class Main
{
    public static void main(String[] args)
    {
        int sum = 0;

        System.out.println("Add up integer numbers from 1 to 100.");

        for (int i = 1; i <= 100; i++)
        {
            if (i % 2 == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
