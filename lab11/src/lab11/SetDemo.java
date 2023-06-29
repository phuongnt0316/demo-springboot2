package lab11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        int count[]={34,22,10,60,22};
        System.out.println("Original Array: "+ Arrays.toString(count));
        TreeSet sortedSet= new TreeSet<Integer>();
        for (int i = 0; i <count.length; i++) {
            sortedSet.add(count[i]);

        }
        System.out.println("The sorted list is: ");
        System.out.println(sortedSet);
        System.out.println("the First element of the set: "+sortedSet.first().toString());
        System.out.println("the last element of thhe set: "+sortedSet.last());
    }



}
