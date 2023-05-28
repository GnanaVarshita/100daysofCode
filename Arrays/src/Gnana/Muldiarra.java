package Gnana;

import java.util.Arrays;
import java.util.Scanner;

public class Muldiarra {

     static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
       /* int[][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };*/

        int [][] arr = new int[3][2];
        System.out.println(arr.length);

        for (int row =0;row<arr.length;row++){
            for(int col =0; col<arr[row].length;col++){
                arr[row][col]= in.nextInt();
            }
        }

        for (int row =0;row<arr.length;row++){
            for(int col =0; col<arr[row].length;col++){
                System.out.println(arr[row][col]);
            }


            System.out.println(" ");
        }
        System.out.println(Arrays.toString(arr));

    }
}
