package Milage;

import java.util.Scanner;

/**
 * Created by ryanbolt on 2/17/2014.
 */
public class Mileage
{
    private int milesDriven;
    private int gallonsUsed;

    private int milesPerGallon;
    private int totalMPG;



    public void calculateMilesPerGallon()

    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mileage or -1 to quit: ");
        milesDriven = input.nextInt();

        while (milesDriven != -1)
        {

            System.out.print("Enter Gallons Used: ");
            gallonsUsed = input.nextInt();

            milesPerGallon = milesDriven/gallonsUsed;

            System.out.printf("Total Miles per gallon for this trip was: %d\n",milesPerGallon);
            System.out.print("Enter Mileage or -1 to quit: ");
            milesDriven = input.nextInt();

            totalMPG+=milesPerGallon;

        }

        System.out.printf("Combined Miles per gallon is: %d\n",totalMPG);

    }


}
