
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/281/A
 */

/**
 *
 * @author RamyGomaa
 */
public class WordCapitalization281A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String capital = word.toUpperCase();
        System.out.println(capital.charAt(0)+""+word.substring(1, word.length()));
    }
}
