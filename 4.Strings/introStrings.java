public class introStrings {
    public static void main(String[] args) {

        // A string in Java is an object used to store a sequence of characters enclosed in double quotes
        // It uses UTF-16 encoding and provides methods for handling text data.

        /*
        * Each character in a string is stored using 16-bit Unicode (UTF-16) encoding
        * Strings are immutable, meaning their value cannot be changed after creation
        * Java provides a rich API for manipulation, comparison, and concatenation of strings
         */

        // Example
        String name = "Afzalbek";
        String year = "2006";

        //      ______________________________________
        //  Str | A | f | z | a | l | b | e | k | \0 |
        //      --------------------------------------

        // creating Java string using a new keyword
        String str = new String("Afzalbek");
        System.out.println(str);


        //Two ways to create a java string
        // 1. String literal

        String sr = "Hello World";

        // 2. Using new Keyword (Heap memory)
        // uses new keyword creates a new object in heap memory, even if the same string already exists in the pool
        /*
        * One object is created in the heap memory
        * The string literal is stored in the string pool (if not alread present)
        * The reference variable points to the heap object, not the pool
         */

        // Example
        String stf = new String("Hello World!");




        // IMMUTABLE STRING IN JAVA
        // In Java, string objects are immutable. Immutable simply means unmodifiable
        // or unchangeable. Once a string object is created its data or state cant be changed
        // but a new string object is created.


        String hello = "Hello";
        hello.concat(" World");
        System.out.println(hello);

        // output -> Hello

        // but
        String s = hello.concat(" World");
        System.out.println(s);
        // here the new string object "Hello World" is created
        // the original String "Hello" remains unchanged
        // Since the new object is assigned to new variable it will just refer to the new object


        // How Strings are stored in Java Memory
        // String literal
        // Whenever a String Object is created as a literal, the object will be created in the String constant pool.
        // now if create a string object as a literl like this
        String dqwe = "Hello";
        // the dqwe variable is stored in stack, and it is pointing to the "Hello" object in the string constant pool
        // if try to create another variable
        String dwf = "Hello";
        // here the dwf is stored in the stack, but it is pointing to the "Hello" object in the string constant pool the same object as the dqwe is pointing to

        // USING THE new KEYWORD

        // Strings can also be created using the new keyword, which allocates a new object in the heap memory.
        // However, the string literal inside it is still stored in the String constant pool (if not already present)

        // Syntax
        // String str1 = new String("John"); String str2 = new String("Deo");

        // so here we create two new objects in the heap,

        // declaring Strings using String literals
        String s1 = "TAT";
        String s2 = "TAT";

        //declaring Strings using new keyword.
        String s3 = new String("TAT");
        String s4 = new String("TAT");

        // Printing all the Strings
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);



        // Output
        // TAT
        // TAT
        // TAT
        // TAT

        // The JVM Memory Area
        // s1 points to the TAT in heap
        // s2 points to the exact same TAT in heap as the s1
        // s3 points to the new object TAT in the heap
        // s4 points to the new object TAT in the heap


        // NOTE: ALl objects in Java are stored in a heap. The reference variable is to the object stored in the stack
        // area or they can be contained in other objects which puts them in the heap also.
    }
}