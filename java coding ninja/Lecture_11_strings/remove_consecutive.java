package Lecture_11_strings;

public class remove_consecutive {

    public static String removeConsecutiveDuplicates(String str){
        
        String ans = "";
        char m =' ';
        for (int i = 0; i < str.length(); i++) {
            if (m!=str.charAt(i)) {
                ans= ans + str.charAt(i);
                m= str.charAt(i);
            }
        }

        
        
        return ans;

    }
    public static void main(String[] args) {
        String str = "aabbccdd";
        String s = removeConsecutiveDuplicates(str);
        System.out.println(s);
    }
}
