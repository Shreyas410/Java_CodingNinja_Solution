package Lecture_5;

import java.util.Scanner;

public class triangular_pattern3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1;
        // int p =1;
        while(i<=n){
            int p=i;
            int j = 1;
            while (j<=p) {
            
                System.out.print(p-j);
                // p=p+1;
                j=j+1;

            }
            System.out.println();
            i=i+1;

        }
    }
}
