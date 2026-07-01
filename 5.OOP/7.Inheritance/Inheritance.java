
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// child class 
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// child class
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}


// Single 
//--------------------------------------------------------------------------------
// super class
class VehicleSingle {
    VehicleSingle() {
        System.out.println("This is a Vehicle");
    }   
}

// subclass
class Car extends VehicleSingle {
    public Car() {
        System.out.println("This Vehicle is a Car");
    }
}
//--------------------------------------------------------------------------------




// Multilevel
//--------------------------------------------------------------------------------
class VehicleMultilevel {
    public VehicleMultilevel() {
        System.out.println("This is a Vehicle");
    }
}

class FourWheeler extends VehicleMultilevel {
    public FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}

class Car1 extends FourWheeler {
    Car1() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}
//--------------------------------------------------------------------------------



// Hierarchical
//--------------------------------------------------------------------------------
class VehicleHierarchical {
    public VehicleHierarchical() {
        System.out.println("This is a Vehicle");
    }
}

class Car2 extends VehicleHierarchical {
    Car2() {
        System.out.println("This Vehicle is a Car");
    }
}

class Bus extends VehicleHierarchical {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}
//--------------------------------------------------------------------------------


// Multiple
//--------------------------------------------------------------------------------

interface LandVehicle {
    default void landInfo() {
        System.out.println("This is a LandVehicle");
    }
}

interface WaterVehicle {
    default void waterInfo() {
        System.out.println("This is a WaterVehicle");
    }
}

class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    public AmphibiousVehicle() {
        System.out.println("This is an AmphibiousVehicle");
    }
}

//--------------------------------------------------------------------------------


// Hybrid 
//--------------------------------------------------------------------------------
class VehicleHybrid {
    void vehicleType() {
        System.out.println("This is a Vehicle");
    }
}

// Interface for fare
interface Fare {
    default void fareInfo() {
        System.out.println("Fare information");
    }
}


// Subclass 1: Single inheritance + multilevel
class CarHybrid extends VehicleHybrid {
    void carType() {
        System.out.println("This is a Car");
    }
}

// Subclass 2: Hybrid inheritance (extends class + implements interface)
class BusHybrid extends VehicleHybrid implements Fare {
    void busType() {
        System.out.println("This is a Bus");
    }
}

//--------------------------------------------------------------------------------


class SolarSystem {    
}

class Earth extends SolarSystem {
}

class Mars extends SolarSystem {
}

class Moon extends Earth {
}



public class Inheritance {
    public static void main(String[] args) {
        // Inheritance in Java 
        // core concept of OOP which allows a class to acquire properties and behaviors from another class.
        // It helps in creating a new class form an existing class, promoting code reusability and better organization.

        //      * A subclass can reuse the fields and methods of the parent class without rewriting the code
        //      * A subclass can add its own fields and methods or modify existing ones to extend functionality.

        Animal a;
        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();

        // Output
        // Dog Barks
        // Cat meows
        // Cow moos

        // Explanation:
        /*
            * Animal is the base class
            * Dog, Cat and Cow are derieved classes that extend Animal class and provide specific implementations of the sound() method
            * The Inheritance class is the driver class that creates objects and demonstrates runtime polymorphism using method overriding.
        */

        // Syntax
        /*
        class Parent {
            // fields and methods
        } 
        
        class Child extends Parent {
            // additional fields and methods
        }
        */

        // NOTE: in Java, inheritance implemented using the extends keyword.

        // Key Terminologies in Java Inheritance 
        /*
            * Class: Blueprint from which objects are created
            * Superclass: Class whose properties are inherited
            * Subclass: Class that inherits another class
            * extends: Keyword used to inherit a class
        */

        // Types of Inheritance in Java
        // It defines the different ways a class can inherit properties and behavior from one or more classes.
        // 1. Single
        // 2. Multiple
        // 3. Hybrid
        // 4. Multilevel
        // 5. Hierarchical


        // 1. Single Inheritance 
        // In single inheritance, a sub class is derived from only one super class.
        // It inherits the properties and behavior of a single-parent class. Sometimes, it it
        // also known as simple inheritance.

        Car obj = new Car();



        
        // 2. Multilevel inheritance 
        /*
        In Multilevel inheritance, a derived class will be inheriting a base class and as
        well as the derieved class also acts as the base class for other classes. */

        Car1 obj1 = new Car1();



        // 3. Hierarchical Inheritance 
        /*
        In hierarchical inheritance, more than one subclass is inherited from a single base class
        i.e. more than one derieved class is created from a single base class. For example, cars, 
        and buses both are vehicle.
         */

        Car2 obj2 = new Car2();
        Bus obj3 = new Bus();

        

        
        // 4. Multiple Inheritance (Through Interfaces)
        // In multiple inheritances, one class can have more than one superclass and inherit features from all parent classes
        // NOTE: that Java does not support multiple inheritances with classes. In Java, we can achieve multiple inheritances only through interfaces.

        AmphibiousVehicle obj4 = new AmphibiousVehicle();
        obj4.waterInfo();
        obj4.landInfo();



        // 5. Hybrid Inheritance 
        /*
        It is a mix of two or more of the above types of inheritance. In Java, we can achieve hybrid 
        inheritance only through Interface if we want to involve multiple inheritance to implement 
        Hybrid inheritance. 
        */

        CarHybrid car = new CarHybrid();
        car.vehicleType(); // inherited from Vehicle
        car.carType(); // specific to Car

        BusHybrid bus = new BusHybrid();
        bus.vehicleType(); // inherited from Vehicle
        bus.busType(); // specific to Bus
        bus.fareInfo(); // form Fare interface

        // Explanation
        /*
            * class Car extends Vehicle -> single inheritance
            * class Bus extends Vehicle and class Bus implements Interface Fare -> Hybrid Inheritance (since Bus inherits from two sources, forming a combination of single + multiple inheritance)
        */

        // Java IS-A type of Relationship
        // IS-A represents an inheritance relationship in Java, meaning this object is a type of that object.
        /* 

        public class SolarSystem {
        }
        public class Earth extends SolarSystem {
        }
        public class Mars extends SolarSystem {
        }
        public class Moon extends Earth {
        }

        */

        /*
        Now, based on the above example, in Object-Oriented terms, the following are true:
            * SolarSystem is the superclass of Earth class
            * SolarSystem is the superclass of Mars class.
            * Earth and Mars are subclasses of SolarSystem class
            * Moon is the subclass of both Earth and SolarSystem classes 
        */

        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);

        // What can be done in a subclass?
        /*
        In subclasses we can inherit members as is, replace them, hide them, or
        supplement them with new members:
            * The inherited fields can be used directly, just like any other fields.
            * We can declare new fields in the subclass that are not in the superclass
            * The inherited methods can be used directly as they are.
            * We can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it (as in the example above, toString() method is overridden)
            * We can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
            * We can declare new methods in the subclass that are not in the superclass
            * We can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super
        
        Advantages of Inheritance in Java
            * Code reusability: inheritance allows for code reuse and reduces the amount of code that needs to be written. The subclass can reuse the properties and methods of the superclass, reducing duplation of code. 
            * Abstraction: Inheritance allows for the creation of abstract classes that define a common interface for a group of related classes. This promotes abstraction and encapsulation, making the code easier to maintain and extend.
            * Class Hierarchy: Inheritance allows for the creation of a class hierarchy, which can be used to model real-world objects and their relationships
            * Polymorphism: Inheritance allows for polymorphism, which is the ability of an object to take on multiple forms. Subclasses can override the methods of the superclass, which allows them to change their behavior in different ways.
        
        Limitations of Inheritance in Java
            * Complexity -> Deep inheritance hierarchies can make code hard to understand. Correction -> keep hierarchy simple or use composition instead
            * Tight Coupling -> Changes in superclass can affect subclasses. Correction -> use loose coupling (interface or composition)
        */

    }
    
}
