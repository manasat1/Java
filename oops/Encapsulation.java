class Student {

    // Private variables
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Ravi");
        s.setAge(23);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
