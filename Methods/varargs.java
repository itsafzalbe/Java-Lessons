class varargs {
     // method that accepts variable number of String arguments using varargs
     public static void names(String... n) {

          //iterating through the array and printing each name
          for (String i : n) {
               System.out.print(i + " ");
          }
          System.out.println();
     }

     public static int sum(int ... s) {
          int sum = 0;
          for (int i : s) {
               sum += i;
          }
          return sum;
     }

     public static void main(String[] args) {
          // calling the names method with different number of arguments
          names("John", "Sam", "Angela", "Thomas");

          // here we get the sum of all numbers we sent
          int a = sum(3, 5, 6, 2, 6, 23, 53, 2, 55);
          System.out.println(a);

     }
}