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
public class Overload2 extends Khunglong{

   

   public static void main(String[] args) {
        Overload2 demo = new Overload2();
        System.out.println(demo.add(2, 3));
        System.out.println(demo.add(2.5f, 3.5f, 2f));
        System.out.println(demo.addLong(3000, 2000));
        System.out.println(demo.addString("Hello ", "World"));

    }

    public int add(int a, int b) {
        return a + b;
    }

    //vi du ve overload
    float add(float a, float b, float c) {
        return a + b + c;
    }
}

class Khunglong {

    public long addLong(long a, long b) {
        return a + b;
    }
    public String addString(String str1, String str2){
        return str1 + str2;
    }
}
