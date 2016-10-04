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
public class OverrideDemo extends OverrideTest {

    public static void main(String[] args) {
        OverrideDemo tester = new OverrideDemo();
        tester.show();

    }

    @Override
    //2 ohuong thuc cung ten,tham so va kieu gia tri tra ve
//modifier cua override trong subclass phai rong hon modifier trong class cha
    public void show() {
        System.out.println("Welcome to Override Demo");
    }
}

class OverrideTest {

    protected void show() {
        System.out.println("welcome to Override test");
    }
}
