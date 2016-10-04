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
public class temp {
    public static void main(String[] args) {
        
        T head = new T();
        T node1 = new T();
        T node2 = new T();
        T node3 = new T();
        T node4 = new T();
        T node5 = new T();
        T node6 = new T();
      head.next = null;   
      node1.data= 1; 
      node1.next = node2;
      node2.data= 2;  
      node2.next = node3;
      node3.data= 3; 
      node3.next = node4;
      node4.data= 4; 
      node4.next = node5;
      node5.data= 5; 
      node5.next = null;
      
      
      
        
        
    }
 }   
    
    


class T{
  
//   T head;
   T next;
   int data;
    public T(){
        data = 0;
         next = null;
    }
    
            
}
