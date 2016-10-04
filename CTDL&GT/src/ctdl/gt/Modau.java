/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctdl.gt;

/**
 *
 * @author HD ♥ HT
 */
public class Modau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    
    public int exp1(int a, int b){
        int ans = 1;
        while (b > 0) {
            a *= a;
            b -= 1;
        }
        return ans;
    }
    //time = 2 + 3b
    public int exp2(int a, int b){
        if (b == 1){
            return a;
        }
        else{
            return a * exp2(a , b-1);
        }
    }
    //time = 3b -1
    
    public void TowerHanoi(int size, String fromPole, String toPole, String sparePole){
        if(size == 1){
            System.out.println("Move Disk From" + fromPole + " to Pole " + toPole);
            
        }
    }
}
