public class star_pattern1 {

    public static void pattern(int n){
        int i , j , s;
        for(i=1;i<=n;i++){
            for(s=n;s>i;s--){
                System.out.print("   ");
            }
            for(j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("enter number of rows for pattern : ");
        int n = Integer.parseInt(System.console().readLine());
        pattern(n);
    }    
}

