/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package Basic;

/**
 *
 * @author HD ♥ HT
 */
public class StringBuilderftStringBuffer {

    public static void main(String[] args) {
        String test = "DEMO";
        test.substring(0);
        System.out.println(test);
        //
        //Builder co signature nen an toan hon

        StringBuilder builder = new StringBuilder("Builder");
        //Buffer co cache nen nhanh hon
        StringBuffer buffer = new StringBuffer("Buffer");
        //append: them vao sau chuoi
        builder.append("2016");
        System.out.println(builder);
        //builder.append(true);
        //System.out.println(builder);
        //delete: xoa tu vi tri start to end;
        builder.delete(2, 9);
        System.out.println(builder);
        builder.deleteCharAt(3);
        System.out.println(builder);
        buffer.reverse();
        System.out.println(buffer);
    }
}
