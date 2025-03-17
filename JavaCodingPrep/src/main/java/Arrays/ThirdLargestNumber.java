package Arrays;


import java.util.Arrays;
import java.util.List;

public class ThirdLargestNumber {


    public static void main(String[] args ) {
        findLargeNumber();
    }



    public static void findLargeNumber(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23);

        int large = numbers.get(0);
        int i=0;
        while(i<numbers.size()){
            if (large < numbers.get(i)){
                large = numbers.get(i);
            }
            i++;
        }
        System.out.println("Largest number  :: "+ large);

    }
}

