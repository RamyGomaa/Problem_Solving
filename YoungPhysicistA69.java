
import java.util.Scanner;


/**
 *
 * @author RamyGomaa
 */
public class A69YoungPhysicist {
    
    
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int numberOfLines = input.nextInt();
        int countX = 0;
        int countY = 0;
        int countZ = 0;
        
        for(int i = 0 ; i < numberOfLines;i++){
           countX += input.nextInt();
           countY += input.nextInt();
           countZ += input.nextInt();
        }
        
        if(countX == 0 && countY==0 && countZ == 0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
            
        
        
    }
}
