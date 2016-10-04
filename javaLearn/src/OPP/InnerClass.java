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
public class InnerClass {

    public static void main(String[] args) {
        Outer out = new Outer();
        out.Show();
    }
}

class Outer {

    public void Show() {
        Inner in = new Inner();
        in.display();
    }
//    class Inner{
//        private void display(){
//            Inofinner inn = new Inofinner();
//            inn.display1();
//        }
//        class Inofinner{
//            private void display1(){
//            System.out.println("I am Inner!");
//        }
//        }
//    }

    class Inner {

        public void display() {
            System.out.println("I am Inner!");
        }
    }
}

class C {

    public void Show() {
        Outer.Inner in = new Outer().new Inner();
        in.display();
    }

    //Anonymous Class
    
}
