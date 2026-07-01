class Student {
    String name;

    // Constructor
    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Geeks {

    // data members of the class
    String name;
    int id;

    // Default Constructor
    Geeks() {
        System.out.println("Default constructor");
    }

    public Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // copy constructor
    public Geeks(Geeks obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }

    // method to display object data
    void display() {
        System.out.println("GeekName: " + name + " and GeekID: " + id);
    }
    
}



class GFG {

    // private constructor
    private GFG() {
        System.out.println("Private constructor called");
    }
    
    // static method
    public static void displayMessage() {
        System.out.println("Hello from GFG class!");
    }
}

class Geek {

    // constructor with one argument
    Geek(String name) {
        System.out.println("Constructor with one argument - String: " + name);
    }

    // constructor with two arguments
    Geek(String name, int age) {
        System.out.println("Constructor with two arguments: String and Integer: " + name + " " + age);
    }

    // constructor with one argument but with different type than previour
    Geek(long id) {
        System.out.println("Constructor with one argument: Long: " + id);
    }
}


public class ConstructorsLesson {


    public static void main(String[] args) {
        // A constructor in Java is a special member that is called when an object is 
        // created. It initializes the new object's state. It is used to set default or
        // user-defined values for the object's attributes.

        /*
            * A constructor has the same name as the class
            * It does not have a return type, not even void
            * It can accept parameters to initialize object properties
        */

        Student s1 = new Student("John Doe");
        s1.display();

        // output
        // Name: Jonh Doe

        // Types of Constructors in Java
        // There are four types of constructors in Java
        // 1. Default Constructor
        // 2. Parameterized Constructor
        // 3. Private Constructor
        // 4. Copy Constructor


        // 1. Default Constructor
        // A default constructor has no parameters. It is used to assign default values to 
        // an object. If no constructor is explicitly defined, Java provides a default constructor.

        Geeks hello = new Geeks();

        // Output -> Default constructor

        // NOTE: It is not necessary to write a constructor for a class because the 
        //       Java compiler automatically creates a default constructor (a constructor
        //       with no arguments) if your class does not have any



        // 2. Parameterized Constructor
        // A constructor that has parameters is known as parameterized constructor. If we
        // want to initialize fields of the class with our own values, then use a parameterized
        // constructor.

        Geeks geek1 = new Geeks("John", 43);
        geek1.display();

        System.out.println();

        // output -> GeekName: John and GeekID: 43



        // 3. Copy Constructor in Java
        // Unlike other constructors copy constructor is passed with another objects which 
        // copies the data available from the passed object to the newly created object

        // This would invoke the parameterized constructor
        System.out.println("First Object");
        Geeks geeks1 = new Geeks("Alice", 34);
        System.out.println("GeekName: " + geeks1.name + " and GeekID: " + geeks1.id);

        System.out.println();

        // This would invoke the copy constructor
        Geeks geeks2 = new Geeks(geeks1);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("GeekName: " + geeks2.name + " and GeekID: " + geeks2.id);


        // Explanation: This depicts a copy constructor, where the second Geeks object (geek2) is created
        // by passing the first object (geek1) to the constructor. The copy constructor copies the name and id from 
        // geek1 to geek2, resulting in two objects with the same data.

        // NOTE: Java does not provide a built-in copy constructor like C++, We can create our own by
        // writing a constructor that takes an object of the same class as a parameter and copies its fields
        


        // 4. Private Constructor
        /*  A private constructor cannot be accessed from outside the class, it is commonly used in:

                * Sinleton Pattern: To ensure only one instance of a class is created 
                * Utility/Helper classes: To prevent instantiation of a class containing only static methods.
        */


        // GFG u = new GFG(); // Error: constructor is private
        GFG.displayMessage();

        // Explanation: The GFG constructor is declared private, so an object of GFG cannot be created in main().
        // The class is accessed only through the static method displayMessage(), which is called directly using the class name.



        // Constructor Overloading
        // This is a key concept in OOP related to constructor is constructor overloading.
        // This allows us to create multiple constructors in the same class with different paramter lists.

        // creating the objects of the class named 'Geek' by passing different arguments
        Geek g1 = new Geek("Janet");

        // Invoke the constructor with two arguments
        Geek g2 = new Geek("Frank", 22);

        // Invoke the constructor with one argument of type 'Long'
        Geek g3 = new Geek(324542342);

        // Explanation: Demonstrates constructor overloading by defining multiple Geek constructors with
        // different parameter lists. Based on the arguments passed while creating objects (g1, g2, g3), 
        // the corresponding constructor is invoked at compile time.
        
        




    }
    
}
