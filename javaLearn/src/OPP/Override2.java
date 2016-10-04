/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package OPP;

import java.io.IOException;

/**Kieu gia tri tra ve cua override
 *
 * @author HD ♥ HT
 */
public class Override2 extends Testthis{
    public int increase(int a){
        return a + 7;
    }
    
    //Override kieu binh thuong
//    public OverrideTest creat(){
//        return new OverrideTest();
//        
//    }
    
    //chi override ma kieu tra ve la con
    public OverrideDemo creat(){
        return new OverrideDemo();
    }
}
class Testthis{
    public int increase(int a){
        return a + 5;
    }
    
    public OverrideTest creat() throws IOException {
        return new OverrideTest();
    }
}
