
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/231/A
 */
/**
 *
 * @author RamyGomaa
 */
public class Team {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int votes = 0;
        int confirmed = 0;

        while(n--!=0){
            votes = 0;
            for (int j = 0; j < 3; j++) {
                votes += input.nextInt();
            }
            if (votes >= 2) {
                confirmed++;
            }
        }
        System.out.println(confirmed);
    }
}
