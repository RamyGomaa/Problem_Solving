
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
public class StonesOnTheTable {
    
    
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        
        final int stonesSize = input.nextInt();
            input.nextLine();
         final String stones = input.nextLine();
         int answer = 0;
        
        for(int i = 0 ; i < stones.length()-1; i++){
            final char c = stones.charAt(i);
            if(c == stones.charAt(i+1)){
                answer++;
            }
        }
        
        System.out.println(answer);
        
    }
}
