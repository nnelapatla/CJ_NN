package maps;

import java.util.HashMap;

public class StudentMapTest {

    public static void main(String[] args) {
        // Creating an instance of StudentMap
        StudentMap studentMap = new StudentMap();

        // Test 1: Retrieving a student by name
        String studentName = "Alice";
        System.out.println("Test 1 - Retrieving Student by Name:");
        Student retrievedStudent = studentMap.getStudent(studentName);
        printStudentInfo(studentName, retrievedStudent);

        // Test 2: Retrieving a student with an invalid name
        String invalidStudentName = "InvalidName";
        System.out.println("\nTest 2 - Retrieving Student with Invalid Name:");
        Student invalidStudent = studentMap.getStudent(invalidStudentName);
        if (invalidStudent == null) {
            System.out.println("Student not found for name: " + invalidStudentName);
        }

        // Additional tests can be added as needed
    }

    private static void printStudentInfo(String studentName, Student student) {
        if (student != null) {
            System.out.println("Student Information for " + studentName + ":");
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("GPA: " + student.getGpa());
        } else {
            System.out.println("Student not found for name: " + studentName);
        }
    }
}
