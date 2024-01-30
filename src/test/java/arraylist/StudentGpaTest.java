package arraylist;
import arraylist.StudentGpa;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import arraylist. BelowAvgGpa;
public class StudentGpaTest {


        @Test
        public void testRemoveBelowAverageGPA() {
            // Create an ArrayList of Students
            ArrayList<StudentGpa> studentList = new ArrayList<>();
            studentList.add(new StudentGpa("John", "Doe", 3.5));
            studentList.add(new StudentGpa("Jane", "Smith", 3.2));
            studentList.add(new StudentGpa("Alice", "Johnson", 3.8));

            // Create an instance of the class to test
            BelowAvgGpa remover = new BelowAvgGpa();

            // Test removing students with GPA below average
            remover.removeBelowAverageGPA(studentList);

            // Verify the remaining students
            assertEquals(2, studentList.size());
            assertEquals("John", studentList.get(0).firstName);
}
    }



