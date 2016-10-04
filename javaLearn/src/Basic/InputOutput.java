/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author HD ♥ HT
 */
public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Demo IO");
        int i;
        double d;
        String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        i = scan.nextInt();
        System.out.println("Enter the double:");
        d = scan.nextDouble();
        System.out.println("Enter the String:");
        scan.nextLine();
        s = scan.nextLine();
        
        
        //Ouput
        
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
    }
}
