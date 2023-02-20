// Q. Search in the Mountain array.
public class Questions {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,9,7,5,3,1};
      
        System.out.println(searchMountain(arr, 5);
    }
                           
    static int searchMountain(int[] arr, int target) {
        // Find the index of the peak element in the mountain array.
        int peak = peakIndexInMountainArray(arr);

        // Search for the target element in the first half of the array.
        int first = BinarySearch(arr, target, 0, peak);

        // If the target element is found in the first half of the array, return its index.
        if (first != -1) {
            return first;
        }

        // If the target element is not found in the first half of the array, search for it in the second half of the array.
        return BinarySearch(arr, target, peak+1, arr.length-1);
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

    static int BinarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start)/2;
            if (arr[start] > arr[end]) {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid -1;
                } else {
                    return mid;
                }
            } else {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
