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
public class InterfaceDemo {
    public static void main(String[] args) {
        Manager man = new Manager();
        man.Show();
    }
}
interface Human{
    public static final int AVG_AGE = 100;
    int AVG_WEIGH = 60;
    
    public abstract void Show();
    void study();
    
}

class Manager implements Human{

    @Override
    public void Show() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("AGE:" + AVG_AGE);
    }

    @Override
    public void study() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}