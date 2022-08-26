
import java.util.Arrays;
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/489/B
 */
/**
 *
 * @author RamyGomaa
 */
public class BerSUBall489B {

    public static boolean fit(int a, int b) {

        return (a == (b + 1) || a == b || a == (b - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numBoys = input.nextInt();
        int[] bs = new int[numBoys];

        //getting boys skills
        for (int i = 0; i < numBoys; i++) {
            bs[i] = input.nextInt();
        }

        int numGirls = input.nextInt();
        int[] gs = new int[numGirls];

        // getting girls skills
        for (int i = 0; i < numGirls; i++) {
            gs[i] = input.nextInt();
        }

        Arrays.sort(bs);
        Arrays.sort(gs);
        
        int fitCouples = 0;
        int i = numBoys-1;
        int j = numGirls-1;
        while (i >= 0 && j >= 0) {
            if (!fit(bs[i], gs[j])) {
                if(bs[i]>gs[j]){
                    i--;
                }else{
                    j--;
                }
                
            }else{
                fitCouples++;
                j--;
                i--;
            }
            
        }
        System.out.println(fitCouples);

    }
}
