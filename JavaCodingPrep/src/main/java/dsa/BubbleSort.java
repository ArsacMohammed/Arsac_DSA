package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {


    public static void main(String[] args) {
        bubbleSort();
    }

    public static void bubbleSort() {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 4, 3, 3, 2, 2, 1));
        if (numbers.isEmpty()) {
            System.out.println("no entries ...");
        }

        for (int i = 0; i < numbers.size()-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numbers.size() -1- i; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                    swapped = true ;
                }


            }
            if (!swapped)
                break;
        }

        for (int i =0 ;i<numbers.size();i++){
            System.out.print(numbers.get(i) + " " );
        }

    }
}



/*
Worst-case: O(n²)
Best-case: O(n) (if optimized)
Average-case: O(n²)
*/
