public class StringImmutability {
    public static void main(String[] args) {
        // Strings are one of the most commonly used objects in Java. A String is immutable
        // which means that once a String object is created, its value cannot be changed.

        /*
        * Strings are stored in a String Pool, allowing reuse of objects and reducing memory overhead.
        * Multiple threads can safely share the same string object without synchronization
         */

        String str = "Hello";
        str.concat(" World");

        System.out.println(str);

        // output: Hello

        // Explanation:
        // In the above example, the concat(), method does not modify the original String object
        // When str.concat(" World") is executed
        // * A new String object "Hello World" is created
        // * The original String "Hello" remains unchanged
        // * Since the new object is not assigned to any variable, it is discarded

        // How to Modify a String?

        // strings cannot be modified directly, you must store the result in the new reference

        String str1  = "John";
        str1 = str1.concat(" Doe");

        System.out.println(str1);

        // Result: John Doe

        // Why are strings immutable
        // * Security: Prevents sensitive data such as passwords, file paths, and URLs from being modified after creation.
        // * String Pool Optimization: Allows multiple reference to safely share the same string object, saving memory
        // * Thread Safety: Multiple threads can access the same string object without syncronization issues
        // * HashCode Caching: The hashcode remains constant, improving the performance of collections like HashMap
        // * Better Memory Management: Immutable strings can be reused, reducing unnecessary object creation.
    }
}