public class InstanceStatic {

    
    public static void main(String[] args) {

        // as we said before there are two types of methods in Java
        // they are static and instance methods

        // Static methods
        // static methods belong to the class rather than any specific object
        // which allows it to be called without creating an instance.
        // it is commonly used for operations that dont depend on the object state
        // * Can be called using the class name without creating an object
        // * Can access only static variables and methods
        // * Cannot directly access non-static (instance) members

        // Instance Methods
        // an instance method belong to the object of a class and is used to
        // operate on object-specific data. It requires an instance of the class
        // to be called
        // * Can access instance variables, other instance methods and static members
        // * Requires an object to invoke the method
        // * Has access to the this reference, pointing to the current object.



    }
}
