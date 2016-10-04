/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

/**
 *
 * @author HD ♥ HT
 */
public class Student {
    
    private String name = "Minh";
    private int age = 16;
    //phuong thuc: method
    public void showStudent(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }
    public void addNumber(int a, int b)
    {
        System.out.println("Tong 2 so la " + (a+b));
    }
    public static void main(String[] args)
{
    Student st = new Student();
    st.showStudent();
    st.addNumber(2, 3);
    
    //System.out.println("Tong 2 so la" + st.addNumber(2, 3));
    //st.addNumber(2,3);
}
}

