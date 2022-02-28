package Lecture_7;
import java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem  ,decimal = 0 ; 
        int j =1;
      while ( num !=0) {
          rem = num %10;
          decimal = decimal + rem *j;
          j=j*2;
          num = num / 10;

      }
      System.out.println(decimal);
    }
}
