import java.util.Scanner;

public class addcomplex {
    double real , imag;
    addcomplex(double r , double i){
        this.real=r;
        this.imag=i;
    }
    public static addcomplex sum(addcomplex c1 , addcomplex c2){
        addcomplex temp = new addcomplex(0,0);
        temp.real = c1.real + c2.real;
        temp.imag = c1.imag + c2.imag;
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addcomplex c1 = new addcomplex(0,0);
        addcomplex c2 = new addcomplex(0,0);
        System.out.println("enter real and imag part of first complex number : ");
        c1.real = sc.nextInt();
        c1.imag = sc.nextInt();
        System.out.println("enter real and imag part of second complex number : ");
        c2.real = sc.nextInt();
        c2.imag = sc.nextInt();
        sc.close();

        addcomplex temp = sum(c1, c2);
        System.out.println("The sum of complex number is " + temp.real + " + " + temp.imag + "i");
    }
}
