
import java.util.Scanner;

/**
 *
 * @author RamyGomaa
 */
public class Watermelon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int w;
        Scanner input = new Scanner(System.in);
        w=input.nextInt();
        
        if(w>2&&w%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    
}
}