
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
public class Bitland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int x = 0;
        String c ;
        
        for(int i = 0; i < n+1; i++){
          c = input.nextLine().toLowerCase();
          
          if(c.contains("+")){
              x++;
          }
          else if(c.contains("-")){
              x--;
          }
        }
        System.out.println(x);
        
        input.close();
    }
}
