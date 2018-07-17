import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        int []N=new int[T];
        if(T>=1||T<=10){
            for (int i = 0; i < T; i++) {
              int cycles =input.nextInt();
               if(cycles>=0||cycles<=60){
                N[i]=cycles;
               }
            }
            int []growth=new int[T];
            
            for (int i = 0; i < growth.length; i++) {
                growth[i]=1;
            }
            
            for (int i = 0; i < N.length; i++) {
                if(N[i]==0){
                 growth[i]=1;
                }else{
                    for (int j = 1; j < (N[i]+1); j++) {
                        if(j%2!=0){
                          growth[i]=(growth[i]*2);
                        }else{
                         growth[i]=(growth[i]+1);
                        }
                    }
                }
                
            }
            for (int j = 0; j < growth.length; j++) {
                    System.out.println(growth[j]);
                }
          
                 
        }
    }
}