public class Person1 {
    private String name;

    public Person1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

public class Person {
    public static void changeName(Person person1, String newName) {
        person1.setName(newName);
    }

    public static void main(String[] args) {
        Person1 person = new Person1("John");
        System.out.println("Original Name: " + person.getName());  // Original Name: John

        changeName(person, "Alice");
        System.out.println("Updated Name: " + person.getName());  // Updated Name: Alice
    }
}
