public class reversing_array {
    static void reversearray(int arr[] , int first , int last){
        int temp;
        while(first<last){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int  array[]={1,2,3,4,5};
        reversearray(array , 0,4);
        for(int i:array){
            System.out.println(i);
        }
    }
}
