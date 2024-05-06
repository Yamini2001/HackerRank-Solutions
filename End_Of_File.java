import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1; // Initialize line number
        
        // Loop until reaching the end of file (EOF)
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine(); // Read the next line of input
            
            // Print the line number followed by a single space and then the line content
            System.out.println(lineNumber + " " + line);
            lineNumber++; // Increment line number
        }
        
        scanner.close();
    }
}