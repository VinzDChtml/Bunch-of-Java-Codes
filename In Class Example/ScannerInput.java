// uses the scanner

import java.util.Scanner;  // Import the Scanner class

public class ScannerInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = scanner.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}