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
public class Thuake {
    public static void main(String[] args) {
        ReferentBook book = new ReferentBook();
        book.show();
        book.move();
    }
}
//interface: Khai bao chung cho nnhieu nguoi su dung
interface Document{
    void show();
}

//interface thua ke mot interface khac: extends
interface ReferentDoc extends Document{
    
}

//class thua ke interface: implements

class Book implements Document{
    public void show(){
}
    public void move(){
}
}
//class thua ke class: extends

class ReferentBook extends Book implements Document, ReferentDoc{
    
}

//thua ke trong class: don thua ke
//thua ke trong interface: da thua ke
class Paper implements Document{
    public void show(){
        
    }
}