package Lecture_11_strings;

import java.util.Scanner;

public class palidrome {
    public static boolean reverse(String str) {
        String m ="";
     for (int i = str.length()-1; i >= 0 ; i--) {
         m= m+ str.charAt(i);
     }
     if (m.equals(str)){
        return true;
     }
    
    return false;
     
        
    }

    
    public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          String str=s.nextLine();
         boolean b= reverse(str);
         System.out.println(b);
    }
}


