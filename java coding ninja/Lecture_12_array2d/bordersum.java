package Lecture_12_array2d;

import java.util.Scanner;



public class bordersum {

    public static void totalSum(int[][] mat) {
		int rows = mat.length;
        int cols = 0;
        if(rows!=0){
            cols = mat[0].length;
        }
        
        int rs = 0;
        int cs = 0;
        int re = rows-1;
        int ce = cols-1;
        int count = 0;
        int sum=0;
        
        while(count<(rows * cols)){
        
        for(int i = cs; i<=ce; i++){
             System.out.print(mat[rs][i] + " ");
            sum =sum+ mat[rs][i];
            count++;
        }
         rs++;
        
        for(int i = rs; i<=re; i++){
             System.out.print(mat[i][ce]+ " ");
            sum =sum+ mat[i][ce];
            count++;
        }
        ce--;
        
        
        for(int i = ce; i>=cs; i--){
             System.out.print(mat[re][i] + " ");
            sum =sum+ mat[re][i];
            count++;
        }
         re--;
      
        
        // for(int i = re; i>=rs; i--){
        //     // System.out.print(mat[i][cs] + " ");
        //     sum =sum+ mat[i][cs];
        //     count++;
        // }
        // cs++;
        }
		System.out.println(sum);
	}
	





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows"); 
        int rows = sc.nextInt();
        System.out.println("Enter number of cols"); 
        int cols = sc.nextInt();
    
    
          int [] [] mat = new int [rows][cols];
    
          for (int i = 0; i < rows; i++) {
              for (int j = 0; j < cols; j++) {
                 System.out.println("Enter the"+i+"th row  and " +j+"th column"); 
                 mat[i][j]= sc.nextInt();
             }
          }
          for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                 System.out.print(mat[i][j]+" ");
    
      }
      System.out.println();
    }
    totalSum(mat);
  
     }
}
