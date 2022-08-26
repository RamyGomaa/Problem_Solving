
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/1/A
 */
/**
 *
 * @author RamyGomaa
 */
public class TheatreSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double n = input.nextInt();
        final double m = input.nextInt();
        final double a = input.nextInt();
        
       
       
        System.out.println( (long)(Math.ceil(n/a)* Math.ceil(m/a)));
        
        
    }
}
