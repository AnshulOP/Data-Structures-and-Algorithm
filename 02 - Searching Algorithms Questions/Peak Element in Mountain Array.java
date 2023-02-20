// Q. Find the peak element in the Mountain array.
// A mountain array is defined as an array that has an element such that all elements before it are in strictly increasing order and all elements after it are in strictly decreasing order.
public class Questions {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,9,7,5,3,1};
      
        System.out.println(peakIndexInMountainArray(arr);
    }
                           
    static int peakIndexInMountainArray(int[] arr) {
        // Initialize the starting and ending indices of the search range.
        int start = 0;
        int end = arr.length - 1;

        // Binary search loop to find the peak index.
        while(start < end) {

            // Calculate the middle index of the search range.
            int mid = start + (end - start)/2;

            // If the element at the middle index is greater than the element at the next index,
            // search in the first half of the search range.
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } 
            // If the element at the middle index is less than or equal to the element at the next index,
            // search in the second half of the search range.
            else {
                start = mid + 1;
            }
        }

        // Return the index of the peak element.
        return start;
    }
}
