/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HD ♥ HT
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            File file = new File("blog.txt");
            file.createNewFile();
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            //do something here
            
            String data = "This is Data";
            bw.write(data);
            //loop writing
            bw.write(data + "\n");
            bw.write(data + "\n");
            bw.write(data + "\n");
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(FileWriterDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
