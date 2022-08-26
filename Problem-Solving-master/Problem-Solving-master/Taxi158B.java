
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/158/B
 */
/**
 *
 * @author RamyGomaa
 */
public class Taxi158B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] group = new int[5];

        for (int i = 0; i < n; i++) {
            group[input.nextInt()]++;
        }
        int taxiCount = 0;
        
        taxiCount += group[4];
     
        int group13 = Math.min(group[1], group[3]);
        taxiCount += group13;
        group[3] -= group13;
        group[1] -= group13;
        taxiCount += group[3];

        taxiCount += group[2] / 2;
        group[2] -= (group[2] / 2)*2;
     
          if (group[2] == 1 && group[1] >= 2) {
            taxiCount++;
            group[2] = 0;
            group[1] -= 2;
        }
       
        taxiCount += Math.ceil((((double)group[1] + (double)group[2]) / 4));
        
        System.out.println(taxiCount);
    }

}
