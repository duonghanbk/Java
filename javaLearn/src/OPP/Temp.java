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
abstract class Cow{
        abstract void drink();
        
    }
public class Temp {
    
    
}
class AnonymousInnerExample{
    public static void main(String[] args) {
        //phan code khai bao va khoi tao lop Inner Class
        Cow p = new Cow(){
            void drink(){
                System.out.println("Cow like drinking coffee!!!");
            }
        };
        p.drink();
    }
    
}
