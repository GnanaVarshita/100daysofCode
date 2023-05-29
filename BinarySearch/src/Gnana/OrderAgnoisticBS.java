package Gnana;

public class OrderAgnoisticBS {
    public static void main(String[] args) {
        int[] arr1 ={99,76,54,52,32,29,16,11,8,2};
        int target1 = 8;
        int ans1=Agnoisticsearch(arr1,target1);
        System.out.println(ans1);

        int[] arr2 ={1,2,3,4,5,6,7,8,9};
        int target2 = 4;

        int ans2 = Agnoisticsearch(arr2,target2);
        System.out.println(ans2);
    }

    static int Agnoisticsearch(int[] arr, int target){
        int start =0;
        int end =arr.length-1;
        if(arr[end]>arr[start]){
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
        }

        else{
            while(start<= end){
                int mid = start+ (end-start)/2;
                if(arr[mid] ==target){
                    return mid;
                }
                else if (target>arr[mid]) {
                    end = mid-1;
                }
                else{
                    start= mid+1;
                }
            }
        }

        return -1;
    }
}
