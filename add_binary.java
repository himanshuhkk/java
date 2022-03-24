import java.util.Scanner;

public class add_binary {
    static String addBinary(String x , String y){
        String result = "";
        int d = 0;
        int l1 = x.length()-1 , l2 = y.length()-1;
        while(l1>=0 || l2 >=0 || d==1){
            d+=((l1>=0) ? x.charAt(l1) - '0' : 0);
            d+=((l2>=0) ? x.charAt(l2) - '0' : 0);
            result = (char)(d % 2 + '0') + result;
            d/=2;
            l1--;
            l2--;

        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Enter two binary numbers : ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println( addBinary(s1, s2)); 
        sc.close();
        
    }
}
