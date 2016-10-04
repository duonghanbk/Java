/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
*Generic lien quan den arrayList, Vector , HashMap
 */
package CollectionD;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * bat tien khi phai nho vi tri phan tu cua arrayList binh thuong generic quan
 * ly viec them va quan ly du lieu cho arrayList generic cho phep su dung duy
 * nhat loai doi tuong ma khong can quan tam phan tu cua no loai gi, thoai mai
 * su dung
 *
 * @author HD ♥ HT
 */
public class GenericDemo {

    public static void main(String[] args) {
        // ArrayList al = new ArrayList();
        // bat tien khi dung arrayList: tra ve dang Object
        //ep kieu
//        al.add(new A());
//        al.add(new B());
//        for (int i = 0; i < al.size(); i++) {
//            al.get(i).show();
//        }
        ArrayList<A> al = new ArrayList<A>();
        al.add(new A());
        al.add(new A());
        for (int i = 0; i < al.size(); i++) {
            //dung generic
            //cho phep su dung ma k can quan tam den kieu tra ve

            al.get(i).show();
        }
        //HashMap quan ly theo Key va Value nen can 2 doi tuong...
        HashMap<String, B> map = new HashMap<String, B>();
        map.put("HD", new B());
        //vai truong hop loi dien hinh
//        map.put("admin", new A());
//        map.put(new Integer(3), new B());

    }
}

class A {

    public void show() {

    }
}

class B {

    public void go() {

    }
}
