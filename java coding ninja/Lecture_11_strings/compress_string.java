package Lecture_11_strings;

public class compress_string {
    public static String getCompressedString(String str) {
        int len = str.length();
        String x="";
        for(int i = 0; i<len; i++){
            
            int count = 1;
        
        while(i<len-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
            
            x+=str.charAt(i);
        
        if (count>1){
            x =  (x+count);
        }
        }
        
        return x;
    }



    public static void main(String[] args) {
        String str = "abbccdd";
        String s =getCompressedString(str);
        System.out.println(s);
    }
}
