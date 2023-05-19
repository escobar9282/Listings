package listings.zadanie6_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Matrix
{
    int dimension = 10;

    protected void readData(int board[][], int dimension)
    {
        System.out.println("We're creating board 10*10");

        for (int i = 0; i < dimension; i++)
        {
            for (int j = 0; j < dimension; j++)
            {
                if (i == j)
                {
                    board[i][j] = 1;
                }
                else
                {
                    board[i][j] = 0;
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    protected void writeDataToFile(int board[][], int dimension) throws IOException
    {
        System.out.println();
        System.out.println("We're writing plaque 10*10 to file");

        FileWriter fileWriter = new FileWriter("H:\\Java files\\new_board.txt");

        for (int i = 0; i < dimension; i++)
        {
            for (int j = 0; j < dimension; j++)
            {
                fileWriter.write((char)(board[i][j]));
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        fileWriter.close();
    }
    protected void readDataFromFile(int secondaryBoard[][], int dimension) throws IOException
    {
        System.out.println();
        System.out.println("We're reading plaque 10*10* from file new_board.txt");
        FileReader fileReader = new FileReader("H:\\Java files\\new_board.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (int i = 0; i < dimension; i++)
        {
            for (int j = 0; j < dimension; j++)
            {
                secondaryBoard[i][j] = (int) (bufferedReader.read());
                System.out.println(secondaryBoard[i][j] + " ");
            }
            System.out.println();
        }
        fileReader.close();
    }

}
