package listings.alk;

public class Main
{
    public static void main(String[] args)
    {
        Alk alk = new Alk(new double[]{3, 5 , 3});
        alk.integrate().display();
    }
}
