import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decimal_to_binary {
    static void dectobin(int n){
        int [] binary = new int [100];
        int i=0 ;
        while(n>0){
            binary[i] = n%2;
            n=n/2;
            i++;
            
        }
        while(i>0){
            System.out.print(binary[i]);
            i--;
        }
    } 
    public static void main(String[] args) throws IOException {
        System.out.println("enter any decimal number : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        dectobin(a);
    }
}
