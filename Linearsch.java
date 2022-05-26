public class Linearsch {
    public static void main (String [] args){
        int [] a = {2,3,4,5,6,0,8};
        int target = 0;
        int key = linearsrch(a, target);
        System.out.println("element is present at index no. " + key);
    }
    static int linearsrch(int[] arr , int target){
        int i;
        for(i = 0;i<arr.length;i++){
            if(arr[i] == target)
            return i;
        }
        return -1;

    }
    
}

