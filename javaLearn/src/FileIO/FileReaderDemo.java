/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HD ♥ HT
 */
public class FileReaderDemo {

    public static void main(String[] args) {
        File file = new File("blog.txt");

        try {
            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);
            String line = null;
            int i = 0;
            while ((line = br.readLine()) != null) {
                //do something
                System.out.println(++i + ":" + line);
            }
            
            br.close();
            fr.close();
                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReaderDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {

        }
    }
}
