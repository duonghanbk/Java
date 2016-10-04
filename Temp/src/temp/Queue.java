/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

/**
 *
 * @author HD ♥ HT
 */
public class Queue {
    //dua vao hang doi
    public static void enQueue(int []a,int n, int x){
        a[n] = x;
        n++;
    }
    
    public static int deQueue(int [] a,int n)
    {
        if(n ==0)
            return -1;
        int x = a[0];
        
        // lap phan tu a[0]
        for(int i = 0; i< n-1 ; i++){
            a[i] = a[i+1];
        }
        n--;
        return x;
    
    }
    
    public static void dequeueAll(int [] a, int n){
        while(n>0){
            int x = deQueue(a,n);
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) {
        int []a = new int[100];
        int n = 0;
        enQueue(a,n,17);
        enQueue(a,n,23);
        enQueue(a,n,97);
        enQueue(a,n,44);
        dequeueAll(a,n);
    }
}
