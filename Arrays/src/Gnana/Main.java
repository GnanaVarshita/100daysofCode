package Gnana;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a = 19;
        Scanner in = new Scanner(System.in);

        //syntax
        //datatype[] variable_name = new datatype[size]

        int[] rnos = new int[5];
        int[] rnos2 ={23,45,67,89};

        int[] ros; // declaration of array
        ros = new int[5]; // actual object is created iin memory or heap
        System.out.println(rnos[1]);

        //what is null keyword
        // null can be assigned to only non primitive
        // a special value what reference values point to
        int[] arr = new int[5];
        /*arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr);*/

        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println(Arrays.toString(arr));

        System.out.println();


    }
}
