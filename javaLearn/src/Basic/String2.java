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
public class String2 {

    public static void main(String[] args) {
        String noname = " This is Noname Noname Noname";

        //do dai cua xau : length;
        System.out.println(noname.length());
        //thay the cac phan tu": replace
        System.out.println(noname.replace("Noname", "Nothing"));
        //thay the phan tu dau tien: replace First
        System.out.println(noname.replaceFirst("Noname", "Nothing"));

        String noname2 = "Nothing";

        //so sanh 2 chuoi bang nhau
        if (noname2.equals("Nothing")) {
            System.out.println("True");
        }
        if (noname2 == "Nothing") {
            System.out.println("True");
        }
        //sau khi dung cac phuong thuc thi gia tri xau khong thay doi
        System.out.println(noname);

    }
}
