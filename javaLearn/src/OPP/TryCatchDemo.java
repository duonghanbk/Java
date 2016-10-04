/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package OPP;

/**Cong dung: Write log, show dialog, print cmd
 *
 * @author HD ♥ HT
 */
public class TryCatchDemo {

    public static void main(String[] args) {
        String test = " Hoc lap trinh";
        try {
            System.out.println("Before");

            //lay thu xau con trong xau test: substring
            //System.out.println(test.substring(50));
//            System.out.println("After");
            int a = 5;
            int b = 0;
            System.out.println("a/b: " + a / b);
        } //catch de bat cac ngoai le
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.toString());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.toString());
        }
//        catch(Exception e){
//            System.out.println("Error: " + e.toString);
//        }
        
        finally {
            System.out.println("Always done!");
        }
        System.out.println("After");
    }
}
