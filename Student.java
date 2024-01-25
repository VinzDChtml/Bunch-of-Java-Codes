public class Student {
    private String name;
    private int age;

    public Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public static void main(String[] args) {
        Student b = new Student("Bob", 21);
        System.out.println("The name of the student is " + b.getName() + " and the age is " + b.getAge());
        
        // Changing the name and age using the setter methods
        b.setName("Alice");
        b.setAge(19);
        System.out.println("The updated name of the student is " + b.getName() + " and the age is " + b.getAge());
    }
}
