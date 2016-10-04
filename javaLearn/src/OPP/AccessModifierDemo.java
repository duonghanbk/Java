/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package OPP;

/**
 * pham vi truy cap
 *
 * @author HD ♥ HT
 */
public class AccessModifierDemo {

    public static void main(String[] args) {
        Boss b1 = new Boss();
        b1.showAge();
        b1.showName();
        b1.showAddress();
        b1.showNumberofWives();
    }

}

class Boss {

    //Everywhere
    public int age;
    //Sane package, its subclass
    protected String name;
    //Same package
    String address;
    //Only for it
    private int numberofWives;

    public void showAge() {
        System.out.println(age);
    }

    protected void showName() {
        System.out.println(name);
    }

    public void showNumberofWives() {
        System.out.println(numberofWives);
    }
    public void showAddress() {
        System.out.println(address);
    }

}
