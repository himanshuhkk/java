public class tower_of_hanoi {
    public static void toh(int n , char from , char aux , char to){
        if(n==0)
        return;
        toh(n-1, from, to , aux);
        System.out.println("move disk " + n + " from rod " + from + " to " + to);
        toh(n-1 , aux , from , to);
    }
    public static void main(String[] args) {
        System.out.println("enter no. of disks : ");
        int n=Integer.parseInt(System.console().readLine());
        toh(n, 'A', 'B', 'C');
    }
}
