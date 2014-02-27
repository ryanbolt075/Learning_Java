package Squaes;

import java.util.Scanner;

/**
 * Created by ryan.bolt on 2/19/14.
 */
public class Squares {

    private int squareSize=0;
    private int counterWidth=1;
    private int counterHeight=1;


    public void getSquareSize() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a size for the square: ");
        squareSize = input.nextInt();
    }


    public void createSquare()
    {

        while (counterHeight <= squareSize)
        {

           while (counterWidth<=squareSize)
           {

               System.out.print("*");
               counterWidth++;
           }

            System.out.print("\n");
            counterWidth=1;
            counterHeight++;


        }


    }




}
