package listings.zadanie6_3;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Matrix matrix = new listings.zadanie6_3.Matrix();
        matrix.readData();
        matrix.processData();
        matrix.writeDataToFile();
        matrix.readDownDataFromFile();
    }
}
