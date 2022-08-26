
import java.util.ArrayList;
import java.util.List;
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
public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<String> names = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
       
            names.add(input.nextLine());
            
        }
        
         for (int i = 0; i <= n; i++) {
            if(names.get(i).length()>10){
                 System.out.print(names.get(i).charAt(0));
             System.out.print(names.get(i).length() -2);
             System.out.println(names.get(i).charAt(names.get(i).length()-1));
            }else{
                System.out.println(names.get(i));
            }
            
        }
        

    }
}
