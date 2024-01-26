import java.util.Scanner;

public class oops_concepts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input from the user
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            // Create an instance of Student using the constructor with both first and last name
            Student student = new Student(firstName, lastName, age);

            // Access the methods
            System.out.println("\nStudent Information:");
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Age: " + student.getAge());

            // Modify the student's information
            Student student2 = new Student("Melissa");

            // Print the updated information
            System.out.println("\nStudent 2 Information:");
            System.out.println("First Name: " + student2.getFirstName());
            System.out.println("Last Name: " + student2.getLastName());
            System.out.println("Age: " + student2.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
