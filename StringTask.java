
import java.util.Scanner;

//https://codeforces.com/problemset/problem/118/A
/**
 *
 * @author RamyGomaa
 */
public class StringTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().toLowerCase();
        String vowels = "aoyeui";
        for (int i = 0; i < s.length(); i++) {
            if (!vowels.contains(s.subSequence(i, i + 1))) {

                System.out.print("." + s.substring(i, i + 1));
            }
        }

    }
}
