
public class binarysrch {
    public static void main(String [] arr){
        int [] a = {0,2,3,4,5,6,8};
        int target = 0;
        int key = binarysch(a, target);
        System.out.println("element is present at index no. " + key);
    }
    static int binarysch(int[] a , int target){
        int start = 0 ;
        int end = a.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(a[mid] > target){
                end = mid -1;
            }
            else if(a[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1 ;

    }
}
