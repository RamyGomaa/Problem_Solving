
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/519/B
 */
/**
 *
 * @author RamyGomaa
 */
public class AandBandCompilationErrors519B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int value = 0;
        int newValue = 0;
    
        for (int i = 0; i < n; i++) {
            value += input.nextInt();

        }
        
        for (int i = 0; i < n - 1; i++) {
            newValue += input.nextInt();
        }
        System.out.println(value-newValue);
        
        
        value = 0;
        for (int i = 0; i < n - 2; i++) {
            value += input.nextInt();
        }
        System.out.println(newValue-value);
        
    }
}
