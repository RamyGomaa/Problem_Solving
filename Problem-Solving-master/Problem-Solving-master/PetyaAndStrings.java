
import java.util.Scanner;

//https://codeforces.com/problemset/problem/112/A

/**
 *
 * @author RamyGomaa
 */
public class PetyaAndStrings {
    public static void main(String[] args) {
        String[] s = new String[2] ;
        Scanner input = new Scanner(System.in);
        s[0] = input.nextLine().toLowerCase();
        s[1] = input.nextLine().toLowerCase();
       
        
          if(s[0].compareTo(s[1])>0){
              System.out.println("1");
          }
          else if(s[0].compareTo(s[1])<0){
              System.out.println("-1");
          }
          else{
              System.out.println("0");
          }
        
    }
    
}
