import java.util.Scanner;

public class even_or_odd {
    // logic is bitwise or of even number by one increment that number by 1 but for odd number it remains unchanged.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if((num | 1) > num){
            System.out.println("number is even");
        }
        else
        System.out.println("number is odd");
        sc.close();
    }

    //similarly for and (&) , bitwise of odd and 1 is 1 otherwise 0
    //xor (^) increment even by 1 and decrement odd by 1 on bitwise operation of number and 1 . (most optimal method) 
    //every even binary number ends with 0 and odd binary number with 1 . so use Integer.toBinaryString.endsWith("0") means even
    
    
}
