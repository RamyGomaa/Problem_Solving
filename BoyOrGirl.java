/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author RamyGomaa
 */
public class BoyOrGirl {
    
    
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        
        
        final String name = input.nextLine();
        Set<Character> characters = new HashSet<>();
        
        for(int i = 0; i < name.length(); i++){
            characters.add(name.charAt(i));
        }
        
        if(characters.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }
       
        
        
        
        
        
    }
    
}
