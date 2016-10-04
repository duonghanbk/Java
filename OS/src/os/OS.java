/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os;

/**
 *
 * @author HD ♥ HT
 */
public class OS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sum T1 = new Sum(1,100); T1.start();
    Sum T2 = new Sum(10,200); T2.start();
    System.out.println("Main process terminated");
        // TODO code application logic here
    }
    
}
class Sum extends Thread{
int low, up, S;
public Sum(int a, int b){
low = a; up = b; S= 0;
System.out.println("This is Thread "+this.getId());
}
public void run(){
for(int i= low; i < up; i ++) S+= i;
System.out.println(this.getId()+ " : " + S);
}
}
