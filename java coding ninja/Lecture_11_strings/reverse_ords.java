package Lecture_11_strings;

import java.util.Scanner;

public class reverse_ords {
    public static String reverse(String str) {
        String m ="";
     for (int i = str.length()-1; i >= 0 ; i--) {
         m= m+ str.charAt(i);
     }
     String ans = "";
       int currentwordstart = 0;
       int i = 0;
       for ( i = 0; i < m.length(); i++) {
           if(m.charAt(i)==' '){
               int currentwordend= i -1;
               String reverseword= "";
               for (int j = currentwordend; j >= currentwordstart; j--) {
                reverseword= reverseword+ m.charAt(j);
               }

               ans= ans + reverseword + " ";
               currentwordstart = i+ 1;



           }
       }
       int currentwordend= i -1;
       String reverseword= "";
       for (int j = currentwordend; j >= currentwordstart; j--) {
        reverseword= reverseword+ m.charAt(j);
       }

       ans= ans + reverseword + " ";
       
       
       
        return ans;
        
    }

    
    public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          String str=s.nextLine();
          String m = reverse(str);
          System.out.println(m); 
    }
}
