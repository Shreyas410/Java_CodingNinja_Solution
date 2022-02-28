package Lecture_11_strings;

public class reverseeach_word {
    public static String reverse_each_word(String s) {
       
       String ans = "";
       int currentwordstart = 0;
       int i = 0;
       for ( i = 0; i < s.length(); i++) {
           if(s.charAt(i)==' '){
               int currentwordend= i -1;
               String reverseword= "";
               for (int j = currentwordend; j >= currentwordstart; j--) {
                reverseword= reverseword+ s.charAt(j);
               }

               ans= ans + reverseword + " ";
               currentwordstart = i+ 1;



           }
       }
       int currentwordend= i -1;
       String reverseword= "";
       for (int j = currentwordend; j >= currentwordstart; j--) {
        reverseword= reverseword+ s.charAt(j);
       }

       ans= ans + reverseword + " ";
       
       
       
        return ans;
        
    }

    public static void main(String[] args) {
        String s = "abc def ghi";
        System.out.println(reverse_each_word(s));
    }
}
