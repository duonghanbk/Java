/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package CollectionD;

/**co rat nhieu cong dung
 *
 * @author HD ♥ HT
 */
public class ToString1 {
    public static void main(String[] args) {
        ToString1 tostring = new ToString1();
        System.out.println(tostring);
        System.out.println(tostring.toString());
        MapDemo map = new MapDemo();
        System.out.println(map.toString());
        StringBuilder builder = new StringBuilder("Ahihi Do cho!");
        System.out.println(builder.toString());
    }
    
    
    public  String toString(){
        return " This is Basic Project";
    }
    //tuong tu nhu khi viet exception
    
    
    
}
