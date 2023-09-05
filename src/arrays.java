import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
/*        int[]arr= new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        for(int a:arr){
            System.out.println(a);
        }
        // arr.length --> length of an array

        //Array user input
        int[] arr1= new int[5];
        System.out.println("Enter the "+arr1.length+" elements to enter into array");
        for(int i=0;i<5;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Here is the array");
        for(int a: arr1){
            System.out.println(a);
        }

        //using Arrays.toString to print array
        System.out.println(Arrays.toString(arr1));*/

        //array of objects

       /* String[]str= new String[4];
        for(int i=0; i<str.length;i++){
            str[i]=sc.nextLine();
        }

        System.out.println(Arrays.toString(str));*/

        //Analyzing mutable behaviour of arrays
        //Here if we change the value of arr(copy of num array), the value in num array is also changed.
        int[] num= {1,2,3,4,5};
        int[]arr=num;
        System.out.println("Before modifying arr");
        System.out.println(Arrays.toString(num));
        arr[0]=99;
        System.out.println("After modifying arr");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(num));


    }
}