import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ComparatorCollections {

    public static void main(String[] args) {

        ArrayList<StudentDetails> students = new ArrayList<>();

        students.add(new StudentDetails(103, "Priya", 85));
        students.add(new StudentDetails(101, "Radha", 95));
        students.add(new StudentDetails(104, "Sneha", 75));
        students.add(new StudentDetails(102, "Anjali", 90));

        // Sorting by marks
        Collections.sort(students, new MarksComparator());

        System.out.println("Students sorted by marks:");

        for (StudentDetails s : students) {
            System.out.println(s);
        }

        // Sorting by name
        Collections.sort(students, new NameComparator());

        System.out.println("\nStudents sorted by name:");

        for (StudentDetails s : students) {
            System.out.println(s);
        }
    }
}

class StudentDetails {

    int id;
    String name;
    int marks;

    StudentDetails(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

// Comparator for sorting by marks
class MarksComparator implements Comparator<StudentDetails> {

    @Override
    public int compare(StudentDetails s1, StudentDetails s2) {
        return Integer.compare(s1.marks, s2.marks);
    }
}

// Comparator for sorting by name
class NameComparator implements Comparator<StudentDetails> {

    @Override
    public int compare(StudentDetails s1, StudentDetails s2) {
        return s1.name.compareTo(s2.name);
    }
}
