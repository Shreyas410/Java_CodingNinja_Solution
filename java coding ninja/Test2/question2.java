package Test2;

import java.util.Scanner;



public class question2 {
    private static String printChars(String str) {
       int start = 0;
       int end = 0;
       int space =0;
       int minlength =Integer.MAX_VALUE;
        
        
        for(int i=0;i<str.length();i++){
         if (i==str.length() || str.charAt(i)== ' ') {
             int length = i - space;
             if (length<minlength) {
                 minlength = length;
                 start = space;
                 end = i;
             }
         }
   
        }
    return (str.substring(start, end));
    
    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      printChars(str);
      s.close();
    }

}
