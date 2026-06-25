public class StringClass {
    public static void main(String[] args) {

        // string class in Java represents a sequence of characters and is widely used for
        // handling textual data. It provides various methods for creating, comparing, and 
        // manipulating strings. String objects are immutable, meaning their values cannot
        // be changed after creation.

        /*
        * Stored in the String Pool to optimize memory usage and reuse objects
        * Immutable nature ensures better security and thread safety.
        * Can be createed using the string literals or the new keyword.
         */

        // STRING CONSTRUCTORS IN JAVA
        // in Java, string constructors are used to create new string objects from different
        // sources like character arrays, byte arrays, or another string. Although strings in Java are
        // usually created using string literals, the String class also provides constructors for more control.

        // Constructor 1: Creating string using new keyword
        String str1 = new String("Hello Java");
        System.out.println("String using new keyword: " + str1);

        // Constructor 2: Creating string from character array
        char[] charArray = {'J', 'A', 'V', 'A'};
        String str2 = new String(charArray);
        System.out.println("String from char array: " + str2);

        // Constructor 3: Creating string from byte array
        byte[] byteArray = { 72, 101, 108, 108, 111 };
        String str3 = new String(byteArray);
        System.out.println("String from byte array: " + str3);
        
    }
    
}
