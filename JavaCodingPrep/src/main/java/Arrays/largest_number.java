package Arrays;

public class largest_number {
    public static void main(String[] args) {
        int[] arr = {10,6,3,7,4,9};
        int i =0;
        int large =arr[0];
        for ( i=0;i<arr.length-1;i++){
            if (arr[i]>large){
                large =arr[i];    }
        }
        System.out.println(large);

    }
}
