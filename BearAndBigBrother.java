
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
public class BearAndBigBrother {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        
        //first bear
        
         int limak = input.nextInt();
         int bob = input.nextInt();
        
        boolean isLimakBigger = false;
        int years = 0;
        while(!isLimakBigger){
            limak*=3;
            bob*=2;
            isLimakBigger = limak > bob;
            years ++;
        }
        System.out.println(years);
        
    }
}
