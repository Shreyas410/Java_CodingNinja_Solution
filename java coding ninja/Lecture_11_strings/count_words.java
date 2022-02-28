package Lecture_11_strings;

import java.util.Scanner;

public class count_words {

    private static void printChars(String str) {
        int count =0;
        
        for(int i=0;i<str.length();i++){
          char ch = str.charAt(i);
          if(ch==' '){
              count++;
          }
        }
    System.out.println(count+1);
    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      printChars(str);
      s.close();
    }

   
}
