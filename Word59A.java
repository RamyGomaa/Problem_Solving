
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
public class Word59A {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final String word = input.nextLine();
        final String lowerCaseWord = word.replaceAll("[A-Z]", "");
           
       
        if(lowerCaseWord.length() >= word.length() - lowerCaseWord.length()){
            System.out.println(word.toLowerCase());
        }else {
            System.out.println(word.toUpperCase());
        }
        
        
    }
}
