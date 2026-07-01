
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student {
    int id;
    String n;

    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }

    public Student() {

    }
}

class Dog {
    String name;
    String breed;
    int age;
    String color;

    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {return name;}
    public String getBreed() {return breed;}
    public int getAge() {return age;}
    public String getColor() {return color;}

    @Override
    public String toString() {
        return "Name is: " + name + "\nBreed age and color are: " + breed + " " + age + " " + color;
    }

    void display() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }
    
}

class Product {
    String name;
    float price;

    // Constructor to initialize object state
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    // setter methods optional
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // getter methods
    public String getName() { return name; }

    public float getPrice() { return price; }


}

class Geeks implements Cloneable {
    String name = "GeeksForGeeks";

    @Override
    protected  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Serializable {
    private final String name;
    public Person(String name) { this.name = name; }
    @Override
    public String toString() { return "Person: " + name; }
}
public class ClassAndObjects {
    public static void main(String[] args) {
        // Classes and Objects in Java
        // In Java, classes and objects form the foundation of Object-Oriented
        // Programming (OOP). They help model real-world entities and organize code in
        // a structured way

        /*
            * A class is a blueprint used to create objects that share common properties and behavior
            * An object is an instance of a class. It represents a specific entity created from the class template.
        */

        /*
        For example: Dog is a class, Tommy is an object of that class
        Class Dog: Properties -> Name
                              -> Color
                              -> Eye_Color
                              -> Height
                              -> Length

                   Methods -> getName()
                           -> getColor()
                           -> getEyeColor()
                           -> getHeight()
                           -> comeHere()
        
        Object Tommy: Properties -> Name: Tommy 
                                 -> Color: Green
                                 -> Eye_Color: Brown
                                 -> Height: 17in
                                 -> Length: 35in 
                    
                      Methods -> getName()
                              -> getColor()
                              -> getEyeColor()
                              -> getHeight()
                              -> comeHere()
        */


        
        // Java Class
        /*
        A class is a blueprint that defines data and behavior for objects. It groups
        related fields and methods in a single unit. Memory for instance members is 
        allocated when an object is created, while static members are allocated when
        the class is loaded into memory 
        
            * Acts as a template to create objects with shared structure
            * Does not occupy memory for fields until instantiation
            * Can contain fields, methods, constructors, nested classes and interfaces.

        */

        Student s1 = new Student(10, "John");
        System.out.println(s1.id);
        System.out.println(s1.n);


        // Explanation: This code defines a Student class as a blueprint with data members
        // and a constructor to initialize them. An object s1 is created in main(), which 
        // allocates memory and accesses the class fields to display value.

        // Java Objects
        // an object is an instance of a class created to access its data and operations
        // Each object holds its own state.

        /*
            * State: Values stored in fields
            * Behavior: Actions defined through method
            * Identity: Distinguishes one object from another.
        */

        // Objects mirror real-world items such as customer, products, or circle. 
        // Non-primitive objects are stored on the heap while their references remain on the stack


        // Object Instantiation
        /*
        Creating an object is known as instantiation. All instances of a class share structure
        and behavior while storing different state values.
         */

        /*
                                               +------------------+
                                               |    Class Dog     |
                                               +------------------+ 

            +-----------+                +------------------------------+                +-----------+
            |   Dog 1   | -------------> | State / Attributes           | <------------- |   Dog 3   |
            +-----------+                | ---------------------------  |                +-----------+
                                         | Breed                        |
            +-----------+                | Age                          |                +-----------+
            |   Dog 2   | -------------> | Color                        | <------------- |   Dog 4   |
            +-----------+                |                              |                +-----------+
                                         | Behaviors                    |
                                         | ---------------------------  |
                                         | Bark                         |
                                         | Sleep                        |
                                         | Eat                          |
                                         +------------------------------+
        */

        // Declaration
        // Dog tuffy;
        
        // this only declares a reference. The object is not created and the reference holds null.
        // Initialization
        // tuffy = new Dog("Tuffy", "Papillon", 5, "White")

        /*
                          Tuffy
                            |
                            v
                +------------------------+
                | Address = 100          |
                +------------------------+
                            |
                            v
                    Memory Address: 100
                +------------------------+
                | name  = "Tuffy"        |
                | breed = "Papillon"     |
                | age   = 5              |
                | color = "White"        |
                +------------------------+ 
        */

        // The new operator allocates memory and invokes the constructor
        // Example: Defining and using a class

        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy);

        // Explanation: This creates a Dog object named tuffy using the Dog constructor
        // inside main(), which initializes name, breed, age, and color. When System.out.println(tuffy) 
        // is executed, the overridden toString() method is called to display the object's data

        // NOTE: Every class has at least one constructor. If none is defined Java provides a default no-argumrnt 
        //       constructor that calls the parent constructor

        Product p1 = new Product("Visual Studio", 0.0f);
        Product p2 = new Product("IntelliJ IDEA", 499.0f);

        System.out.println(p1.getName() + " - " + p1.getPrice());
        System.out.println(p2.getName() + " - " + p2.getPrice());

        /*
        Explanation: 
        This code defines a Product class with instance variables name and price, which are initialized using a constructor.
        In the main() method, two objects (p1 and p2) are created with different values. Each object maintains its own state, 
        and the getter methods are used access and display the values of each object independently.
        */

        // Ways to Create Object in Java
        // Java supports four standard approaches.

        // 1. Using new Keyword
        // new Keyword is most direct way to create an object

        // Creating object of class Test
        // Test t = new Test();

        // 2. Using Reflection
        // Used for dynamic class loading as seen in frameworks like Spring

        try {
            Class<?> c = Class.forName("Student");
            Student s = (Student) c.getDeclaredConstructor().newInstance();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 3. Using clone() mehtod
        // clone() creates a copy of an existing object. The class must implement Clonable

        try {
            Geeks g1 = new Geeks();
            Geeks g2 = (Geeks) g1.clone();
            System.out.println(g2.name);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Explanation: Here, creates a new Geeks object g2 by cloning the existing 
        // object g1 using the overridden clone() method. The cloned object copies the field
        // values of g1, which is confirmed by printing g2.name.

        // 4. Using Deserialization
        // De-serialization is a technique of reading an object from the saved state in a file. Object is recreated from a stored byte stream.

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(new Person("Alice"));
        } catch (IOException e) { e.printStackTrace(); }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person p = (Person) in.readObject();
            System.out.println(p);

        } catch (Exception e) { e.printStackTrace(); }

        // Explanation: This first serializes a Student object to the file student.ser using 
        // ObjectOutputStream. It then deserializes the object using ObjectInputStream, recreating
        // the Student object and printing it via the toString() method.

        // Anonymous Objects
        // Anonymous objects are created without a reference and used immediately for one-time operations.
        // * No reference variable: Cannot reuse the object
        // * Created & used instantly, saves memory for short-lived tasks
        // * Common in event handling (e.g., button clicks)
        
        new Dog("Max", "Labrador", 3, "Black").display();







    }
    
}
