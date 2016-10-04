/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package OPP;

/**
 *
 * @author HD ♥ HT
 */
public class FinalDemo extends Root {
//    void show(){
//    }
//coi nhu PI la hang so

    final float PI = 3.14f;
    int num;

    public static void main(String[] args) {
        FinalDemo test = new FinalDemo();
        //Co the thay doi bien so(khong co final)
        test.num = 30;
//        ERROR: Khong the thay doi hang so
//        test.PI = 30;
    }

}
//final truoc class: khong duoc ke thua
//final class Root{
//    void show(){
//        
//    }
//}

class Root {
//final truoc phuong thuc: khong duoc dan vao trong override

    final void show() {

    }
}
