import java.util.Scanner;

public class prime {
    void primeno(int num){
        int i , flag=0;
        for(i=2;i<num;i++){
            if(num%i==0){
                flag = 0;
                break;
            }
            else
            flag=1;
        }
            if(flag==1)
            System.out.println(num + " is a prime number");
            else
            System.out.println(num+ " is not a prime number");
    }
    public static void main(String[] args) {
        int num;
        System.out.println("enter any number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        prime p = new prime();
        p.primeno(num);
       
    }
}
