/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package CollectionD;

/**DN: DONG BO HOA
 *Y NGHIA: BAO VE RESORCE
 * @author HD ♥ HT
 */
public class SynchronizedDemo {
    public static void main(String[] args) {
        Threadnext threadroot = new Threadnext();
        Thread thread1 = new Thread(threadroot);
        Thread thread2 = new Thread(threadroot);
        
        thread1.setName("John");
        thread2.setName("Clover");
        thread1.start();
        thread2.start();
    }
}

class Threadnext implements Runnable{
    private int money = 1000;
    //tuy synchronized dong bo hoa tai nguyen nhung song song
    //la viec lam giam hieu nang cua chuong trinh
    public synchronized void run(){
        try {
            for (int i = 0; i < 10; i++) {
                
                
                Thread.sleep(50);
                System.out.println(Thread.currentThread().getName() + " " + i + " " + money--);
                
            
                
                
            }
        } catch (Exception e) {
        }
    }
    
}
