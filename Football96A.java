
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/96/A
 */

/**
 *
 * @author RamyGomaa
 */
public class Football96A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String players = input.nextLine();
        char compare = '0';
        int counter =0;
        for(char a : players.toCharArray()){
            if(compare==a){
                counter++;
            }else{
                compare = a;
                counter=1;
            }
            if(counter>=7){
                System.out.println("YES");
                return;
            }
            
        }
        System.out.println("NO");
        
        
        
    }
}
