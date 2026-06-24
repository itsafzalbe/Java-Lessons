public class DecisionMakng {
    public static void main(String[] args) {
        int num = 43;

        // Java if statement
        if (num > 4) {
            System.out.println("Condition is true");
        }
        // this prints only if the condition is true 


        // else if statement in java
        if (num > 50)
            System.out.println("True");
        else if (num < 50)
            System.out.println("False");

        // the code above prints "True"  if the condition matches 
        // if it doesnt it prints "False"


        // nested if in java
        int i = 10;

        if (i < 15) {
            System.out.println("The number is less than 15");
            if (i == 10) {
                System.out.println("The number is exactly 10");
            }
        }


        // if else if ladder
        int gd = 10;

        if (gd == 20) {
            System.out.println("The number is equal to 20");
        } else if (gd == 30) {
            System.out.println("The number is equal to 30");
        } else if (gd == 40) {
            System.out.println("The number is equal to 40");
        } else {
            System.out.println("The number is equal to 10");
        }


        // java switch case
        int hf = 20;
        switch (hf) {
            case 5:
                System.out.println("The number is 5");
                break;
            case 10:
                System.out.println("The number is 10");
                break;
            case 20:
                System.out.println("The number is 20");
                break;
            case 30:
                System.out.println("The number is 30");
                break;
            default:
                System.out.println("Not present");
        }



    }
    
}
