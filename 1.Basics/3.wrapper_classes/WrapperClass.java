
import java.util.ArrayList;


public class WrapperClass {
    public static void main(String[] args) {
        // in java wrapper classes allow primitive data types to be represented as objects. 
        // this enables primitives to be used in the object oriented feautres
        // such as collections, generics, and APIs that require objects

        int b = 2233;
        
        // Autoboxing: primitive int -> Integer object
        Integer a = b;

        System.out.println("The primitive int b is: " + b);
        System.out.println("The integer object a is: " + a);


        // Why do we need wrapper classes?
        /*
        1. Java collections (HashMap, ArrayList, atc) only stores objects, not primitives
        2. Wrapper classes allow primitives to be used in the object oriented features like methods, synchronization or serialization
        3. Objects support null values, while primitives not
        4. Wrapper classes provide utility methods such as compareTo(), equals(), and toString()
         */

        // 1. Autoboxing  => converting primitive data type -> corresponding wrapper class. 

        char ch = 'a';

        //autoboxing: char -> Character 
        Character c = ch;


        ArrayList<Integer> list = new ArrayList<>();

        // autoboxing: int -> Integer
        list.add(25);
        System.out.println(list.get(0));

        //2. Unboxing  => conversion of wrapper class to corresponding primitive type.
        Character f = 'a';
        // Unboxing: Character -> char
        char d = f;

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(23);
        //Unboxing: Integer -> int
        int num3 = list.get(0);
        System.out.println(num3);


        // Java wrapper classes Examples
        byte byteVar = 1;
        Byte byteobj = Byte.valueOf(byteVar);

        int i = 3;
        Integer intObj = Integer.valueOf(i);

        float g = 19.4f;
        Float floatObj = Float.valueOf(g);

        double h = 332.4;
        Double doubleObj = Double.valueOf(h);

        char j = 'r';
        Character charObj = j;

        System.out.println("Wrapper objects");
        System.out.println(byteobj);
        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(doubleObj);
        System.out.println(charObj);

        // Unboxing
        byte bv = byteobj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;

        System.out.println("\nUnwrapped objects");
        System.out.println(bv);
        System.out.println(iv);
        System.out.println(fv);
        System.out.println(dv);
        System.out.println(cv);


        // Primitive data types & Wrapped classes
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean


        // Methods

        // parseXxx(String s) => converts a string into its corresponding primitive type
        int w = Integer.parseInt("233");
        System.out.println(w);

        boolean sa = Boolean.parseBoolean("true");
        System.out.println(sa);

        float fl = Float.parseFloat("43.4f");
        System.err.println(fl);

        // valueOf(String s) => converts a String into wrapper object
        Integer af = Integer.valueOf("243");
        System.out.println(af);

        Boolean ng = Boolean.valueOf("false");
        System.out.println(ng);

        Float gh = Float.valueOf("243.43f");
        System.out.println(gh);

        // valueOf(primitive) => converts a primitive value into a wrapper obj

        Integer ag = Integer.valueOf(43);
        System.out.println(ag);
    }
}
