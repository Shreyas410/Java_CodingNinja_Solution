package Lecture_5;

import java.util.Scanner;

public class triangular_pattern1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1;
        while(i<=n){
           
            int j = 1;
            while (j<=i) {
                System.out.print(j);
                j=j+1;
                System.out.print("+");
            }
            System.out.println("=");
            i=i+1;

        }
    }
}
