class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class introduction {
    public static void main(String[] args) {
        // Arrays in Java
        // an array is a collection of elements of the same data type sorted in co
        // contiguous memory locations. It allows multiple values to be stored under
        // a single name and accessed using an index.

        /*
        * Java arrays can hold both primitive types (like int, char, boolean, etc,) and objects (like String, Integer, etc)
        * When we use arrays of primitive types, the elements are stored in contiguous locations, For non primitve types, reference to items are stored at contiguous locations
        * After creating an array, its size is fixed; we can not change it
         */

        //primitive array
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.print("Primitive Array -> ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Non-primitive array (String objects)
        String[] names = {"John", "Mathew", "Sam"};
        System.out.print("Non-Primitive Array -> ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }


        // Declaring an Array
        // There are two ways to declare an array
        // dataType[] arrayName;
        // or
        // dataType arrayName[];

        // Initializing an Array
        // When an array is declared only the reference is created, Memory is allocated
        // using the new keyword by specifying the array size
        // int[] arr = new int[size]

        // Once the array is created, its size is fixed, and cannot be changed.
        // Memory for arrays is always allocated on the heap in Java
        // The elements in the array allocated by the new will automatically be initialized to zero (for numeric types), false (for boolean) or null (for reference types)


        // Initialization using Array Literal
        // int[] arr = {1, 2, 3};

        // OPERATIONS ON ARRAY ELEMENTS
        // 1. Accessing array elements
        int[] arr3 = {2, 4, 8, 12, 16};

        // Accessing the fifth element
        System.out.print(arr3[4] + " ");

        // Accessing the first elemetn
        System.out.print(arr3[0]);


        // 2. Updating Array Elements
        int[] arr4 = {2, 4, 8, 12, 16};

        //Updating first element
        arr[0] = 90;
        System.out.println(arr[0]);

        // 3. Traversing Array
        int[] arr5 = {2, 4, 8, 12, 16};

        //Traversing and printing array
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr[i] + " ");
        }


        // 4. Size of Array
        int[] arr6 = {2, 4, 8, 12, 16};
        System.out.println("\nSize of array: " + arr.length);



        // ARRAYS OF OBJCETS in JAVA
        // An array of objects is created like an array of primitive-type data items
        Student[] arr7;
        arr7 = new Student[5];

        // rn the memory allocated space for the arr7, there are overall 5
        // boxes with the value of null

        arr7[0] = new Student(1, "John");
        arr7[1] = new Student(2, "Alice");
        arr7[2] = new Student(3, "Sam");
        arr7[3] = new Student(4, "Thomas");
        arr7[4] = new Student(5, "Sarah");

        for (int i = 0; i < arr7.length; i++) {
            System.out.println("Element at " + i + " : { " + arr7[i].roll_no + " " + arr7[i].name + " }");
        }


        // passing arrays to methods
        System.out.println();
        int[] arr8 = {10, 3, 34, 53, 2, 23, 66, 32};
        sum(arr8);

        //returning array
        int[] arr9 = m1();
        for (int i = 0; i < arr9.length; i++)
            System.out.print(arr9[i] + " ");








    }

    // Passing Arrays to Methods
    public static void sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("Sum of array values: " + sum);
    }

    // returning arrays from methods
    public static int[] m1() {
        return new int[] {1, 2, 3, 4};
    }

}