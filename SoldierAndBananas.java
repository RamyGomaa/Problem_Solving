
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
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int cost = input.nextInt();
        final int money = input.nextInt();
        final int numOfWntedBanans = input.nextInt();
        int totalMoney = 0;
 
        
        for(int i = numOfWntedBanans; i != 0 ; i--){
            totalMoney += i ;
        }
        
        if((totalMoney*cost)> money){
              System.out.println((totalMoney*cost)-money);
        }
        else {
            System.out.println("0");
        }
        
        
    }
}
