// All of the imports.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

// The public class Algorithms
// This is the main file
public class Algorithms {

    // The ugly main method.
    public static void main(String[] args) {

        // The STATS Values
        int TARGET = 2940;
        int ARRAYSIZE = 10001;

        // Displaying the choices
        System.out.println("-- Linear vs. Binary Search --");
        System.out.println("---    1. Linear Search    ---");
        System.out.println("--     2. Binary Search    ---");
        System.out.println("------------------------------");

        // The input scanner
        System.out.print("Enter number: ");
        Scanner Values = new Scanner(System.in);
        int Choice = Values.nextInt();
        Values.close();
        
        // The arraylist
        ArrayList<Integer> Array = new ArrayList<Integer>();
        for (int num = 0; num < ARRAYSIZE; num++) { Array.add(num); }

        // Return value
        HashMap<String, Integer> ReturnVal = new HashMap<String, Integer>();
        if (Choice == 1) {
            ReturnVal = Linear.Search(Array, TARGET);
        } else if (Choice == 2) {
            ReturnVal = Binary.Search(Array, TARGET);
        }

        System.out.println(ReturnVal);
        
    }
}
