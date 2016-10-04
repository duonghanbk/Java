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
public class StringDemo {
    public static void main(String[] args) {
        String name = "Nguyen Nhat Minh";
        System.out.println(name);
        //lay ra ki tu vi tri n: ham charAt(n)
        System.out.println(name.charAt(6));
        //tra ve vi tri int cua xau trong chuoi: indexOf(String n)
        System.out.println(name.indexOf("Nhat"));
        //lay ra xau co vi tri n den cuoi: substring(int beginIndex)
        System.out.println(name.substring(6));
        //lay ra xau co vi tri tu int a den int b
        System.out.println(name.substring(5, 10));
        String other = " This Is SimPle      ";
        System.out.println(other);
        //cat cac space o dau va cuoi cua chuoi
        System.out.println(other.trim());
        //chuyen het ki tu thanh ki tu thuong(hoa):toLowerCase
        System.out.println(other.toLowerCase());
        System.out.println(other.toUpperCase());
        //chia xau thanh cac phan tu  khong chua dau cach
        String [] arr = other.trim().split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
            
}
