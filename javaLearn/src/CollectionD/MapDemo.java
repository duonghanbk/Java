/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package CollectionD;

import java.util.HashMap;

/**
 *
 * @author HD ♥ HT
 */
public class MapDemo {
    
    public static void main(String[] args) {
        //khai bao map
        //vector va arrayList de luu tru va lay phan tu tu Index
        //o dang list
        //map k theo index ma theo Key
        //Moi Map co 1 key va tuong ung voi noi key la mot value tuong ung
        
        HashMap map = new HashMap();
        //day vao: put( Key,  Value);
        map.put("Instructor", "HD");
        map.put("Other", "TH");
        map.put(new Integer(20), "Viet Nam");
        //lay ra
        System.out.println(map.get("Instructor"));
        System.out.println(map.get("Other"));
        //neu day them vao nua
        map.put("Other", "GB");
        System.out.println(map.get("Other"));
        //replace old value by new value
        //remove
        map.remove("Other");
        System.out.println(map.get("Other"));
        //clear method
        map.clear();
        System.out.println(map.get("Other"));
        //return null
        
    }
}
