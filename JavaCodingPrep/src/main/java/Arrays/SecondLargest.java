package Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {2,6,-9,8,-3,10,-6,9};
        int result = secondLargest(arr);
        System.out.println("Result :: "+ result);
    }

    public static int secondLargest(int[] arr) {

        int large=arr[0];
        int secondLarge=arr[1];
        int temp;
        if (large < secondLarge){
            temp = large;
            large = secondLarge;
            secondLarge = temp;
        }

        for (int i =2;i<arr.length;i++){
            if (large<arr[i]){
                secondLarge=large;
                large=arr[i];
            }else if (secondLarge<arr[i]) {
                secondLarge=arr[i];
            }
        }
        return secondLarge;
    }
}
