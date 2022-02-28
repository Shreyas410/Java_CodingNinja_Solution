package Lecture_11_strings;

// import java.util.Scanner;

public class remove_character {
    public static String removecharacter(String s, char ch) {
        
        int n = s.length();
        String m = "";
        for (int i = 0; i <n; i++) {
            if(s.charAt(i)!=ch){
                m=m+s.charAt(i);

            }
        }
        
        
        return m;
        
    }
    public static void main(String[] args) {
        
        String s = " aabbccdde";
        char ch  = 'b';
        String ans  = removecharacter(s,ch);
      
        System.out.println(ans);

    }
}
