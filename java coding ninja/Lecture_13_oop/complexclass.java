package Lecture_13_oop;

import java.util.Scanner;

public class complexclass {
  
    int real;
    int complex;
 
    public complexclass(int real, int complex){
     this.real= real;
     this.complex= complex;
}
public void plus(complexclass c2) {
    this.real = this.real+c2.real;
    this.complex=this.complex+c2.complex;

    
}

public void print() {
    System.out.println(real +" + "+ "i" + complex);


}

public void multiply(complexclass c2) {
    int real= this.real * c2.real - this.complex * c2.complex;
		int complex= this.real * c2.complex+ c2.real * this.complex;
this.real= real;
this.complex=complex;

}

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		complexclass c1 = new complexclass(real1, imaginary1);
        complexclass c2 = new complexclass(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return ;
		}
        s.close();
}





}