
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
public class WrongSubtraction977A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int k = input.nextInt();
        
        for(int i = 0 ; i < k; i ++){
            if(num %10 == 0){
                num/=10;
                
            }else {
                num --;
            }
        }
        
        System.out.println(num);
        
        
        
    }
}
