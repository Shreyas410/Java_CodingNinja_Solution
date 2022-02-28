package Lecture_4;

import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int base = sc.nextInt();
        int expo = sc.nextInt();
        double sol=  Math.pow(base, expo);
        int ans = (int) sol;
        System.out.println((ans));

    }
}
