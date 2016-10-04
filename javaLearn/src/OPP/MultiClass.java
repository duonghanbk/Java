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
public class MultiClass {
    public static void main(String[] args) {
        A a1 = new A();
        a1.setName("Admin");
        System.out.println(a1.getName());
        
        A a2 = new A();
        a2.setName("Root");
        System.out.println(a2.getName());
        B b1 = new B();
    }
}
class A{
    private  String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class B{
    
}