

public class StringBufferLesson {
    public static void main(String[] args) {
        // StringBuffer class in Java

        // StringBuffer class in Java represents a sequence of characters
        // that can be modified, which means we can change the content of the StringBuffer without
        // creating a new object every time. It represents a mutable sequence of characters.

        /*
        * Unlike String, we can modify the content of the StringBuffer without creating a new object
        * All methods of the StringBuffer are synchronized, making it safe to use in multithreaded environmnents
        * Ideal for scenarios with frequent notifications like append, insert, delete, or replace operations.
        */

        // Creating StringBuffer
        StringBuffer s = new StringBuffer();

        // adding elements in StringBuffer
        s.append("Hello");
        s.append(", ");
        s.append("World!");

        // String with the StringBuffer value
        String str = s.toString();
        System.out.println(str);

        // Interface Hierarchy Implemented by StringBuffer
        // the StringBuffer class implements Appendable, CharSeuence, and Serializable

        // Constructors of StringBuffer Class
        /*
        * StringBuffer(): It reserves room for 16 characters without reallocation
        * StringBuffer(int size): It accepts an integer argument that explicitly sets the size of the buffer
        * StringBuffer(String str): It accepts a string argument that sets the initial contents of the StringBuffer object and reserves room for 16 more characters without reallocation.
         */


        // 1. Using default constructor
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello");
        System.out.println("Default Constructor: " + sb1);

        // 2. Using constructor with specified capacity
        StringBuffer sb2 = new StringBuffer(50);
        sb2.append("Java Programming Language");
        System.out.println("With Capacity 50: " + sb2);

        // 3. Using constructor with String
        StringBuffer sb3 = new StringBuffer("Welcome");
        sb3.append(" to Java");
        System.out.println("With String: " + sb3);

        // IMPLEMENTATION OF JAVA STRINGBUFFER METHODS

        // 1. append() Method
        // append() method concatenates the given argument with this string
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println(sb);

        // 2. insert() Method
        // insert() method inserts the given string with this string at the given position
        StringBuffer fs = new StringBuffer("Hello ");
        fs.insert(1, "Java");
        System.out.println(fs);

        // 3. replace() Method
        // replace() method replaces the given string from the specified beginIndex and endIndex - 1.
        StringBuffer ge = new StringBuffer("Hello");
        ge.replace(1, 3, "Java");
        System.out.println(ge);

        // 4. delete() Method
        // delete() method is used to delete string from the specified beginIndex to endIndex-1
        StringBuffer twe = new StringBuffer("Hello");
        twe.delete(1, 3);
        System.out.println(twe);

        // 5. reverse() Method
        // reverse() Method of the StringBuffer class reverses the current string
        StringBuffer tre = new StringBuffer("Hello");
        tre.reverse();
        System.out.println(tre);

        // 6. capacity() Method
        // returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of characters increases from its current capacity, it increases the capacity by (oldcapacity * 2) + 2.

        StringBuffer fd = new StringBuffer();

        // default 16
        System.out.println(fd.capacity());
        fd.append("Hello");

        // now 16
        System.out.println(fd.capacity());
        fd.append("java is my favourite language");

        // (oldcapacity * 2) + 2
        System.out.println(fd.capacity());


        // 7. length()
        // returns the number of character in given string
        
        // creating and storing string by creating object of StringBuffer
        StringBuffer tg = new StringBuffer("Afzalbek");

        // getting the length of the string
        int g = tg.length();
        

        // getting the capacity of the string 
        System.out.println("Length of string Afzalbek=" + g);


        // Advantages 
        /*
        * Mutable: Its content can be modified after creationg while String remains immutable
        * Better for Repeated Updates: Frequent concatenations perform efficiently because no new objects are created for each change.
        * Thread-Safe: All methods are synchronized, making it safe in multithreaded environments/
         */

        // Limitations
        /*
        * Performance Overhead: Synchronization makes operations slower compared to non-synchronized alternatives.
        * Not Ideal for Single-Threaded Applications: When tread safety is unnecessary, it adds extra processing cost
        * Lower Performance Than StringBuilder: StringBuilder is preferred in non-treaded scenarios because it is faster.
         */



        








    }
    
}
