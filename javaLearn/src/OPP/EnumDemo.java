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
public class EnumDemo {
    enum COLOR {RED, BLUE, GREEN, YELLOW}
    public static void main(String[] args) {
        System.out.println(COLOR.BLUE);
        COLOR c = COLOR.RED;
        System.out.println(c);
        System.out.println(c.YELLOW);
        if (c == COLOR.RED) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        //duoc phep su dung switch voi enum, chi duoc dung gia tri cua no
        //nhung khong duoc dung truc tiep voi ten cua no
        switch (c) {
            case RED:
                System.out.println("RED");
                break;
                case BLUE:
                System.out.println("BLUE");
                break;
                case YELLOW:
                System.out.println("YELLOW");
                break;
                case GREEN:
                System.out.println("GREEN");
                break;
            default:
                System.out.println("No color");;
        }
    }
}
