class AreaOverloading {

    public static void main(String[] args) {

        Area a = new Area();

        System.out.println("Area of Square: " + a.area(5));

        System.out.println("Area of Rectangle: " + a.area(10, 5));

        System.out.println("Area of Circle: " + a.area(7.0));

        System.out.println("Area of Triangle: " + a.area(10.0, 5.0));
    }
}

class Area {

    // Area of square
    public int area(int side) {
        return side * side;
    }

    // Area of rectangle
    public int area(int length, int breadth) {
        return length * breadth;
    }

    // Area of circle
    public double area(double radius) {
        return 3.14 * radius * radius;
    }

    // Area of triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }
}
