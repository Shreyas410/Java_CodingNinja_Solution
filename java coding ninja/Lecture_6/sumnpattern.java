package Lecture_6;

import java.util.Scanner;

public class sumnpattern {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        
        int n = in.nextInt();
        
        if (n < 3) {
        
        System.out.println("Value of n should be greater than or equal to 3");
        
        return;
        
        }
        
        System.out.println("Triangular Numbers from 3 to "
        
        + n + ":");
        
        int sum = 3; //First Triangular Number
        
        for (int i = 3; sum <= n; i++) {
        
        System.out.println(sum);
        
        sum += i;
        
        }
        
        }
        
        }

