public class Intro {
    //instance variable
    public int number;
    //constructor
    public Intro(int number) {
        this.number = number;
    }


    // this is an example method (instance method)
    public void greet() {
        System.out.println("Hello ya'll!");
    }

    

    //instance method
    public void addToNumber(int value) {
        number += value;
        System.out.println("New number: " + number);
    }

    // static method
    public static int addNums(int a, int b) {
        return a + b;
    }
    
    
    public static void main(String[] args) {
        // methods are resuable blocks of code 


        // we create the instance of the class
        // which contains the method
        Intro obj = new Intro(20);

        // this is how we call the method
        obj.greet();


        // Types of methods in Java (predefined, and user-defined)
        //Predefined methods are built in methods that comes with the language 
        // forexample
        System.out.println(Math.random());
        System.out.println(Math.PI);

        // user defined ones are written by the user 
        // these methods are modified according to the requirements
        //setName();
        //addNums(a, b);
        //Greet();




        // now there are two types of methods in java, first one being the instance 
        // methods second one are the static methods
        // for the instance methods to work, we need object for example here 
        Intro obj2 = new Intro(30);
        obj2.addToNumber(32);
        obj2.greet();

        // for the static methods to work we dont need the obj, we just need to 
        // write the class name and then the method name 
        int s = Intro.addNums(10, 34);
        System.out.println("Static method result: " + s);


        // now we have seen the static and instance methods, 
        // we have to learn how to name our methods
        //there are certain rules to name them

        // * Method names should start with a verb in lowercase
        // * Multi-word names should follow camelCase format
        // * Method names should be unique within the class unless method overloading is allowed in Java

        





    }
    
}
