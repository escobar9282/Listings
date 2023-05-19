package listings.polunomial;

public class Polynomial
{
    private final double[] coeff;

    public Polynomial(double[] coeff)
    {
        this.coeff = coeff;
    }

    public Polynomial multiply(Polynomial polynomial) {
        int totalLength = coeff.length + polynomial.coeff.length - 1;

        double[] result = new double[totalLength];

        for (int i = 0; i < coeff.length; i++) {
            for (int j = 0; j < polynomial.coeff.length; j++) {
                result[i + j] += coeff[i] * polynomial.coeff[j];
            }
        }
        return new Polynomial(result);
    }

    public void print()
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
                if (i > 0 )
                {
                    System.out.print("x");
                    {
                        if (i > 1)
                        {
                            System.out.print("^" + i);
                        }
                    }
                }
            }

        }
        System.out.println();
    }
}
