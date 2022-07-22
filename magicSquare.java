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
    static int [][] magicSqEven(int[][] arr , int n){
        int s = n/4 , i , j=0;
        int [] sbox = new int[s*2];
        int [] mbox = new int[n-(s*2)];
        int a = 0;
        int b = n-1;
        
        for(i =0; i<s; i++){
            sbox[j] = a;
            a++;
            j++;
            sbox[j] = b;
            j++;
            b--;
        }
        j=0;
        for(i=s;i<n-s;i++){
            mbox[j] = i;
            j++;
        }
        
        int temp1 , temp2;
        for(i=0; i<sbox.length; i++){
            for(j=0; j<sbox.length; j++){
                temp1 = sbox[i];
                temp2 = sbox[j];
                arr[temp1][temp2] = 1;
            }
        }
        temp1 = 0 ;
        temp2 = 0;
        for(i=0; i<mbox.length; i++){
            for(j=0; j<mbox.length; j++){
                temp1 = mbox[i];
                temp2 = mbox[j];
                arr[temp1][temp2] = 1;
            }
        }
        int number = 1;
        int number2 = n*n;
        for( i=0;i<n;i++){
        for( j=0;j<n;j++){
            if(arr[i][j]==1){
                arr[i][j] = number;
                number++;
            }
            else{
                arr[i][j] = number2;
                number2--;
            }
        }
    }
    return arr;
    
    }
   
   public static void main(String[] args) {
    System.out.println("Enter length of magic box : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [][] mgs  = new int[n][n];
    if((n & 1) == 0){
        mgs = magicSqEven(mgs, n);
    }
    else{
        mgs = magicSqOdd(mgs , n);
    }
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(" " + mgs[i][j]);
        }
        System.out.println();
    }
  

   } 
}
