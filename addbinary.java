import java.util.Scanner;


public class addbinary {
    public static void main(String[] args) {
        while(true){
        Scanner sc = new Scanner(System.in);
        long b1 , b2;
        int i=0 , carry=0;
        int [] sum = new int [10];
        System.out.println("enter 1st binary number : ");
        b1 = sc.nextLong();
        System.out.println("enter 2nd binary number : ");
        b2 = sc.nextLong();
        while(b1!=0 && b2!=0){
            sum[i++]=(int)((b1%10 + b2%10 + carry)%2);
            carry = (int)((b1%10 + b2%10 + carry)/2);
            b1=b1/10;
            b2=b2/10;
        }
        if(carry!=0)
        sum[i++]=carry;
        --i;
        System.out.println("The sum of given binary no. is : ");
        while(i>=0){
            System.out.print(sum[i--]);
        }
        System.out.println("\nenter 1 for again and 0 for exit");
        int flag = sc.nextInt();
        if(flag==1)
        continue;
        else if(flag==0)
        break;
        sc.close();
    }

    
}
        
    }
       

