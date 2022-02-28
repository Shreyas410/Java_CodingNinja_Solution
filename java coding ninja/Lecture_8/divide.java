package Lecture_8;
import java.util.Scanner;
public class divide {
    
    public static void dividenum(int num1 , int num2){
        if(num2 == 0 ){
            System.out.println("Not allowed");
            return;
    }
    System.out.println(num1 / num2);
        
       

    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b =  s.nextInt();

         dividenum(a, b);
         s.close();
    }
}
