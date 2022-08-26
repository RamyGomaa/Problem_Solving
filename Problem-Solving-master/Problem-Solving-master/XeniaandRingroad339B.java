
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
public class XeniaandRingroad339B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong();
        int m = input.nextInt();
        long[] a = new long[m];
        for (int i = 0; i < m; i++) {
            a[i] = input.nextInt() - 1;
        }

        long moves = 0;
        long house = 0;

        for (int i = 0; i < a.length; i++) {
            if (house != a[i]) {
                if (a[i] < house) {
                    moves += (n) - house;
                    house = 0;
                }

                moves += a[i] - house;
                house = a[i];

            }

        }
        System.out.println(moves);
    }
}
