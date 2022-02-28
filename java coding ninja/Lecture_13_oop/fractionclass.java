package Lecture_13_oop;

public class fractionclass {
   int numerator;
   int denominator;

   public fractionclass(int numerator, int denominator){
    this.numerator= numerator;
    this.denominator= denominator;
    simplify();
}
private void simplify() {
    int gcd = 1;
    int smaller = Math.min(numerator, denominator);
    for (int i = 2; i <=smaller; i++) {
        if (numerator%i==0 && denominator %i==0) {
            gcd=i;
        }
    }
    numerator = numerator /gcd;
    denominator = denominator/gcd;
 
}
public void print() {
    System.out.println(numerator + "/"+ denominator);
}

public void increment(){
    numerator = numerator +denominator;
    simplify();
}

public void add(fractionclass f2) {
    this.numerator = this.numerator*f2.denominator+this.denominator*f2.numerator;
    this.denominator=this.denominator*f2.denominator;
   simplify();
    print();
}




   

public static void main(String[] args) {
    fractionclass f1= new fractionclass(10, 4);
    f1.print();
    // f1.increment();
    f1.print();

    fractionclass f2= new fractionclass(10, 4);
    f1.add(f2);

}
}
 

