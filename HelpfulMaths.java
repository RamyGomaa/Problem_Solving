
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/339/A
 */
/**
 *
 * @author RamyGomaa
 */
public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> mylist = new ArrayList<>();
        String s = input.nextLine();
        
        
        if(s.length()==1&&s!="+"){
            System.out.println(s);
            return;
        }
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != '+') {

                mylist.add(Character.getNumericValue(s.charAt(i)));

            }
        }

        Collections.sort(mylist);
        
        for (int i = 0; i < mylist.size(); i++) {
            System.out.print(mylist.get(i));
            if(i!=mylist.size() -1){
                System.out.print("+");
            }
        }
    }
}
