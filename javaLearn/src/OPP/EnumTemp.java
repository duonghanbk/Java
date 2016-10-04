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
public class EnumTemp {

    enum COLOR {
        RED(1), BLUE(2), GREEN(3), YELLOW(4);
        private int value;

        COLOR(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    public static void main(String[] args) {
        COLOR c = COLOR.GREEN;
        System.out.println(c + ":" + c.getValue());
    }

}
