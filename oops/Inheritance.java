class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

public class Inheritance extends Animal {

    void sleep() {
        System.out.println("Animal is sleeping");
    }

    public static void main(String[] args) {

        Inheritance obj = new Inheritance();

        obj.eat();
        obj.sleep();
    }
}
