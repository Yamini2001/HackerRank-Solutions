import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        if(str.equals(String.valueOf(n))){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}