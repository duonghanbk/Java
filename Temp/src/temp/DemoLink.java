/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import java.util.Scanner;

/**
 *
 * @author HD ♥ HT
 */
public class DemoLink {
    //cai dat linked list
    //DemoLink head = new DemoLink();
    int data;
    DemoLink next = null;
    
    public static void main(String[] args) {
        ds test = new ds();
        test.creatNode();
        test.print(head);
        
    }   
}

class ds{
    
    //khoi tao danh sach
        public void creatNode(){
        DemoLink head = new DemoLink();
        head.next = null;
        DemoLink tmp = new DemoLink();
        head.next = tmp.next;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua danh sach lien ket don:");
        int n = scan.nextInt();
        System.out.println("Nhap tung phan tu:");
        for(int i = 0 ; i < n ; i++){
            System.out.println("Phan tu thu " + (i+1));
            int temp = scan.nextInt();
            tmp.data = temp;
            tmp = tmp.next;
        }
    }
    
    //Ham chen du lieu vao giua
    
    public DemoLink insertMid(DemoLink prev,int data){
        DemoLink tmp = new DemoLink();
        tmp.data = data;
        //hoan thanh tao node moi
        
        tmp.next = prev.next;
        
        //ca 2 cung tro toi node tiep theo
        prev.next = tmp;
        //ngat link thu prev den next, chuyen sang temp;
        return tmp;
        //tra ve kieu tmp;
        
    }
    
    //xoa phan tu 
    public int delete(DemoLink prev)
    {
        int d;
        DemoLink tmp = new DemoLink();
        tmp = prev.next;
        //gan temp la phan tu bi xoa
        prev.next = prev.next.next;
        //tro node prev qua phan tu xoa den phan tu ke tiep
        
        d = tmp.data;
        
        return d;
        //tra ve gia tri cua node bi xoa
    }
    //insert ds for Head
    public DemoLink insertHead(DemoLink head , int data){
        
        DemoLink tempNode = new DemoLink();
        tempNode.data = data;
        //hoan thanh tao node de chen
        tempNode.next = head;
        head = tempNode;
        return head;
    }
    
    //Insert ds to tail
    public DemoLink insertTail(DemoLink head , int data){
        DemoLink newNode = new DemoLink();
        DemoLink tempNode = new DemoLink();
        newNode.data = data;
        //hoan thanh gan gia tri cho newNode
        tempNode = head;
        //gan Temp = head de cho chay tu dau den cuoi
        
        while(tempNode.next != null){
            tempNode = tempNode.next;}
        
            tempNode.next = newNode;
            
        
        return head;
    }
    
    //delete head node
    public DemoLink deleteHead(DemoLink head){
        DemoLink tmp = new DemoLink();
        tmp = head.next;
        head = tmp;
        return head;
    }
    
    
     //delete the Tail ds
    public DemoLink deleteTail(DemoLink head){
       DemoLink tmp1 = new DemoLink(); 
       DemoLink tmp2 = new DemoLink(); 
       tmp1 = head;
       tmp2 = head;
       while(tmp1.next != null)
       {
           tmp2 = tmp1;
           tmp1 = tmp1.next;
       }
       tmp2.next = null;
       return head;
    }
    
    //check Empty List
    public boolean isEmpty(DemoLink head){
        if (head == null) return true;
        else return false;
    }
    
    //delete LinkedList
    
    public DemoLink makeNull(DemoLink head){
        while(isEmpty(head) == false){
            head = deleteHead(head);
        }
        return head;
    }
    
    //display all node of Linked List
    
    public void print(DemoLink head){
        DemoLink tmp = new DemoLink();
        tmp = head;
        int count = 0 ;
        while(tmp != null){
            System.out.println(tmp.data);
            count ++;
            tmp = tmp.next;
        }
        System.out.print("\n");
        
    }
}

