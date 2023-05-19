package listings.listing3_16;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int amountOfNumbers = 5, i;
        double digit, sum = 0, min, max;

        System.out.println("Program is drawing" + amountOfNumbers + "integer numbers from 0 to 99,");
        System.out.println("Then finds the minimum and maximum");
        System.out.println("and calculates the middle from all drown numbers.");

        Random random = new Random();
        min = Math.round((100 * (random.nextDouble())));
        System.out.println();
        System.out.println("There were drawn numbers: " + min + ", ");
        max = min ;
        sum += max;

        for (i = 1; i <= amountOfNumbers - 1; i++)
        {
            digit = Math.round(100 * (random.nextDouble()));
            System.out.println(digit + ", " );
            if (max < digit) max = digit;
            if (digit < min) min = digit;
            sum += digit;
        }

        System.out.println();
        System.out.println("the biggest digit is " + max + ",");
        System.out.println("the smallest number is " + min + ",");
        System.out.println(" the middle number= " + sum / amountOfNumbers + ".");
    }
}
