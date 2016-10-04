/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package OPP;

/**Quan he thua ke constructor
 *khi khai bao constructor thi gia tri mac dinh khong ton tai nua
 * @author HD ♥ HT
 */
public class Constructor2 {
    public static void main(String[] args) {
        Sup s = new Sup();
        
    }
}

class Supper{
    public Supper(){
        System.out.println("Hello");
    }
    
    public Supper(int a){
        
    }
}

class Sup extends Supper{
//    public Sup(int a){
//        //super() : ham goi phuong thuc cha
//        super(a);
//    }
}
