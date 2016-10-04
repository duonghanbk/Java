/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package CollectionD;

import java.util.ArrayList;
import java.util.Iterator;

/**Interaction: su tuong tac
 *Mot cach giao tiep moi voi collection
 * *ngoai ra,iterator cho phep generic
 * @author HD ♥ HT
 */
public class InteractorDemo {
    public static void main(String[] args) {
        //ArrayList al = new ArrayList();
        ArrayList<String> al = new ArrayList<String>();
        al.add("First");
        al.add("Second");
        al.add("Third");
        //co the dung for hoac interator de duyet arrayList
        
        Iterator iterator = al.iterator();
        //iterator khong co nhieu ham, chu yeu de duyet phan tu
        
        while (iterator.hasNext()) {
            //hashnext(): kiem tra iterator da het hay chua
            System.out.println(iterator.next());
            //lay phan tu: phuong thuc next(

        }
    }
}
