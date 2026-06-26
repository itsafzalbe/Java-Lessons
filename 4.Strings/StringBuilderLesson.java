public class StringBuilderLesson {
    public static void main(String[] args) {
        // StringBuilder Class in Java
        // In Java, the StringBuilder class provides a mutable sequence of characters
        // Unlike String class (which is immutable), StringBuilder allows modification of character
        // sequence without creating new objects, making it memory-efficient and faster for frequent string 
        // operations.

        /*
        * Provides similar functionality to StringBuffer, but without thread safety
        * StringBuilder is not synchronized, so it performs better in single-threaded applications
        * Use StringBuffer only when thread safety is required, otherwise, prefer StringBuilder for improved performance
         */

        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Initial StringBuilder: " + sb);

        sb.append(" is awesome");
        System.out.println("After append: " + sb);


        // commonly used methods
        
        StringBuilder bs = new StringBuilder("GeeksForGeeks");
        System.out.println("Initial: " + bs);

        // 1. append()
        bs.append(" is awesome!");
        System.out.println("After append: " + bs);

        // 2. insert()
        bs.insert(13, "Java");
        System.out.println("After insert: " + bs);

        // 3. replace() 
        bs.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + bs);

        // 4. delete()
        bs.delete(8, 14);
        System.out.println("After delete: " + bs);

        // 5. reverse()
        bs.reverse();
        System.out.println("After reverse: " + bs);

        // 6. capacity()
        System.out.println("Capacity: " + bs.capacity());
        // 7. length()
        System.out.println("Length: " + bs.length());

        // 8. charAt();
        char c = bs.charAt(5);
        System.out.println("Character at index 5: " + c);

        // 9. setChar();
        bs.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + bs);

        // 10. substring();
        String sub = bs.substring(5, 10);
        System.out.println("Substring (5-10): " + sub);

        // 11. reverse();
        bs.reverse(); // revert for search
        System.out.println("Index of 'Geeks': " + bs.indexOf("Geeks"));

        // 12. deleteCharAt();
        bs.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + bs);

        // 13. toString();
        // converts the StringBuilder object to a String
        String result = bs.toString();
        System.out.println("Final String: " + result);

        // StringBuilder => use case -> single-threaded string manipulation
        // StringBuffer => use case -> multi-threaded string manipulation
    }

    // Advantages of String Builder
    /*
    * Performs faster string manipulations in single-threaded environments 
    * Reduces memory overhead by modifyinh content in place
    * Automatically increases capacity when needed
    * Suitable for operations inside loops where strings are frequently changed.
    */

    // Limitations 
    /*
    * Not thread-safe because it is not synchronized
    * May consume extra memory if large capacity is allocated unnecessarily 
    * Requires additional synchronization for safe use in multi-threaded applications 
    */
    
}
