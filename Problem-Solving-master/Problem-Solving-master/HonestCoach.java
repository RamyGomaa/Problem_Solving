
import java.util.Arrays;
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/1360/B
 */
/**
 *
 * @author RamyGomaa
 */
public class HonestCoach {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        int margin = 1001 ;

        int n = input.nextInt();
        int k;
        while (n--!=0) {
            k = input.nextInt();
            arr = new int[k];
            for (int j = 0; j < k; j++) {
                arr[j] = input.nextInt();
            }
            Arrays.sort(arr);
            for (int c = k - 1; c > 0; c--) {
                if (arr[c] - arr[c - 1] < margin) {
                    margin = arr[c] - arr[c - 1];
                }
            }
            System.out.println(margin);
            margin = 1001;
        }

    }
}
