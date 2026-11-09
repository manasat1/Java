class OverloadingWithInheritance {

    public static void main(String[] args) {

        Child child = new Child();

        child.display();
        child.display("Ravi");
        child.display(23);
    }
}

class Parent {

    public void display() {
        System.out.println("Display method from Parent class");
    }

    public void display(String name) {
        System.out.println("Name: " + name);
    }
}

class Child extends Parent {

    // Overloaded method with a different parameter list
    public void display(int age) {
        System.out.println("Age: " + age);
    }
}
