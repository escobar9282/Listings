package listings.zadanie6_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Matrix {
    int boardFill = 10;
    int firstBoard[][] = new int[boardFill][boardFill];
    int secondBoard[][] = new int[boardFill][boardFill];
    int thirdBoard[][] = new int[boardFill][boardFill];

    protected void readData() {
        System.out.println("We're creating first board");
        for (int i = 0; i < boardFill; i++) {
            for (int j = 0; j < boardFill; j++) {
                if (i == 1) {
                    firstBoard[i][j] = 1;
                } else {
                    firstBoard[i][j] = 0;
                }
                System.out.println(firstBoard[i][j] + " ");
            }
            System.out.println();

        }

    }


    protected void processData() {
        System.out.println();
        System.out.println("It's being written down data from first board to second board");

        for (int i = 0; i < boardFill; i++) {
            for (int j = 0; j < boardFill; j++) {
                secondBoard[i][j] = firstBoard[j][i];
            }
        }
    }

    protected void writeDataToFile() throws IOException
    {
        System.out.println("and we're writing down second board to file.");

        FileWriter fw = new FileWriter("H:\\Java files\\new_board_002");
        for (int i = 0; i < boardFill; i++)
        {
            for (int j = 0; j < boardFill; j++)
            {
                fw.write((char)(secondBoard[i][j]));

                System.out.println(secondBoard[i][j] + " ");
            }
            System.out.println();
        }
        fw.close();
    }
    protected void  readDownDataFromFile() throws IOException
    {
        System.out.println();
        System.out.println("We're reading data from file and put it in third board.");

        FileReader fileReader = new FileReader("H:\\Java files\\new_board_002");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (int i = 0; i < boardFill; i++)
        {
            for (int j = 0; j < boardFill; j++)
            {
                thirdBoard[i][j] = (int) bufferedReader.read();

                System.out.println(thirdBoard[i][j] + " ");

            }
        }
        System.out.println();
        fileReader.close();
    }
}