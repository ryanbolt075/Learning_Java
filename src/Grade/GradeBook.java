package Grade;

import java.util.Scanner;

/**
 * @author ryan.bolt
 */
public class GradeBook
{
    private String courseName;

    public GradeBook(String name)
    {
      courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage()
    {
        System.out.printf("Welcome to the grade book for \n%s! \n\n",getCourseName());
    }

    public void determineClassAverage()
    {
        Scanner input = new Scanner(System.in);

        int total;
        int gradeCounter;
        int grade;
        double average;

        total = 0;
        gradeCounter = 0;


        System.out.print("Enter grade or -1 to quit: ");
        grade = input.nextInt();


        while (grade != -1 )
        {

            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();

        }

        if (gradeCounter !=0)
        {
        average = (double) total / gradeCounter;
        System.out.printf("\nTotal of all 10 grades is %d\n",total);
        System.out.printf("Class average is %.2f\n",average);
        }
        else
        {
            System.out.println("No grades were entered");
        }



    }
}
