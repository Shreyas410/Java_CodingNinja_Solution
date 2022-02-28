package Lecture_11_strings;

import java.util.Scanner;

public class sustring {
    public static void substring(String str) 
    {
        int n = str.length();
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.println(str.substring(i,j));
                
            }
          
        }
        
    }


    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        substring(str);
    }
}
