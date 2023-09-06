import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        /*
        int[][]arr= new int[3][3]; // mentioning the size of rows is necessary but mentioning the size of column is not necessary
        int[][]arr1={
                {1,2,3},
                {4,5,6},
                {6,7,8}
        };

        System.out.println(Arrays.toString(arr1[1]));  // output: {4,5,6}
        System.out.println(arr1.length); // give no. of rows

        int[][]arr2={
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };                   // the column size can vary for each array

        // traversing logic for multidimensional arrays
           for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                  arr[row][col]= sc.nextInt();
            }
        }*/

        int[][]arr2= {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        for(int row=0; row<arr2.length; row++){
            for(int col=0; col<arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        };

        for(int[]a:arr2){
            System.out.println(Arrays.toString(a));
        }    // since in multidimensionsal arrays each row represent a individual array

        //We can use arraylist in java which can be used when we dont know the size of the array.



    }
}
