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
public class Stack {
    public static void push(int a[], int n , int x){
    a[n] = x;
    n++;
}
    //lay ra tung phan tu
    public static int pop(int[] a, int n){
        if(n == 0) return -1;
        int x = a [n-1];
        n--;
        return x;
    }
    
    //lay ra het
    public static void popall(int[] a, int n){
        while (n>0) {
            int x = pop(a,n);
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) {
        int [] a = new int[100];
        int n = 0;
        //day vao
        push(a,n,17);
        push(a,n,23);
        push(a,n,97);
        push(a,n,44);
        
        popall(a,n);
        
    }
}
