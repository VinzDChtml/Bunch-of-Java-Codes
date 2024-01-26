
public class Student {
    private String firstName;
    private String lastName;
    private int age;

    // Constructor to take both first name and last name
    public Student(String firstName, String lastName, int age) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name is required");
        }
        this.firstName = firstName;
        this.lastName = lastName;

        // Check if age is within the valid range
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.age = age;
    }

    // Constructor with only name and default age
    public Student(String firstName) {
        this.firstName = firstName;
        this.age = 0; // or any default value
    }

    // Getter and setter methods for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and setter methods for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name is required");
        }
        this.lastName = lastName;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Check if age is within the valid range
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.age = age;
    }
}
