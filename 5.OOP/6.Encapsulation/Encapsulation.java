class Programmer {
    private String name;

    // getter method used to get the data
    public String getName() {return name;}

    // setter method is used to set or modify the data
    public void setName(String name) {
        this.name = name;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        // Encapsulation in Java is an object oriented principle that binds data and methods into a sinle unit,
        // typically a class. It restricts direct access to data by hiding implementation details. This ensures 
        // controlled interaction with the data through defined methods.

        /*
            * Achieved using access modifiers like private, protected, and public
            * Improves data security by allowing validation through getters and setters
            * Enhances code maintainability by isolating changes within the class.
        */

        // How Encapsulation is Achieved in Java
        /*
        Encapsulation in Java achieved using:
            * Private data members
            * Public getter and setter methods
        Key Rules: 
            * Declare data as private: Hide the class data so it cannot be accessed directly from outside the class
            * Use getter and setters: Keep variables private and provide public getter and setter methods for controlled access and safe modification, often with validation
            * Apply proper access modifiers: Use private for data hiding and public for methods that provide access
        */

        Programmer p = new Programmer();
        p.setName("Thomas");
        System.out.println("Name: " + p.getName());

        // Output
        // Name: Thomas
        
        // Explanation: in the above example, we use the encapsulation and use getter (getName) and 
        // setter (setName) method which are used to show and modify the private data. This encapsulation mechanism
        // protects the internal state of the Programmer object and allows for better control and flexibility
        // in how the name attribute is accessed and modified.

        // Advantages of Encapsulation
        /*
        The advantages of encapsulation are listed below:
            * Data hiding: Encapsulation restricts direct access to class variables, protecting sensitive data from unauthorized access.
            * Improved Maintainability: Changes to internal implementation can be made without affecting external code that uses the class.
            * Enhanced Security: Encapsulation allows validation and control over data, preventing invalid or harmful values from being set.
            * Code reusability: Encapsulated classes can be reused in different programs without exposing the internal logic
            * Better Modularity: Encapsulation promotes organized, modular code by keeping data and methods together within a class.
        */

        // Disadvantages of Encapsulation
        /*
        The disadvantages of encapsulation are listed below: 
            * Increased Code Complexity: Writing getter and setter methods for every variable can make the code longer and slightly more complex.
            * Performance Overhead: Accessing data through methods instead of directly can introduce a minor performance cost, especially in performance-critical applications.
            * Less Flexibility in Some Cases: Over-restricting access to class members may limit the availability of other classes to extend or use the class efficiently
        */
    }

    
}
