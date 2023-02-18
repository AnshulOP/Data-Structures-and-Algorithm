// Q. Find the Ceiling of a number in the array.
// The ceiling function gives the smallest nearest integer that is greater than or equal to the specified value in a number line.
public class Questions {
    public static void main(String[] args) {
        int[] arr = {12,34,241,645,786,853,932,988};
      
        System.out.println(Ceiling(arr, 645);
    }
                           
    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

    // perform binary search until the target is found or the search space is exhausted
    while(start <= end) {
        int mid = start + (end - start)/2;
        // check if the array is rotated, i.e. the right half of the array is at the beginning
        if (arr[start] > arr[end]) {
            // if target is in the left half, discard the left half and search in the right half
            if (target < arr[mid]) {
                start = mid + 1;
            } 
            // if target is in the right half, discard the right half and search in the left half
            else if (target > arr[mid]) {
                end = mid -1;
            } 
            // if target is found, return the index of target
            else {
                return mid;
            }
        } 
        // if array is not rotated, perform normal binary search
        else {
            // if target is in the left half, search in the left half
            if (target < arr[mid]) {
                end = mid - 1;
            } 
            // if target is in the right half, search in the right half
            else if (target > arr[mid]) {
                start = mid + 1;
            } 
            // if target is found, return the index of target
            else {
                return mid;
            }
        }
    }
    // if target is not found, return the smallest element in the array that is greater than the target
    return arr[start];
}
}
