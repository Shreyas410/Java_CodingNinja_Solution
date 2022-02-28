package Lecture_6;

import java.util.Scanner;

public class isopattern2 {
    public static void main(String[] args) {
        
    
        Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
            int i = 1;
        while(i<=n){
        
            int spaces= 1;
            while (spaces<= n-i) {
               
                System.out.print(" ");
               
                spaces = spaces + 1;
            }
                int num = 1;
                while (num<=i) 
                {
                 System.out.print("*");
                 num= num+1;   
                }
               int dec = i-1;
               while (dec>=1) {
                   System.out.print("*");
                   dec = dec -1;
                   
               }
            
            System.out.println();
            i=i+1;
    
        }
    }
}
