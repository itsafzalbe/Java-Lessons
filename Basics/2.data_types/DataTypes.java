class Car {
    public String model;
    public int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(model + " " + year);
    }
}


interface Animal {
    String sound();
}

class Dog implements Animal {
    public String sound() {
        return ("Woof");
    }

}


public class DataTypes {
    public static void main(String[] args) {


        //There are two different types of Data Types in Java
        //Primitive and Non-Primitive
        //Primitive data types simply store the values  directly in the memory
        //Non-Primitive data types store the reference to the object in the memery.
        

        // Primitive data types
        boolean boolVar = false;        // range: true, false

        byte byteVar = 10;              // range: -128 to 127

        char charVar = 'F';             // range: 0 to 65,535

        short shortVar = 2000;          // range: -32,768 to 32,767
        int intVar = 34;                // range: -2,147,483,648 to -2,147,483,647
        long longVar = 123456789L;      // range: ±9.22e18
        
        float floatVar = 43.4f;           // range: ~6–7 digits precision
        double doubleVar = 3.141d;      // range: ~15–16 digits precision

        System.out.println("boolVar: " + boolVar);
        System.out.println("byteVar: " + byteVar);
        System.out.println("charVar: " + charVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: "+ longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: "+ doubleVar);

        System.out.println();

        // Non-Primitive (Reference) data types
        //string
        String str = "Hello";
        System.out.println("Str value: " + str);

        //class 
        Car myCar = new Car("Audi", 2022);
        myCar.display();

        //object - is an instance of a class - represents real - world entities
        // it has state (data), behavior (method) and identity (unique interface)
        Car car2 = new Car("BMW X7", 2023);
        System.out.println("Model: " + car2.model);
        System.out.println("Year: " + car2.year);

        System.out.println();
        // interface  ==
        Animal dog = new Dog();
        System.out.println("Dog sound: " + dog.sound());


        // array
        int[] arrInt = {23, 32, 444, 553, 23, 24, 42};
        String[] arrString = {"John", "Alice", "Thomas", "Jane"};
        System.out.println("arrInt 5rd number:" + arrInt[4]);
        System.out.println("arrString 4nd name: " + arrString[3]);


    }
}
