import java.util.ArrayList;
import java.util.Collections;

class ComparableCollections {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // Adding student objects
        students.add(new Student(103, "Priya", 85));
        students.add(new Student(101, "Radha", 95));
        students.add(new Student(104, "Sneha", 75));
        students.add(new Student(102, "Anjali", 90));

        // Sorting students by marks
        Collections.sort(students);

        System.out.println("Students sorted by marks:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student> {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}
