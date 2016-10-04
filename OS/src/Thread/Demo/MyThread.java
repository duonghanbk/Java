/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread.Demo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HD ♥ HT
 */
public class MyThread {
    public static void main(String[] args) {
        RunThread test = new RunThread();
       test.start();
    }
    
}

class RunThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("test thread" + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}