
import java.util.Arrays;
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/706/B
 */
/**
 *
 * @author RamyGomaa
 */
public class InterestingDrink706B {

    public static int binarySearch(int[] A, int key) {
        // search space is A[left..right]
        int left = 0, right = A.length;

        while (left < right) {

            int mid = (left + right) / 2;

            if (A[mid] <= key) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] pricesDays = new int[n];

        for (int i = 0; i < n; i++) {
            pricesDays[i] = input.nextInt();
        }
        Arrays.sort(pricesDays);
        int days = input.nextInt();

        while (days-- != 0) {
            System.out.println(binarySearch(pricesDays, input.nextInt()));

        }

    }

}
