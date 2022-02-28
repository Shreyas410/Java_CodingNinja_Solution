package Lecture_7;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          //int i =0;
          int num =0;
          //Empty String
          String  primeNumbers = "";
          boolean isPrime = true;
        //   System.out.print("Enter the value of n: ");
        //   System.out.println();
          int n = scanner.nextInt();
    
          for (int i = 2; i < n; i++) {
             isPrime = true;
             for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                   isPrime = false; 
                }
             }
             if (isPrime)
             System.out.println(i);
          }	
    
        }
}


