/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctdl.gt;


public class dslk {
    Node head;
    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        n1 = insertHead(head, 2);
        n2 = insertHead(head, 5);
        n3 = insertHead(head, 6);
        n4 = insertPrev(n2, 7);
        
    }
    
    //Node tail;
    public Node insertHead(Node head, int data){
       Node temp = new Node();
       temp.data = data;
       temp.next = head;
       head = temp;
       return temp;
    }
    public Node insertTail(Node head, int data){
        Node temp = new Node();
        Node newNode = new Node();
        newNode.data = data;
        temp.next = head.next;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public Node insertPrev(Node prev, int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = prev.next;
        prev.next = temp;
        return temp;
    }
    
    //delete
    
    public Node deleteHead(Node head){
        Node temp = new Node();
        temp = head.next;
        head = temp;
        return head;
    }
    public Node deleteTail(Node head){
        Node temp1 = new Node();
        Node temp2 = new Node();
        temp1 = head;
        while(temp1.next != null){
            temp2 = temp1;
            temp1 = temp1.next;
        }
        temp2.next = null;
        return head;
    }
    public int deletePrev(Node prev){
        Node temp = new Node();
        temp = prev.next;
        prev.next = prev.next.next;
        int d = temp.data;
        return d;
    }
    
    // find
    
    
    //print
    public void display(Node head){
        Node temp = new Node();
        int count = 0;
        temp = head;
        while(temp !=null){
            System.out.println(temp.data);
            count++;
            temp =temp.next;
        }
        System.out.println("So phan tu cua dslk: " + count);
    }
}
class Node{
    int data;
    Node next;
}
