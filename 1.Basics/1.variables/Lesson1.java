public class Lesson1 {
    public static void main(String[] args) {

        // integer variable
        int num1 = 2;
        System.out.println(num1);

        // string variable
        String job_title = "Software Engineer";
        System.out.println("Job title: " + job_title);

        // char variable
        char var = 'c';
        System.out.println("Character: " + var);

        // float variable
        float pi = 3.14f;
        System.out.println("Pi: " + pi);

        // naming rules of java variables - ok 
        // can start with the dollar sign($) or underscore (_) and the letters from (a-z, A-Z), 
        // variable names cannot start with the numbers
        //int 34j =5r; -> this is not allowed
        int num2 = 32;
        int $num = 34;
        int _num2 = 334;

        // variable names cannot be java reserved words like (int, class, if)
        // int if = 32; => this is not allowed

        // variable names are case sensitive meaning 
        int age = 23;
        // adn 
        int Age = 21;
        // these are two different variables
        System.out.println("age: " + age);
        System.out.println("Age: " + Age);

        // variable names cannot contain the space, like 
        // int a b = 3; => this is not allowed
        int a = 5, n = 5;
        System.out.println("a: " + a);
        System.out.println("n: " + n);

        // is better to follow typical conventions when it comes to naming variables
        // use camelCase for better readability
        int totalMarks = 43;
        System.out.println(totalMarks);




        // first declaration and then you can assign 
        String name;
        name = "Afzalbek";
        System.err.println("Name: " + name);
        


    }
}