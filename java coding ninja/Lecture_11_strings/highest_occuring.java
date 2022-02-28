package Lecture_11_strings;

import java.util.Scanner;

public class highest_occuring {
    public static char highestOccuringChar(String str1){
        int len = str1.length();       
        int[] freq = new int[255];
	        int lena = freq.length;
	        int max = 0;
	        int maxi = 0;
	        
	        for(int i = 0; i<len; i++){
	            int var = (int)str1.charAt(i);
	            freq[var]++;
	        }
	        
	        for(int j = 0; j<lena; j++){
	            if (freq[j]>max){
	                max = freq[j];
	                maxi = j;
	            }
	        }
	        
	        char ans = (char)maxi;
	        
	        return ans;
        
    }




    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        char m = highestOccuringChar(str1);
        System.out.println(m);
    }
}
