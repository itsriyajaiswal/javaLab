// Shape interface
interface Shape {
    double PI = 3.14159;
    double area();
    double perimeter();
}

// Circle class
class Circle implements Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    public double area() { return PI * radius * radius; }
    public double perimeter() { return 2 * PI * radius; }
}

// Rectangle class
class Rectangle implements Shape {
    double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
    public double area() { return length * width; }
    public double perimeter() { return 2 * (length + width); }
}

// Square class
class Square implements Shape {
    double side;
    Square(double side) { this.side = side; }
    public double area() { return side * side; }
    public double perimeter() { return 4 * side; }
}

// Main method to test the classes
public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

        System.out.println("Circle: Area = " + circle.area() + ", Perimeter = " + circle.perimeter());
        System.out.println("Rectangle: Area = " + rectangle.area() + ", Perimeter = " + rectangle.perimeter());
        System.out.println("Square: Area = " + square.area() + ", Perimeter = " + square.perimeter());
    }
}
