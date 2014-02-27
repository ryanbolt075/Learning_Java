package Grade;

/**
 * Created by ryanbolt on 2/13/2014.
 */
public class GradeBookTest
{
    public static void main(String[] args)
    {
        GradeBook myGradeBook = new GradeBook("CS101 Intro to Java Programming");

        myGradeBook.displayMessage();
        myGradeBook.inputGrades();
        myGradeBook.displayGradeReport();
    }
}
