package listings.zadanie6_2;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int dimension = 10;
        int primaryBoard[][] = new int[dimension][dimension];
        int secondaryBoard[][] =new int[dimension][dimension];
        Matrix matrix = new Matrix();
        matrix.readData(primaryBoard, dimension);
        matrix.writeDataToFile(primaryBoard, dimension);
        matrix.writeDataToFile(secondaryBoard, dimension);
    }
}
