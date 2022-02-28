package Lecture_8;

import java.util.Scanner;

public class add {
    
    public static int addition(int a , int b  ){
        int c= a+b;
        return c;
    }
   public static int even (int d , int e){
       int i = 1;
       
       for (i = 1; i<e; i++){
          if (i%2 ==0 ){
              System.out.println(i);
          }
       }
    return i;
   }

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();       

        int addi= addition(num1, num2);
        System.out.println(addi);

        int num3 = s.nextInt();
        int num4 = s.nextInt();
        int even = even(num3 , num4);
        System.out.println(even); 
        s.close();
    }
}
