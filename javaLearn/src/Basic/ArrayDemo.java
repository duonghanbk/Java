/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author HD ♥ HT
 */
public class ArrayDemo {

    public static void main(String[] args) {
        //two way in order to  creat some array;
        int[] arrInt1 = new int[10];
        int[] arrInt2 = {2, 3, 4, 5};
//      int i;
        for (int i = 0; i < arrInt1.length; i++) {
            System.out.println(arrInt1[i]);
        }
        for (int i = 0; i < arrInt2.length; i++) {
            System.out.println(arrInt2[i]);
        }
        int[][] arrInt3 = new int[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(arrInt3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
