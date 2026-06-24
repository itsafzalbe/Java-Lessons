package AccessModifiers;
class Person {
    //private variable
    private String name;

    public void setName(String value) {
        this.name = value;  // accessible within the class
    }

    public String getName() {return name;}

}

class Car {
    String model;

    Car(String model) {
        this.model = model;
    }
}

class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        /*
        Access modifiers in java are used to control the visibility 
        and the accessibility of classes, methods and variables.
        They help enforce encapsulation by restricting access to diff parts
        of the program. Java provides 4 types of access modifiers.
            * Public Modifiers: It is accessible from anywhere in the program
            * Protected Modifiers: It is accessible within the same package and by subclasses
            * Private Modifiers: It is accessible only within the same class
            * Default Modifiers: It is accessible only within the same package
         */


        //Private Modifier
        Person p = new Person();
        p.setName("Alice");
        System.out.println(p.getName());

        // now if we try to print the name it throws us an error
        //System.out.println(p.name()); => error



        // Default Modifier
        Car c = new Car("Audi");
        c.model = "BMW X7"; // accessible within the same package
        System.out.println(c.model);


        //Public Modifier
        System.out.println(MathUtils.add(4, 5));

        // When to Use Access Modifier in Real world projects?
        // Private modifier: The idea should be use as restrictive access as possible, so private should be used as much as possible
        // Default (Package private): Often used in package-scoped utilities or helper classes
        // Protected: Commonly used in inheritance-based designs like framework extensions
        // Public: This is used for API endpoints, service classes, or utility methods shared across different parts of the application.

    }
}
