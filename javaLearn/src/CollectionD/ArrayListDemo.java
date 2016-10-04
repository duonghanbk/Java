/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package CollectionD;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author HD ♥ HT
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        //add phan tu : add
        al.add("Data Add");
        al.add(new String("something etc"));

        al.add(new Integer(5));
        al.add(new Long(10));
        //duyet phan tu : get
        System.out.println(al.get(1));
        System.out.println(al.get(3));

        //remove
        al.remove(3);
        System.out.println(al.get(2));

        Object[] array = al.toArray();
        //chuyen ve 1 mang array cua object
        System.out.println(array.length + " " + al.size());
        //duyet phan tu
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        
        //vector
        
        Vector vector = new Vector();
        //thao tac tuong tu arrayList
        //khac nhau: giong nhu builder va buffer
        //test something
        vector.add("New Vector");
        vector.add(new String("New Vector"));
        vector.add(new Integer(12));
        vector.add(new Long(1000));
        System.out.println(vector.size());
        
    }
}
