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
public class Enum2 {
     enum COLOR {RED(2), BLUE(3), GREEN(4), YELLOW(5);
     private int value;
        COLOR(int value){
            this.value = value;
            
        }
        public int getValue(){
            return value;
        }
}
     public static void main(String[] args) {
        COLOR c = COLOR.BLUE;
         System.out.println( c + ":" + c.getValue());
    }
}
