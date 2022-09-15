package com.java;

public class Binary {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE + 1);
    }
    /*
If the key is less than the middle element, then we now need to search only in the first half of the array.
If the key is greater than the middle element, then we need to only search in the second half of the array.
And if the key is equal to the middle element in the array, then the search ends.
Finally, if the key is not found in the whole array, then it should return -1. This indicates that the element is not present.
 */
public static int binarySearch(int arr[], int low, int high, int key){
    int mid = (low + high) / 2;
    while (low <= high){
        if(arr[mid] < key){
            low = mid + 1;
        }else if(arr[mid] == key){
            return mid;
        }else{
            high = mid - 1;
        }
        mid = (low + high) / 2;
    }
    if (low > high){
        return -1;
    }
    return -1;
}
}
