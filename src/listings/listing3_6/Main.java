package listings.listing3_6;

public class Main
{
    public static void main(String[] args)
    {
        int suma = 0;
        System.out.println("The program sums integers from 1 to 100");

        for (int i = 1; i <= 100; i++)
        {
            suma += i;
        }
        System.out.println("The sum of integer numbers is " + suma + ".");
    }
}
