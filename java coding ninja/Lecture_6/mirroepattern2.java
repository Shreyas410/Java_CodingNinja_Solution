package Lecture_6;

import java.util.Scanner;

public class mirroepattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1;
        // int p =1;
        while(i<=n){
           
            int j = 1;
            while (j<=n-i+1) {
                System.out.print(n-i+1);
                // p=p+1;
                j=j+1;

            }
            System.out.println();
            i=i+1;

        }
    }
}
