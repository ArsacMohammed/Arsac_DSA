package dsa;
import java.util.Arrays;
public class MergeTwoSortedArray {


    //merge two sorted array with extra spaces

    public static void main (String[] args){
        mergeSortedArrayWithExtraSpaces();
    }


    public static void mergeSortedArrayWithExtraSpaces(){
        int  [] arr1 = {1,3,5,7};
        int  [] arr2 = {0,2,4,6,8};
        int n = arr1.length;
        int m = arr2.length;
        int [] arr = new int[arr1.length+arr2.length];
        int left = 0;
        int right =0;
        int index =0 ;

        while (left <n && right<m){
            if(arr1[left]<=arr2[right]){
                arr[index++] = arr1[left++];
            }else{
                arr[index++]= arr2[right++];
            }
        }

        while (left <n){
            arr[index++]= arr1[left++];
        }

        while (right <m){
            arr[index++]= arr2[right++];
        }


        Arrays.stream(arr).forEach(System.out::print);
        System.out.println(" ");



        for (int i=0;i<arr.length;i++){
            if (i<n){
                arr1[i]=arr[i];
            }else{
                arr2[i - n ]=arr[i];
            }
        }

        Arrays.stream(arr1).forEach(System.out::print);
        System.out.println(" ");
        Arrays.stream(arr2).forEach(System.out::print);
    }
}
