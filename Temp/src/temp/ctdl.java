import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ctdl {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
            //dissplay
             
        }
        System.out.println(sumofMatrix(n,a));
    }
    public static int sumofMatrix(int n, int a[][]){
        int sumprimd = 0;
        int sumsecond = 0;
        for(int i = 0 ; i< n ; i++){
            for(int j = 0; j< n ; j++){
                if( i == j) {sumprimd += a[i][j];}
                //else{
                    if(i == n-j+1) {sumsecond += a[i][j];}
                //}
                    
            }
        }
        
        
        return Math.abs(sumprimd - sumsecond);
    }
}
