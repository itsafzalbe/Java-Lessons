public class Operators {
    public static void main(String[] args) {
        // There are 8 types of operators in Java
        /*
        1. Arithmetic operators => (+, -, *, /, %)
        2. Unary operators => (++, --)
        3. Logical operators => (&&, ||, !)
        4. Assignment operators => (+=, -=, *=, /=, %=, =)
        5. Relational operators => (>, <, <=, >=, ==, !=)
        6. Ternary operators => (condition? true:false;)
        7. Bitwise & shift operators => (&, |, ^, <<, >>, >>>)
        8. Instance of operators => (obj instanceof Integer)
         */

        // 1.Arithemtic operators (+, -, *, /, %)
        System.out.println("sum: " + (3 + 3));
        System.out.println("difference: " + (3 - 3));
        System.out.println("division: " + (3 / 3));
        System.out.println("multiplication: " + (3 * 3));
        System.out.println("modulus: " + (4 % 3));
        
        System.out.println();
        // -----------------------------------------------------------------

        // 2.Unary operators (++, --)
        int s = 3;
        System.out.println(s++); // here we print first 3 then increment
        // changed to 4
        System.out.println(s--); // here we print first 4 then decrement
        // changed to 3

        System.out.println();

        System.out.println(++s); // here we increment to 4 then print
        //  here is the result is 4
        System.out.println(--s); // here we decrement to 3 then print
        // here is the result is 3

        System.out.println();
        // -----------------------------------------------------------------


        // 3. Logical Operators  (&&, ||, !)
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        System.out.println();
        // -----------------------------------------------------------------

        // 4. Assignment Operators (+=, -=, *=, /=, %=, =)
        int num = 10;
        System.out.println("Initial: " + num);

        num += 53;
        System.out.println("num += 53: "  + num);

        num -= 3;
        System.out.println("num -= 3: "  + num);

        num *= 4;
        System.out.println("num *= 4: "  + num);

        num /= 24;
        System.out.println("num /= 24: " + num);

        num %= 6;
        System.out.println("num %= 6: " + num);

        num = 343;
        System.out.println("num = 343: " + num);

        System.out.println();
        // -----------------------------------------------------------------

        // 5. Relational operators => (>, <, <=, >=, ==, !=)
        int a = 32;
        int b = 43;
        int c = 46;

        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a == b: " + (a > b));
        System.out.println("a != c: " + (a != c));

        System.out.println();
        // -----------------------------------------------------------------

        // 6. Ternary operators => (condition? true:false;)
        int num1 = 20, num2 = 10, num3 = 30, result;

        result = ((num1 > num2) ? (num1 > num3) ? num1 : num3 : (num2 > num3) ? num2 : num3);
        System.out.println("Max of three numbers = "+ result);



        System.out.println();
        // -----------------------------------------------------------------

        // 8. Instance of operators => (obj instanceof Integer)

        String hello = "Hello";
        System.out.println(hello instanceof String);

        Object obj = 23;
        System.out.println(obj instanceof  Integer);
        System.out.println(obj instanceof  String);




    }
    
}
