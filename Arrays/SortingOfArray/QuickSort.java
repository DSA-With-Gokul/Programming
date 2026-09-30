package SortingOfArray;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,-1,-55,-32,99,28,-23};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] arr,int left,int right){
            if(left<right){
                int x = partition(arr,left,right);
                quicksort(arr,left,x-1);
                quicksort(arr,x+1,right);
            }
        }
    static int partition(int[] arr,int left,int right){
        int i = left-1;
        int j = left;
        while(j<=right){
            if(arr[j] < arr[right]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        i++;
        // j--; its no more used we use right instead of j.

         int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;

        // also do not use bitwise swap cuz swaping 2 same number can lead the values to 0
        // a[i]=a[i]^a[j];
        // a[j]=a[i]^a[j];
        // a[i]=a[i]^a[j];
        
        //   0101   // 5
        // ^ 0101   // 5
        // ------
        //   0000   // 0

        // Generally, XOR swapping can be used when:
        // - Both values are integers.
        // - The two positions are different: i != j.
        return i;
    }
}
