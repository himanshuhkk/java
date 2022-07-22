import java.util.Scanner;

public class TCS3 {
    static void two56th(int n){
        if(n>=1700 && n<=1917){
            if(n%4 == 0 ){
                System.out.println("12.9." + n );
            }
            else{
                System.out.println("13.9." + n);
            }
        }
        else if(n>1918){
            if(n%400 == 0 || (n%4==0 && n%100!=0)){
                System.out.println("12.9." + n );
            }
            else{
                System.out.println("13.9." + n);
            }
        }
        else if(n == 1918){
            System.out.println("27.9." + n);
        }
        else{
            return;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        two56th(year);
        sc.close();
    }
}
