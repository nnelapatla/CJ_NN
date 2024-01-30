package arraylist;

import java.util.ArrayList;

public class BelowAvgGpa {

        public void removeBelowAverageGPA(ArrayList<StudentGpa> studentList) {

            // Calculate average GPA
            double totalGPA = 0;
            for (StudentGpa student : studentList) {
                totalGPA += student.gpa;
            }
            double averageGPA = studentList.isEmpty() ? 0 : totalGPA / studentList.size();

            // Remove students with GPA below average
            studentList.removeIf(student -> student.gpa < averageGPA);
        }

        public static void main(String[] args) {
            // Example usage
            ArrayList<StudentGpa> students = new ArrayList<>();
            students.add(new StudentGpa("John", "Doe", 3.5));
            students.add(new StudentGpa("Jane", "Smith", 3.2));
            students.add(new StudentGpa("Alice", "Johnson", 3.8));

            BelowAvgGpa remover = new BelowAvgGpa();

            System.out.println("Before removal:");
            printStudents(students);
            remover.removeBelowAverageGPA(students);

            System.out.println("\nAfter removal:");
            printStudents(students);
        }

        private static void printStudents(ArrayList<StudentGpa> students) {
            for (StudentGpa student : students) {
                System.out.println("Name: " + student.firstName + " " + student.lastName + ", GPA: " + student.gpa);
            }
        }

    }





