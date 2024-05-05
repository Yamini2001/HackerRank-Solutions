import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        boolean isFirstLine = true;

        while(sc.hasNext()){
            if(isFirstLine) {
                System.out.println("================================");
                isFirstLine = false;
            }
            
            String s = sc.next();
            int n = sc.nextInt();
            System.out.printf("%-15s%03d%n", s, n);
        }
        
        System.out.println("================================");
    }
}