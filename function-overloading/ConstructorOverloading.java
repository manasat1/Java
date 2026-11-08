class ConstructorOverloading {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Manasa");

        Student s3 = new Student(101, "Anjali", 95);

        System.out.println("\nStudent 1 Details:");
        s1.display();

        System.out.println("\nStudent 2 Details:");
        s2.display();

        System.out.println("\nStudent 3 Details:");
        s3.display();
    }
}

class Student {

    int id;
    String name;
    int marks;

    // No-argument constructor
    Student() {
        id = 0;
        name = "Unknown";
        marks = 0;
    }

    // Constructor with one parameter
    Student(String name) {
        id = 0;
        this.name = name;
        marks = 0;
    }

    // Constructor with three parameters
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
