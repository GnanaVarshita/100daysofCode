package Gnana;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int target = 4;

        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    /* return the index
    return -1 if element does not exists
     */
    static  int binarySearch(int[] arr , int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            //find middle number
            int mid = start+(end -start)/2;
            if(arr[mid] ==target){
                return mid;
            }
            else if (target>arr[mid]) {
                start = mid+1;

            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
}