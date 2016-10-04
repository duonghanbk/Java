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
public class LinkListTemp2{
    public int mssv;
    public String name;
    public LinkListTemp2 next;
    public static void main(String[] args) {
        
    }
    // ham dung
    public LinkListTemp2(int mssv, String name){
        this.mssv = mssv;
        this.name = name;
    }
    public String toString(String name){
        return name;
    }
    //in node
    public void Print(){
        System.out.println(mssv + ":" + name);
    }
}
//lam cac cong viec voi node
class LinkList{
    
    
    public LinkListTemp2 head;
    public LinkList(){
        head = null;
    }
    
    //ham isEmpty
    public boolean isEmpty(){
        return (head == null);
    }
    public void insertHead(int mssv, String name){
        LinkListTemp2 newNode = new LinkListTemp2(mssv, name);
        newNode.next = head;
        head = newNode;
    }
    
    public LinkListTemp2 removeFirst(){
        LinkListTemp2 linkReference = head;
        if(!isEmpty()){
            head = head.next;
        } else{
            System.out.println("Empty LinkedList");
        }
        return linkReference;
    }
    
    public void Print(){
        LinkListTemp2 tmp = head;
        
        while(tmp != null){
            tmp.Print();
            System.out.println("Next Link" + tmp);
            tmp = tmp.next;
        }
    }
    
    //tim kiem
    
    public LinkListTemp2 find(String name){
        LinkListTemp2 tmp = head;
        
        if(!isEmpty()){
            while(tmp.name != name){
                if(tmp.next == null){
                    return null;
                }else{
                    tmp = tmp.next;
                    }
            }
        }else{
            System.out.println("Empty Linked List");
        }
        return tmp;
    } 
}
