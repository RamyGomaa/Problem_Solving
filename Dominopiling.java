
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/50/A
 */

/**
 *
 * @author RamyGomaa
 */
public class Dominopiling {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       final int M = input.nextInt();
       final int N = input.nextInt();
       int result = N*M/2;
        System.out.println(result);
    }
}
