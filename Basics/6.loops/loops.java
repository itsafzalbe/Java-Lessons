public class loops {
    public static void main(String[] args) {

        // java for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Hello");
        }
        System.out.println();

        // Enhanced for loop (for each)
        // used to iterate over the elements of arrays
        String[] names = {"Sarah", "Alice", "John", "David"};
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
        // while loop - only executes the code body after checking the condition first
        int num = 0;
        while ( num < 10) {
            System.out.print(num + " ");
            num++;
        }


        System.out.println();

        // do while loop - ensures that code block runs at least once before checking the codition first
        int j = 0;
        do { 
            System.out.print(j + " ");
            j++;
        } while (j < 10);
    

    }
    
}
