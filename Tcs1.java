import java.util.Scanner;
public class Tcs1 {
    public static void main(String[] args) {
        System.out.println("Enter no. of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i , j , p =1 , sum = 0;
        int [] a = new int[n];
        a[0] = 0 ; 
    
        for(i=1;i<n;i++){
            for(j=1;j<=i;j++){
                int len = 0 ;
                sum = sum + 6 + 16*(p-1);
                len = Integer.toString(sum).length();
                // if(len < 5){
                //     while(5-len!=0){
                //         System.out.print(0);
                //         len++;
                //     }
                // }
                System.out.print(String.format("%05d", sum) + " ");
                a[i] = sum;
                p++;
            }
            System.out.println();
        }
    }
}
