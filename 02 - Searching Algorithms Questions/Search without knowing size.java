// Q. Search the element in sorted array without knowing the size of an infinite array.
public class Questions {
    public static void main(String[] args) {
        int[] arr = {12,34,241,645,786,853,932,988};
      
        System.out.println(ans, 853);
    }
         
    static int ans(int[] arr, int target) {
        // Initialize the starting and ending index of the search range.
        int start = 0;
        int end = 1;

        // Increase the size of the search range exponentially until the target element is within the range.
        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }

        // Call the binarySearch function to find the index of the target element within the search range.
        return binarySearch(arr, target, start, end);
    }
                           
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
