import java.util.Scanner;
public class magicSquare {
    static int [][] magicSqOdd(int[][] arr , int n){
        int data;
        int r = 0;
        int c = n/2;
        int prev_row;
        int prev_col;
        for(data = 1; data <= n*n; data++){
            arr[r][c] = data;
            prev_row = r;
            prev_col = c;
            r = r - 1;
            c = c - 1;
            if(r < 0){
                r = n-1;
            }
            if(c < 0){
                c = n-1;
            }
            if(arr[r][c] != 0){
                r = prev_row + 1;
                c = prev_col;
            }
        }
        return arr;

    }
    static void magicSqEven(int [][] arr , int n){
        int  n1 = n/4;
        int tl = 0 , tr = n-1 , bl = n-1 , br = n-1;
        int i = 0;
        while(i<n){
            
        }
    } 
   public static void main(String[] args) {
    System.out.println("Enter length of magic box : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [][] mgs  = new int[n][n];
    mgs = magicSqOdd(mgs , n);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(" " + mgs[i][j]);
        }
        System.out.println();
    }
   } 
}
