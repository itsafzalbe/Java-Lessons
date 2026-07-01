abstract class TV {
    abstract void turnOn();
    abstract void turnOff();
}

// concrete class implementing the abstract methodsd
class TVRemote extends TV {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

abstract class Shape {
    String color;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + "and area is: " + area();
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor() + "and area is: " + area();
    }

}


// define an interface named Shape
interface Shape1 {
    // Abstract method for calculating the area
    double calculateArea();
}


// implement the interface in a class named Circle
class Circle1 implements Shape1 {
    private final double r;

    // constructor for circle
    public Circle1(double r) {
        this.r = r;
    }

    // implementing the abstract method from the Shape interface
    public double calculateArea() {
        return Math.PI * r * r;
    }
}

class Rectangle1 implements Shape1 {
    private final double length;
    private final double width;

    // constructor for rectangle 
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // implementing the abstract method from the shape interface
    public double calculateArea() {
        return length * width;
    }
}


public class Abstraction {
    public static void main(String[] args) {
        // Abstraction in Java is the process of hiding internal implementation details
        // and showing the only essential functionality to the user. It focuses on what an object does rather than
        // how it does it
        /*
            * It hides the complex details and shows only essential features.
            * Abstract classes may have methods without implementation and must be implemented by subclasses
            * By abstracting functionality, changes in the implementation do not affect the code that depends on the abstraction.
        */

        // Ways to Achieve Abstraction
        // Java provides two ways to implement abstraction, which are listed below:
        //      * Abstract Class (Partial Abstraction)
        //      * Interface (provides abstraction for behavior, may containt default or statif methods.)

        // Real-Life Example of Abstraction.
        /*
        The television remote control is the best example of abstraction. 
        It simplifies the interaction with a TV by hiding all the complex technology. We 
        don't need to understand how the TV internally works; we just need to press the button 
        to change the channel or adjust the volume.
        */

        TV remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();

        // Explanation:
        /*
            * TV is abstract class defining turnOn() and turnOff() methods.
            * TVRemote class implements the abstract methods with specific logic 
            * Abstaction class (Main class) uses TV remote = new TVRemote(); to interact without knowing the internal implementation 
        */

        // Abstract Class 
        /*
        An abstract class is a class that cannot be instantiated and may contain abstract methods (methods without body) as well as concrete methods (with implementation).
        
        In shape example, a base type Shape has common properties like color and size. 
        Specific shapes - Circle, Square, Triangle -inherit form Shape and may
        have unique properties or behaviors. For instance, some shapes can be flipped, 
        and each shape calculates its area differently, illustrating both shared features 
        and individual differences
        */

        /*
        Shape (Abstract class)
        color: String
        abstract area(): double
        abstract toString(): String
        getColor(): String
         
        
        Circle (extends Shape) (concrete class)
        radius: double
        

        Rectangle (extends Shape) (concrete class)
        length: double
        width: double
        */

        // Example: This program demonstrates partial abstraction by defining an abstract class Shape that includes an abstract method area(), a concrete method getColor() and a constructor

        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());




        // Interface
        /* An interface is a blueprint for a class that defines a set of methods a class must implement.
        It is commonly used to achieve abstraction in Java. Modern Java interfaces can contain abstract 
        methods, constants, and also default or static methods with implementations

        // Implementation: To implement an interface we use the keyword "implements" with class.
        */

        // reference type is the interface (Shape)
        Shape1 cir = new Circle1(5.0);
        Shape1 rect = new Rectangle1(4.0, 6.0);

        // dynamic method dispatch - decides which method to call at runtime
        System.out.println("Area of Circle: " + cir.calculateArea());
        System.out.println("Area of Rectangle: " + rect.calculateArea());


        /*
        Advantages of Abstraction
            * Abstraction makes complex systems easier to understand by hiding the implementation details
            * Abstraction keeps different part of the system seperated.
            * Abstraction maintains code more efficiently
            * Abstraction increases the security by only showing the necessary details to the user.
        
        Disadvantages of Abstraction
            * It can add unnecessary complexity if overused
            * May reduce flexibility in implementation
            * Makes debugging and understanding the system harder for unfamiliar users.
            * Overuse of abstraction may make code harder to follow, though performance impact is usually negligible 
        

        Common mistakes to Avoid 
        The common mistakes that can occur and we should avoid when working with Abstraction in Java are listed below:
            * Not implementing Abstract Methods: Always make sure that the abstract methods are implemented in the concrete subclasses
            * Overusing Abstraction: Avoid making everything abstract when its not required. Use abstraction only when it enhances the design
            * Inconsistent Method Signature in Subclasses: When you override abstract methods, please make sure the method signature matches exactly, any mistake can cause errors.

        */
    }
}