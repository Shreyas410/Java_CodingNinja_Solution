package Lecture_5;

import java.util.Scanner;

public class character_pattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1;
        while(i<=n){
           char p = (char)('A'+i-1);
            int j = 1;
            while (j<=i) {
                // char pattern= (char)('A');
                System.out.print(p);
                p = (char)(p+1);
                j=j+1;

            }
            System.out.println();
            i=i+1;

        }
    }
}
