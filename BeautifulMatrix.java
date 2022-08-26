
import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/263/A
 
/**
 *
 * @author RamyGomaa
 */
public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrix[][] = new int[5][5];
        int row = 0, column = 0;

        for (row = 0; row < 5; row++) {
            for (column = 0; column < 5; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        first:
        for (row = 0; row < 5; row++) {
            for (column = 0; column < 5; column++) {
                if (matrix[row][column] == 1) {
                    break first;
                }
            }
        }

        row = 3 - (row + 1);
        column = 3 - (column + 1);
        System.out.println(Math.abs(row) + Math.abs(column));

    }
}
