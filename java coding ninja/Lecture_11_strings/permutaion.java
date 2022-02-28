package Lecture_11_strings;

import java.util.Scanner;

public class permutaion {
    public static boolean isPermutation(String str1, String str2){
        
        int n = str1.length();
        int m = str2.length();
        if(m!=n){
            return false;
        }
        if (m==n){
            int coun1=0;
            int count2= 0;
        for (int i = 0; i < n; i++) {
           coun1 = coun1 + str1.charAt(i) ;
           count2 = count2 + str2.charAt(i) ;
            
        }
        if(coun1== count2){
        
        return true;
        }
        
    }
        return false; 
}



        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       String str1=s.nextLine();
       String str2=s.nextLine();
       boolean t = isPermutation(str1, str2);
       System.out.println(t);
   }
}
