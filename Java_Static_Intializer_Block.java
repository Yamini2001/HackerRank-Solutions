import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
            int B = sc.nextInt();
            int H = sc.nextInt();
            if(B<=0 || H<=0){
                throw new Exception("Breadth and height must be positive");
            }
             int area = B * H;
            System.out.println(area);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}