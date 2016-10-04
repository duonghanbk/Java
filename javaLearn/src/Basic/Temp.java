/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package Basic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import sun.java2d.pipe.SpanShapeRenderer.Simple;

/**
 *
 * @author HD ♥ HT
 */
public class Temp {
    public static void main(String[] args) {
       DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
       Date date = new Date();
       String day = dateFormat.format(date);
        System.out.println(day);
    }
}
