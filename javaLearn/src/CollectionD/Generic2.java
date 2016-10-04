/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
*Generic lien quan den quan he thua ke trong java
 */
package CollectionD;

import java.util.Vector;

/**
 *
 * @author HD ♥ HT
 */
public class Generic2 {
    public static void main(String[] args) {
        Vector<C> vector = new Vector<C>();
        vector.add(new C());
        vector.add(new D());
        //khong bao loi vi D la con cua C
        
        Vector<D> vector2 = new Vector<D>();
        //vector2.add(new C());
        vector2.add(new D());
        
        //loi vi chi khong chap nhan class cha
        //
    }
}

class C{
    
}
class D extends C{
    
}