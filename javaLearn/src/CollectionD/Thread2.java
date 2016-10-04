/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package CollectionD;

/**java chi tuan thu trong 1 thread
 * giua cac thread khong tuan theo bat cu su tuan tu nao
 *
 * @author HD ♥ HT
 */
public class Thread2 {
    public static void main(String[] args) {
        Threadtwo threadroot = new Threadtwo();
        Thread thread1 = new Thread(threadroot);
        Thread thread2 = new Thread(threadroot);
        
        thread1.setName("John");
        thread2.setName("Clover");
        thread1.start();
        thread2.start();
        
        
    }
}

class Threadtwo implements Runnable{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(50);
                System.out.println(Thread.currentThread().getName() + " " + i);
                
                
            }
        } catch (Exception e) {
        }
    }
    
}