import java.util.Arrays;

public class arrayclass {
    public static void main(String[] args) {
        // arrays class in java.util is a utility class that provides static methods
        // to perform operations like sorting, searching, comparing, and converting arrays.
        // It cannot be instantiated and is used only for utility purposes.

        /*
        * Provides static methods such as sort(), binarySearch(), equals(), toString(),
        * Implicitly extends Object and is not meant to be instantiated
         */


        // Arrays is a final utility class in java.util package that extends
        // Object class which is the root of the Java class hierarchy

        // To use arrays
        // Arrays.<function_name>;
        // Arrays.sort(array_name);

        // Methods in Java Array Class
        // 1. asList() method
        int[] intArr = {99, 44, 34, 25, 50, 23, 84, 76, 30};

        //To convert the elements as List
        System.out.println("int Array as List: " + Arrays.asList(intArr));

        // 2. binarySearch() Method
        Arrays.sort(intArr);

        int intKey = 50;

        // Print the key and corresponding index
        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));


        // 3. binarySearch(array, fromIndex, toIndex, key, Comparator) Method
        // this method searches a range of the specified array for the specified object
        // using the binary search algo

        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));

        // 4. compare(array 1, array 2) Method
        // This method returns the difference as an integer lexicographically

        // get the array
        int[] arr1 = {10, 20, 15, 22, 35};
        // get the second array
        int[] arr2 = {10, 15, 22};

        // compare both arrays
        System.out.println("int Arrays on comparison: " + Arrays.compare(arr1, arr2));
        // returns 0 if arrays are equal,
        // returns negative value if the first array is smaller
        // returns positive value if the first array is greater.

        // 5. copyOf(originalArray, newLength);
        // copies the specified array, truncating or padding with the
        // default value (if necessary) so the copy has the specified length

        int[] arr3 = {10, 20, 30, 40, 50};
        int[] arr4 = Arrays.copyOf(arr3, 6);

        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }

        System.out.println();

        // 6. copyOfRange(originalArray, fromIndex, endIndex)
        int[] arr5 = {10, 20, 30, 40, 50};
        int[] arr6 = Arrays.copyOfRange(arr5, 2, 4);

        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i] + " ");
        }

        System.out.println();

        // 7. equals(array1, array2)
        int[] arr7 = {10, 20, 30, 40, 50};
        int[] arr8 = {10, 20, 30, 40, 50};
        System.out.println("Both equal?: " + Arrays.equals(arr7, arr8));

        System.out.println();

        // 8. fill(originalArray, fillValue);
        int[] arr9 = {10, 20, 30, 40, 50};
        Arrays.fill(arr9, 423);
        System.out.println(Arrays.toString(arr9));

        // 9. hashCode(originalArray)
        System.out.println(Arrays.hashCode(arr9));
        //returns an integer hashCode of this array instance

        // 10. mismatch(array1, array2);
        int[] gf = {10, 2, 43, 22, 53, 23};
        int[] fa = {10, 2, 43, 23, 53, 24};
        System.out.println(Arrays.mismatch(gf, fa));
        // this returns the index of the first unmatched element between the two specified arrays.

        // 11. sort(originalArray)
        // sorts the complete array in ascending order
        int[] fde = {10, 2, 43, 22, 53, 23};
        Arrays.sort(fde);
        System.out.println(Arrays.toString(fde));

        // 12. sort(originalArray, fromIndex, toIndex)
        // sorts the specified range of array in ascending order

        int[] fde4 = {10, 2, 43, 22, 53, 23};
        Arrays.sort(fde4, 2, 6);
        System.out.println(Arrays.toString(fde4));

        // 13.spliterator(originalArray)

        int[] afd = {10, 2, 43, 22, 53, 23};
        Arrays.spliterator(afd);
        System.out.println(Arrays.toString(afd));
        // returns a spliterator covering all of the specified arrays.

        // 14. stream(originalArray)
        int[] fwf = {10, 2, 43, 22, 53, 23};
        System.out.println(Arrays.stream(fwf).sum());
        // returns a sequential stream with the specified array as its source.


        // 15. toString(originalArray)
        // returns a string representation of the array, where elements are enclosed
        // in square brackets [] and seperated by a comma and a space

        int[] arf = {10, 2, 43, 22, 53, 23};
        System.out.println(Arrays.toString(arf));







    }
}