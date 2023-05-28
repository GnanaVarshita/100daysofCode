package Gnana;

public class Max {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(max(arr));


    }

    static int max(int[] arr){

        if(arr.length==0){
            System.out.println(-1);
        }
        int maxvalue = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxvalue){
                maxvalue = arr[i];
            }
        }

        return maxvalue;

    }
}

