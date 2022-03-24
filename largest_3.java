public class largest_3 {
    static int largest(int a , int b , int c){
        return c>(a>b ? a : b) ? c : (a>b ? a : b);

    }
    public static void main(String[] args) {
        System.out.println(largest(2, 4, 6));
    }
}
