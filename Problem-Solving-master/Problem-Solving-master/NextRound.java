
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/158/A
 */
/**
 *
 * @author RamyGomaa
 */
public class NextRound {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int n = input.nextInt();
        final int k = input.nextInt();
        double score , lastScore = -1;
        int participants = 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            score = input.nextInt();
            if ((score > 0 && counter < k) || lastScore == score) {
                lastScore = score;
                participants++;
                counter++;
            }
        }
        System.out.println(participants);
    }
}
