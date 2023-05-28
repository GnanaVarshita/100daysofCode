package Gnana;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};

        int[] b ={2,4,5,2,7};

        swap(a,0,3);

        System.out.println(Arrays.toString(a));

        swap2(a,b,5,3);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));



    }

    static void swap(int[] arr, int index1, int index2){

         int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;

    }

    static void swap2(int[] arr1, int[] arr2,int n,int m){
        int temp = arr1[n];
        arr1[n]= arr2[m];
        arr2[m] = temp;
    }
}
