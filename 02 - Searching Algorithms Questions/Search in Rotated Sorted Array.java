// Q. Search in a Rotated sorted Array.
public class Questions {
    public static void main(String[] args) {
        int[] arr = {19, 25, 29, 32, 3, 7, 9, 14};
      
        System.out.println(rotatedSearch(arr, 9);
    }
                           
    // This method searches for a given target value in a rotated sorted array and returns its index.
    static int rotatedSearch(int[] arr, int target) {
        // First, find the index of the pivot element using the findPivot method.
        int pivot = findPivot(arr);
        if (arr[pivot] == target) { // If the pivot element is the target, return its index.
            return pivot;
        } else if (target >= arr[0]) { // If the target is greater than or equal to the first element of the array,
            // perform a binary search on the left half of the array using binarySearch3 method.
            return BinarySearch(arr, target, 0, pivot - 1);
        }
        // Otherwise, perform a binary search on the right half of the array using binarySearch3 method.
        return BinarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    // This method finds the index of the pivot element in a rotated sorted array.
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end -start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) { // If the middle element is greater than the next element,
                // it means the pivot element is at the middle index.
                return mid;
            } else if (mid == start && mid == end){ // If there's only one element in the array, return its index.
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) { // If the middle element is less than the previous element,
                // it means the pivot element is at the previous index.
                return mid;
            } else if (arr[mid] <= arr[start]) { // If the middle element is less than or equal to the first element,
                // the pivot element is in the left half of the array.
                end = mid - 1;
            } else { // Otherwise, the pivot element is in the right half of the array.
                start = mid + 1;
            }
        }
        // If the pivot element is not found, return -1.
        return -1;
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
