public class StringMethods {
    public static void main(String[] args) {

        // Java String methods are built in functions provided by the String class
        // to perform various operations on strings

        String str = "HelloWorld";
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(2, 6));


        // Commonly used Java String Methods

        // 1. int length() Method => total count of characters in the string
        System.out.println(str.length());

        // 2. charAt(int i) Method => returns the character at i th index
        System.out.println(str.charAt(5));

        // 3. String substring(int i) Method => returns the substring from the ith index character to end
        System.out.println(str.substring(5));

        // 4. String substring(int i, int j) Method => returns the substring from i to j-1 index
        System.out.println(str.substring(5, 9));

        // 5. String concat(String str) method => appends the given string to the end of the current string
        System.out.println(str.concat("!"));

        // 6. int indexOf(String s) method => returns the index within the string of the first occurence of the specified string.
        // If the specified string s is not found in the input string, the method returns -1 by default.

        System.out.println(str.indexOf("World"));

        // 7. int indexOf(String s, int i) Method => returns the index withing the string of the first occurence of the specified string
        System.out.println(str.indexOf("l" , 4));

        // 8. int lastIndexOf(String s) Method
        // This returns the index of within the string of the last occurence of the specified string. 
        // return -1 if  s is not found.
        System.out.println(str.lastIndexOf("o"));


        // 9. boolean equals(Object otherObj) Method
        // compares this string to the specified object
        String s = "HelloWorld";
        System.out.println(s.equals("HelloWorld"));

        // 10. boolean equalsIgnoreCase(String anotherString) Method
        // checks if two strings are equal, without considering the letter case.

        System.out.println(s.equalsIgnoreCase("helloworld"));

        // 11. int compareTo(String anotherString) Method
        // compares two string lexicographically
        System.out.println(s.compareTo("HelloJava"));


        // 12. int compareToIgnoreCase(String anotherString) Method
        // compares two string lexicographically, ignoring the case considerations.

        System.out.println(s.compareToIgnoreCase("Hello World"));


        // 13. String toLowerCase() Method => this converts all the characters in the string to lower case
        String sf = "HELLOJAVA";
        System.out.println(sf.toLowerCase());

        // 14. String toUpperCase() Method
        // converts all characters in the String to upper case
        String lower = "hellojava";
        System.out.println(lower.toUpperCase());

        // 15. String trim() Method
        // returns the copy of the String, by removing whitespaces at both ends. It does not modify the whitespace characters present between the text
        String wf = "    Hello, Trim!                ";
        System.out.println("'" + wf.trim() + "'");
        // output 'Hello, Trim!'

        // 16. String replace(char oldChar, char newChar) Method
        // this method returns a new string where all instances of oldChar are replaced by newChar
        String dew = "gfzglbek";
        System.out.println(dew.replace('g', 'a'));


        // 17. boolean contains(CharSequence sequence) Method
        // returns true if string contains the given string
        String rw = "Hello, Afzalbek";
        System.out.println(rw.contains("Afzalbek"));

        // 18. char[] toCharArray() Method
        // converts the String into a new character array
        String strf = "Hello";
        char[] chars = strf.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }

        System.out.println();

        // 19. boolean startsWith(String prefix) Method
        // returns true if string starts with this prefix
        String h = "Hello, World";
        System.out.println(h.startsWith("Hello"));






    }
}