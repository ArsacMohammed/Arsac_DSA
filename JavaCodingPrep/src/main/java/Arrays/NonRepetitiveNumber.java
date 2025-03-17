package Arrays;

import java.util.HashSet;
import java.util.Set;

public class NonRepetitiveNumber {


    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 4, 4, 2, 4};
        Set<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < arr.length - 1; i++) {
            numbers.add(arr[i]);
        }
        System.out.println(numbers);
    }
}
