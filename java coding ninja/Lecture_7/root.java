package Lecture_7;

import java.util.Scanner;

public class root {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int base = sc.nextInt();
        // int expo = sc.nextInt();
        double sol=  Math.pow(base,0.5);
        int ans = (int) sol;
        System.out.println((ans));

    }
}
