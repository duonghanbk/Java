/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package Basic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HD ♥ HT
 */
public class TimeDemo {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try {
            for (int i = 0; i < 1000; i++) {
            Thread.sleep(2);
        }
        } catch (Exception e) {
        }
        
        long end = System.currentTimeMillis();
        System.out.println("Millis: " + (end - start));
        
        //Get time by nano
        
        start = System.nanoTime();
        end = System.nanoTime();
        System.out.println("Nano: "+ (end - start));
        
        //Display the system time
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        Date date = new Date();
        String day = dateFormat.format(date);
        System.out.println(day);
    }

}
