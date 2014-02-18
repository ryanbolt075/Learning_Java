package CreditLimit;

import java.util.Scanner;

/**
 * Created by ryanbolt on 2/17/2014.
 */
public class CreditLimit
{
    private int accountNumber;
    private int beginBalance;
    private int totalDebits;
    private int totalCredits;
    private int newBalance;
    private int creditLimit;

    public void customerInformation()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = input.nextInt();

        System.out.print("Enter Beginning Balance: ");
        beginBalance = input.nextInt();

        System.out.print("Enter Total Debits: ");
        totalDebits = input.nextInt();

        System.out.print("Enter Total Credits: ");
        totalCredits = input.nextInt();

        System.out.print("Enter Credit Limit: ");
        creditLimit = input.nextInt();

        newBalance = (beginBalance+totalDebits)-totalCredits;
        balanceCheck();
    }

    private void balanceCheck()
    {
        if(newBalance>creditLimit)
        {
            System.out.printf("Credit Limit Exceeded!!!! for account %d",accountNumber);
        }
    }


}
