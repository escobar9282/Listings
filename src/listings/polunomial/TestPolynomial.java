package listings.polunomial;

public class TestPolynomial
{
    public static void main(String[] args)
    {
        Polynomial p1  = new Polynomial(new double[]{2, 2, 2});
        Polynomial p2 = new Polynomial(new double[]{ 2, 2 ,2});
        System.out.print("multiplication of polynomiam");
        p1.multiply(p2).print();

    }
}
