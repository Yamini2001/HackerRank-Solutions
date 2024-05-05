import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = sc.nextDouble();
        sc.nextLine(); // Consume the new line character left in the buffer
        String s = sc.nextLine();
        System.out.println("String: "+s);
        System.out.println("Double: "+x);
        System.out.println("Int: "+n);
    }
}