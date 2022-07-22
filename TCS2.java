import java.util.Scanner;

public class TCS2 {
    static String[] oneToNineTeen = {
        "" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine" , "ten" ,
        "eleven" , "twelve" , "thirteen" , "fourteen" , "fifteen" , "sixteen" , "seventeen" , "eighteen" , "nineteen"
    };
    static String[] tens = {
        "" , "" , "twenty" , "thirty" , "forty" , "fifty" , "sixty" , "seventy" , "eighty" , "ninety"
    };
    static String numToChar(int n){
        if (n < 20){
            return oneToNineTeen[n];
        }
        else if(n%10 == 0){
            n = n/10;
            return tens[n];
        }
        else{
            return (tens[(n/10)] + " " + oneToNineTeen[(n%10)]);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter no. of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements : " );
        int i ;
        int sum = 0 ;
        int count = 0 ;
        int [] num = new int[n];
        for(i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }
        String [] str = new String[n];
        for(i=0; i<n; i++){
            str[i] = numToChar(num[i]);
        }
        for(i=0; i<n; i++){
            for(int j=0; j<str[i].length(); j++){
                if (str[i].charAt(j) == 'a' || str[i].charAt(j) == 'e' || str[i].charAt(j) == 'i' || str[i].charAt(j) == 'o' || str[i].charAt(j) == 'u'){
                    sum++;
                }
            }
        }
        System.out.println("No. of vowels : " + sum);
        // for(i=0; i<n-1; i++){
        //     if(sum == (num[i] + num[i+1])){
        //         count++ ;

        //     }
        // }
        for(i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(sum == (num[i] + num[j])){
                    count++;
                }
            }

            }
        System.out.println("No. of pairs : " + count);
    }
}
