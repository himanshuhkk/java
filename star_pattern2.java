public class star_pattern2 {
    public static void pattern(int n){
        int i , j , s , p , x;
        for(i=1;i<=n;i++){
            p=i;
            for(s=n;s>i;s--){
                System.out.print("  ");
            }
            for(j=0;j<i;j++){
                System.out.print(" " + p);
                p++;
            }
            for(x=p-1;x>i;x--){
                System.out.print(" " + (p-2));
                p--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
