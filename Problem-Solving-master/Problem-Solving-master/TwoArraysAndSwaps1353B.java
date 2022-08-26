
import java.util.Arrays;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RamyGomaa
 */
public class TwoArraysAndSwaps1353B {

    public static Scanner input = new Scanner(System.in);
    static int n, k;
    static int[] a;
    static int[] b;

    public static void Answer() {
        n = input.nextInt();
        k = input.nextInt();
        a = new int[n];
        b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = input.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        int temp;
        for (int i = 0; i < k; i++) {
            if (b[(n - 1) - i] > a[i]) {
                temp = b[(n - 1) - i];
                b[(n - 1) - i] = a[i];
                a[i] = temp;
            }

        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {

        int t = input.nextInt();

        while (t-- != 0) {
            Answer();
        }
        input.close();

    }

}
