/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package OPP;

/**
 *
 * @author HD ♥ HT
 */
public class StaticDemo {
    public static void main(String[] args) {
        Room r1 = new Room();
        r1.number = 10;
        System.out.println("R1 number : " + r1.number);
        System.out.println("R1 area before: " + r1.area);
        r1.area = 300;
        System.out.println("R1 area after: " + r1.area);
        Room r2 = new Room();
        r2.number = 20;
        Room.area = 400;
        Room.show();
        System.out.println("R2 number : " + r2.number);
        System.out.println("R2 area : " + r2.area);
        Room r3 = new Room();
        r3.number = 30;
        System.out.println("R3 number : " + r3.number);
        System.out.println("R3 area : " + r3.area);
    }
}

class Room{
    static int area = 200;
    int number;
    public static void show(){
        System.out.println("Hello");
    }
}

