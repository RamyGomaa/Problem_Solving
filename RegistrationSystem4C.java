
import java.util.HashMap;
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
public class RegistrationSystem4C {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String name;
        HashMap<String, Integer> dataBase = new HashMap<>();
        name = input.nextLine();
        while (n-- != 0) {
            name = input.nextLine();
            int counter = dataBase.getOrDefault(name, 0);

            if (counter == 0) {
                System.out.println("OK");
                dataBase.put(name, ++counter);
            } else {
                System.out.println(name + counter);
                dataBase.put(name, ++counter);
            }
        }

    }
}
