/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author HD ♥ HT
 */
public class Type {

    public static void main(String[] args) {
        char c = 65;
        System.out.println(c);
        byte b = 127;
        System.out.println(b);
        short a = 256;
        System.out.println(a);
        float f1 = 2.34f, f2 = 5.69f;
        System.out.println("So " + Math.max(f1, f2) + " lon hon trong 2 so");
//        boolean ad = true;
        if (b > 100) {
            System.out.println("b lon hon 100");
        } else {
            System.out.println("b nho hon hoac bang 100");
        }
        String country = "VIET NAM";
        country = country + " tuoi dep";
        System.out.println(country);
    }
}
