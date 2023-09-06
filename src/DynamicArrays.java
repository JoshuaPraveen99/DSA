import java.util.ArrayList;

public class DynamicArrays {
    public  static void main(String[]args){

        //We can use arraylist in java when we don't know the size of the array
        ArrayList<Integer> list= new ArrayList<>(10); // we can't use primitives , we should only use wrapper classes.

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);


        list.set(1,100);
        list.remove(14);
        System.out.println(list);










    }
}
