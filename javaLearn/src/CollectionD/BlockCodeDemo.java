/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package CollectionD;

/**
 * tat ca cac lenh trong 2 dau {} la block code
 *
 * @author HD ♥ HT
 */
public class BlockCodeDemo {
    {
        System.out.println("Block Code Before");
    }
    static {
        System.out.println("static Block Code Before");
    }

    public BlockCodeDemo() {
        System.out.println("Consatructor");
    }
    
    public static void main(String[] args) {
        BlockCodeDemo demo = new BlockCodeDemo();
    }
    
    static {
        System.out.println("Static Block Code After");
    }
    {
        System.out.println("Block Code After");
    }
}
