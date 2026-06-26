public class StringVsStringBuilderVsStringBuffer {
    public static void main(String[] args) {
        // In Java, strings are widely used to store and manipulate text.
        // However, Java provides three different classes for handling string-related
        // operations, String, StringBuilder, and StringBuffer.

        // String
        // String in Java is an immutable sequence of characters, meaning once a String is created, it cannot be changed.
        String str = "Hello";

        // creates a new object
        str.concat(" World");
        System.out.println(str);

        // output: Hello

        // StringBuilder
        // StringBuilder is a mutable sequence of charactrs introduced in Java 5
        // It allows modification of the string content without creating new objects.

        StringBuilder sf = new StringBuilder("Hello");
        sf.append(" World");
        System.out.println(sf);

        // Explanation: In the above example append() method modifies existing object directly without creating a new one

        // StringBuffer
        // StringBuffer is also a mutable sequence of characters, similar to StringBuilder, but it is thread-safe and synchronized.

        StringBuffer fd = new StringBuffer("Hello");
        fd.append(" World");
        System.out.println(fd);

        // Explanation: in the above example append() modifies the existing object safely in a multi-threaded environment



        // UseCases of String, StringBuilder, and StringBuffer

        /*
        * If a string is going to remain constant throughout the program, then use the String class object because a String object is immutable
        * If a string can change (for exampl: lots of logic and operations in the construction of the String) and will only be accessed from a single thread, using a StringBuilder is good enough
        * If a string can change and will be accessed from multiple threads, use a StringBuffer because StringBuffer is synchronous, so you have thread safety.
        *  If you dont want thread-safety than you can also go with StringBuilder class as it is not synchronized 
        */
    }
    
}
