import java.util.Scanner;
import java.lang.Math;

public class tcs4 {
    public static void main(String[] args) {
        Double sum = 0.0;
        Scanner sc = new Scanner(System.in);
        int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Enter no. of rooms : ");
        int N = sc.nextInt();
        int a , b =0;
        System.out.println("Enter cost of rooms : ");
        a =sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter total revenue  : ");
        long r = sc.nextLong();
        for(int i=1;i<=12;i++){
            for(int j=1;j<=month[i-1];j++){
                Double p = Math.pow(6-i, 2) + Math.abs(j); 
                sum = sum + (p*Math.min(a , b));
                if(r - sum < 0 ){
                    return;
                }

                

            }
        }
        System.out.println(sum);



    }
}
