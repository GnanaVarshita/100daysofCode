public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        /*
        Searching in Matrices:
        for(r =0;r<n;r++){
        for(c =0;c<n;c++){
        }
        }

        Worst no.of steps is going to be N*N
        Complexity = O(M*N)

        Matrix is sorted in both row and column wise
         first ignore the columns then eleminate the rows

         Time Complexity is N+N = 2N

         */

        /* Search in a Sorted Matrix
        1.Take middle col and perform binary Search
        2.if target element is lesser than middle element
           2.1 then elements which are below the rows and elements
           after the column are all greater than the target

         3. and vice versa for target element greater than middle
         4. 3rd condition when target == middle


         1. check if the mid col contains target or not

         */
    }
}