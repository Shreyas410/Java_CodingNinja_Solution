package Lecture_13_oop;

import java.util.Scanner;

public class geter_setter {
    
    public String name;
    private int rollNumber;
    double cgpa;
    final double conversitionFactor = 0.95;

    // Final value is used when dont want to change the value of variable futher


    public int getRollNumber() {
        return rollNumber;
    }
    // public void setRollNumber(int num) {
    //     if (num<=0) {
    //         return ;
    //     }
      
    //     rollNumber = num;
    // }


    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    // this  keyword is used as a reference to curennt object
    public geter_setter(String name, int rollNumber){
        this.name= name;
        this.rollNumber= rollNumber;
    }

    public void print() {
        System.out.println(name + " " + rollNumber);
    }


    public static void main(String[] args) {
      
    // Call using getter setter method
    
    
        //  geter_setter s1 = new geter_setter();
        // geter_setter s2 = new geter_setter();
        // s1.name= "Shreyas";
        // s1.setRollNumber(100);
        // System.out.println(s1.name + " " + s1.getRollNumber()+ "  ");
        


        // s2.name= "Shreyas";
        // s2.setRollNumber(-123);
        // System.out.println(s2.name + " " + s2.getRollNumber()+ "  ");




        // s1.conversitionFactor = 0.99;
        // It will throw and error becuase value of final cannot be changed
 
 
 // Calling patrameterized constructor
        Scanner sc =  new Scanner(System.in);
        String name = sc.nextLine();
        int rollNumber = sc.nextInt();
        // int n= sc.nextInt();
        
            geter_setter s3 = new geter_setter(name,rollNumber);
  s3.print(); 
        


    
    
    }



}
