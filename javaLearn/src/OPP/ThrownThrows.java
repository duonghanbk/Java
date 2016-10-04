/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package OPP;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HD ♥ HT
 */
public class ThrownThrows {

    public static void main(String[] args) {
        Building b = new Building();
        try {
            b.go();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThrownThrows.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Myexception extends Exception {
    //Do something
}

class Building {

    void show() throws Myexception {
        int numberConnections = 0;
        //do something
        if (numberConnections > 100) {
            throw new Myexception();
        }

    }

    void go() throws InterruptedException {
        Thread.sleep(1000);
    }
}
