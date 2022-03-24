import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// public class swap {
//     static void swap(float m , float n){
//         float temp;
//         temp = m;
//         m=n;
//         n=temp;
//         System.out.println("The numbers after swapping is " + m + " and " + n);
//     }
//     public static void main(String[] args) {
//         System.out.println("enter two numbers");
//         float num1 = Float.parseFloat(System.console().readLine());
//         float num2 = Float.parseFloat(System.console().readLine());
//         swap(num1 , num2);

//     }

// }

//method 2nd without using third variable

// public class swap{
//     static void swap(int num1 , int num2){
//         num1 = num1-num2;
//         num2=num1+num2;
//         num1=num2-num1;
//         System.out.println("reversed numbers are " + num1 + "and " + num2);
//     }
//     public static void main(String[] args) throws NumberFormatException, IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int a = Integer.parseInt(br.readLine());
//         int b = Integer.parseInt(br.readLine());
//         swap(a , b);
//     }
// }

//method 3rd using operator

public class swap {
    static void swap(int num1, int num2) {
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num2 ^ num1;
        System.out.println("reversed numbers are " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
        sc.close();
            }
    }