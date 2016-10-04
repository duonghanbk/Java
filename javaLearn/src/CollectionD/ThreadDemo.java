/*
 * Tap tanh lam quen voi Java
 * Created by Duong Han
  *  CN-CNTT3
 */
package CollectionD;

/**Thread: La tien trinh ( chuong trinh khi chay)
 *khac phuc viec chi cho don thua ke of class trong java
 * @author HD ♥ HT
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                try {
                    System.out.println("Pause");
                    Thread.sleep(3000);
                    System.out.println("Restart");
                } catch (InterruptedException e) {
                    
                }
            }
            
        };
        thread.start();
       // co the su dung thread.run();
       myThread mythread = new myThread();
       mythread.start();
    }
}
class myThread extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Pause" + i);
                Thread.sleep(500);
                System.out.println("Restart" + i);
            }
            
            
        } catch (InterruptedException e) {
        }
    }
}

//cach khac de xay dung tien trinh

class urThread implements Runnable{
    public void run(){
        
    }
}
