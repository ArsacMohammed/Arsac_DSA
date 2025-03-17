package Arrays;

// only have to find the first non repetitive number.

public class NoOfRepetiveNumbers {
    public static void main(String[] args) {
        int[] arr ={-1,2,-1,3,2};
        int result = firstNonRepetitiveNumber(arr);
        System.out.println(result);

    }

    private static int firstNonRepetitiveNumber(int[]  arr ) {
        for (int i = 0; i < arr.length; i++) {
            Boolean unique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return arr[i];
            }

        }
        return 0;
    }
}
