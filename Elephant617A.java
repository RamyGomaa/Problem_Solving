
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
public class Elephant617A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int stepsCount = 0 ;
        
        while(x > 0){
            
            x -=5;
            stepsCount++;
        }
        
        System.out.println(stepsCount);
        
    }
}
