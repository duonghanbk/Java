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
public class OverLoadDemo {

    public static void main(String[] args) {
        OverLoadDemo demo = new OverLoadDemo();
        System.out.println(demo.add(2, 3));
        System.out.println(demo.add(2.5f, 3.5f, 2f));
        
    }

    public int add(int a, int b) {
        return a + b;
    }

    //vi du ve overload
    float add(float a, float b, float c) {
        return a + b + c;
    }
}
