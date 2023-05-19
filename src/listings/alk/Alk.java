package listings.alk;

public class Alk
{
    private final double[] coeff;

    public Alk(double[] coeff) {
        this.coeff = coeff;
    }

    public Alk integrate()
    {
        int totalLength = coeff.length + 1;
        double[] result = new double[totalLength];
        result[0] = 0;

        for (int i = 0; i < coeff.length; i++)
        {
            result[i + 1] = coeff[i] / (i+1);
        }
        return new Alk(result);
    }

    public void display()
    {
        for (int i = coeff.length - 1; i >= 0; i--)
        {
            if (coeff[i] != 0)
            {
                if (coeff[i] > 0 && i != coeff.length - 1)
                {
                    System.out.print(" + ");
                }
                if (coeff[i] < 0)
                {
                    System.out.print(" - ");
                }
                if (Math.abs(coeff[i]) != 1 || i == 0)
                {
                    System.out.print(Math.abs(coeff[i]));
                }
                if (i > 0)
                {
                    System.out.print("x");
                    if (i > 1)
                    {
                        System.out.print("^" + i);
                    }
                }

            }
        }
        System.out.println();
    }

}
