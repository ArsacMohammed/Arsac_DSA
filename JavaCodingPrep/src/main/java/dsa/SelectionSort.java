package dsa;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        selectionSort();
    }
    public static void selectionSort(){
        int  [] arr = {2,1,3,7,3,8,4};
        // it all about taking the min value
        for (int i=0;i<arr.length-1;i++){
            int min = i;
            for (int j=i+1;j< arr.length-1;j++){
                if (arr[j] <  arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] =temp;


            }

        for (int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
        }

    }

