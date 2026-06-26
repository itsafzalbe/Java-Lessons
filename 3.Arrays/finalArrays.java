public class finalArrays {
    public static void main(String[] args) {

        // Final Arrays
        // in Java final keyword makes a variable's reference constant, not its contents
        // So when an array is declared as final, you cannot reassign it to print to a new
        // array. However, you can still modify the elements within the array

        /*
        * final array must be initialized once and cannot be reassigned later
        * Helps maintain a fixed reference, improving code safety and predictability
         */

        // Final Array means
        // If an array is final, It means we cannot make it point to a new array, but we
        // can change the elements inside it
        // Sample example
        final int[] arr = {10, 20, 30};

        // modifying elements inside the array is allowed
        arr[2] = 34;

        // reassigning the array reference is not allowed
        // arr = new int[]{600, 700, 800}; // Compilation error





    }
}