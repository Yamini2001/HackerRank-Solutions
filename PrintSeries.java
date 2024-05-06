import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of queries
        int queries = scanner.nextInt();
        
        // Process each query
        for (int i = 0; i < queries; i++) {
            // Read a, b, and n for the current query
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            // Generate and print the series for the current query
            printSeries(a, b, n);
        }
        
        scanner.close();
    }
    
    // Function to generate and print the series for a query
    private static void printSeries(int a, int b, int n) {
        int sum = a;
        for (int i = 0; i < n; i++) {
            // Calculate the next term of the series using the formula a + 2^0 * b + 2^1 * b + ... + 2^(i-1) * b
            sum += Math.pow(2, i) * b;
            System.out.print(sum + " ");
        }
        System.out.println(); // Print a new line after each series
    }
}
