import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0, i, n;
        System.out.println("enter no. of inputs : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        for (i = 0; i < n; i++) {
            System.out.print(" " + b);
            c = a + b;
            a = b;
            b = c;
        }
    }
}