/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package FileIO;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HD ♥ HT
 */
public class File_n_Directory {
    public static void main(String[] args) {
        
        //vi import io nen phai co cau truc try catch
        //day la cach duy nhat tao filer trong java, doan v
        try {
            File file = new File("temp.txt");
            file.createNewFile();
            //khai bao thu muc trong java
            File directory = new File("newDir");
            //tao thu muc trong java
            directory.mkdir();
            
            
        } catch (IOException ex) {
            Logger.getLogger(File_n_Directory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
