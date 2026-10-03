public class ClassObject {

    String name = "Sita";
    int age = 23;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ClassObject obj = new ClassObject();

        obj.display();
    }
}
