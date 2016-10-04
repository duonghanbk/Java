/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package OPP;

/**Ham dung
 *
 * @author HD ♥ HT
 */
public class Constructer1 {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.getSize());
        System.out.println(b1.getString());
        
        Box b2 = new Box(20, "GREEN");
        System.out.println(b2.getSize());
        System.out.println(b2.getString());
        //do ham constructor co tham so 
        //khong co lenh println nen khong hien thi
        //done?
    }
}

class Box{
    private int size;
    private String color;
    
    public Box(){
        size = 10;
        color = "BLUE";
        //maybe creat some command
        System.out.println("Day la constructor");
        
    }
    //overload
    public Box(int size, String color){
        this.size = size;
        this.color = color;
    }
    
    public int getSize(){
        return size;
    }
    public String getString(){
        return color;
    }
    
    
    
}