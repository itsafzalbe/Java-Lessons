// class Person {
//     String n;

//     // constructor
//     public Person(String n) {
//         this.n = n;
//     } 

//     // Override toString() for a custom string representation
//     @Override
//     public String toString() {
//         return "Person{name: '" + n + "'}";
//     }
// }

// class Student {
//     String name = "James";
//     int age = 21;

//     @Override
//     public String toString() {
//         return "Student{name='" + name + "', age=" + age + "}";
//     }
    
// }

// class Employee {
//     int id = 220;

//     @Override
//     public int hashCode() {
//         return id * 31; // simple custom hash
//     }
// }

// class Book {
//     String title;

//     Book(String title) {
//         this.title = title;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         Book b = (Book) obj;
//         return this.title.equals(b.title);
//     }
// }

// class Worker implements Cloneable {
//     int id = 1;
//     String name = "John";

//     @Override
//     public Object clone() throws CloneNotSupportedException {
//         return super.clone(); // shallow copy
//     }

// }


class Book implements Cloneable {
    private final String t;
    private final String a;
    private final int y;

    public Book(String t, String a, int y) {
        this.t = t;
        this.a = a;
        this.y = y;
    }

    // override the to string method
    @Override public String toString() {
        return t + " by " + a + " (" + y + ")";
    }

    // override the equals method
    @Override public boolean equals(Object o) {
        if (o == null || !(o instanceof Book)) {
            return false;
        }
        Book other = (Book)o;
        return this.t.equals(other.getTitle()) && this.a.equals(other.getAuthor()) && this.y == other.getYear();
    }

    // override the hashCode method
    @Override public int hashCode() {
        int res  = 17;
        res = 31 * res + t.hashCode();
        res = 31 * res + a.hashCode();
        res = 31 * res + y;
        return res;
    }

    // Override the clone method
    @Override public Book clone() {
        try {
            return (Book)super.clone();
            
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // // Override the finalize method
    // @Override 
    // protected void finalize() throws Throwable {
    //     System.out.println("Finalizing " + this);
    //     super.finalize();
    // }

    public String getTitle() {return t;}

    public String getAuthor() {return a;}

    public int getYear() {return y;}
}

public class ObjectClass {
    public static void main(String[] args) {
        // Object Class in Java
        /* Object class is the root of the Java class hierarchy. Every class in Java
        either directly or indirectly extends Object. It provides essential methods like
        toString(), equals(), hashCode(), clone() and several others that support object
        comparison, hashing, debugging, cloning and synchronization.

            * Acts as the root of all Java classes
            * Defines essential methods shared by all objects
            * Supports thread communication (wait(), notify(), notifyAll())
        */

        // Person p = new Person("Janice");

        // // Custom string representantion
        // System.out.println(p.toString());

        // // default hash code value
        // System.out.println(p.hashCode());

        // Explanation: In the above example, we override the toString() method to
        // provide a custom string representation of the Person class and 
        // use the hashCode() method to display the default hash code value of the object


        // Object Class Methods
        // 1. toString() Method
        // toString() provides a String representation of an object and is used to convert an object to a string

        // Student s = new Student();
        // // calls overridden toString()
        // System.out.println(s.toString());

        // Explanation: Overridden toString() prints a custom readable string for the object



        // 2. hashCode() Method
        // hashCode() method returns the hash value of an object (not 
        // its memory address). Used heavily in hash-based collections like 
        // HashMap, HashSet, etc.

        // Employee e = new Employee();
        // System.out.println(e.hashCode());

        // Explanation: hashCode() returns an integer value used in hashing-based
        // collections like HashMap. If two objects are equal, they must produce the 
        // same hash code



        // 3. equals(Object obj) Method
        // equals() method compares the given object with the current object. It is 
        // recommended to override this method to define custom equality condition.

        // Book b1 = new Book("Java");
        // Book b2 = new Book("Java");

        // System.out.println(b1.equals(b2)); // true

        // Explanation: equals() compares objects based on content rather than reference. 
        // Must be overridden when custom comparison logic is needed.

        // 4. getClass() method
        // getClass() method returns the class of "this" object and is used to get the 
        // actual runtime class of the object.

        // Object o = new String("GeeksForGeeks");
        // Class c = o.getClass();
        // System.out.println("Class of the Object o is: " + c.getName());

        // Explanation: The getClass() method is used to print the runtime class of the "o" object.


        
        // 5. finalize() method
        // finalize() method is invoked by the Garbage Collector just before an object is destroyed. 
        // It runs when the object has no remaining references. You can override finalize() to release
        // system resources and perform clean up, but its use is discouraged in modern Java.

        // ObjectClass t = new ObjectClass();
        // System.out.println(t.hashCode());

        // t = null;

        // // calling garbage collector
        // System.gc();

        // System.out.println("end");

        // Explanation: The finalize() method is called just before the object is garbage collected.

        


        // 6. clone() method
        // clone() method creates and returns a new object that is a copy of the current object.

        // Worker w1 = new Worker();
        // try {
        //     Worker w2 = (Worker) w1.clone();
        // } catch (CloneNotSupportedException e) {
        //     e.printStackTrace();
        // }
        

        // System.out.println(w1.name);
        // System.out.println(w2.name);

        // Output
        // John
        // John

        // Explanation: clone() creates a copy of the current object (shallow copy by
        // default). Class must implement Cloneable or else it throws CloneNotSupportedException/



        // 7. Concurrency Methods: wait(), notify(), and notifyAll()
        // These mehtods are related to thread Communication in Java. They are used to make
        // threads wait or notify others in concurrent programming.

        Book b1 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979);

        // create a clone of the book object and print its details
        Book b2 = b1.clone();
        System.out.println(b2);

        // check if the two objects are equal
        System.out.println("b1 equals b2: " + b1.equals(b2));

        // get the hash code of the two objects
        System.out.println("b1 hash code: " + b1.hashCode());
        System.out.println("b2 hash code: " + b2.hashCode());

        // set book1 to null to trigger garbage collection and finalize method

        b1 = null;
        System.gc();



        
        
        






    }

    // @Override protected void finalize() {
    //     System.out.println("finalize method called");
    // }



    // Explanation: The above example demonstrates the use of toString(), 
    // equals(), hashCode(), and clone() methods in the Book class

    
    
}
