// Q. Find the Floor of a number in the array.
// The floor function gives the greatest nearest value that is less than or equal to the specified value. That means the resultant value will be less than the specified value.
public class Questions {
    public static void main(String[] args) {
        int[] arr = {12,34,241,645,786,853,932,988};
      
        System.out.println(Ceiling(arr, 645);
    }
                           
    static int Floor(int[] arr, int target) {
        // Initialize start and end pointers to the beginning and end of the array, respectively.
        int start = 0;
        int end = arr.length-1;

        // Binary search loop to find the target element or the closest smaller element.
        while(start <= end) {

            // Calculate the middle index of the array.
            int mid = start + (end - start)/2;

            // Check if the array is rotated or not.
            if (arr[start] > arr[end]) {

                // If the target is smaller than the middle element, search in the second half of the array.
                if (target < arr[mid]) {
                    start = mid + 1;
                } 
                // If the target is greater than the middle element, search in the first half of the array.
                else if (target > arr[mid]) {
                    end = mid -1;
                } 
                // If the middle element is equal to the target element, return its index.
                else {
                    return mid;
                }
            } 
            // If the array is not rotated.
            else {
                // If the target is smaller than the middle element, search in the first half of the array.
                if (target < arr[mid]) {
                    end = mid - 1;
                } 
                // If the target is greater than the middle element, search in the second half of the array.
                else if (target > arr[mid]) {
                    start = mid + 1;
                } 
                // If the middle element is equal to the target element, return its index.
                else {
                    return mid;
                }
            }
        }
        // If the target element is not found in the array, return the element which is equal to or 
        // immediately smaller than the target element.
        return arr[end];
    }
