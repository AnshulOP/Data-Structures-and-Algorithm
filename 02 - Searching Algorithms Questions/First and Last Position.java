// Q. Find First and Last Position of Element occuring in the Sorted Array containing duplicate elements.
public class Questions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,3,4,5};
      
        System.out.println(searchRange(arr, 3));
    }
  
    static int[] searchRange(int[] nums , int target) {
         // Initialize the starting and ending index of the target element.
        int[] ans = {-1, -1};

        // Search for the starting index of the target element.
        int start = search(nums, target, true);

        // Search for the ending index of the target element.
        int end = search(nums, target, false);

        // Update the starting and ending index of the target element in the result array.
        ans[0] = start;
        ans[1] = end;

        // Return the result array containing the starting and ending index of the target element.
        return ans;
    }
  
    static int search(int[] nums, int target, boolean findStartIndex) {
        // Initialize the starting index, ending index and result variable to -1.
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        // Binary search loop to find the starting or ending index of the target element.
        while(start <= end) {

            // Calculate the middle index of the array.
            int mid = start + (end - start)/2;

            // If the target element is smaller than the middle element, search in the first half of the array.
            if (target < nums[mid]) {
                end = mid - 1;
            } 
            // If the target element is greater than the middle element, search in the second half of the array.
            else if (target > nums[mid]) {
                start = mid + 1;
            } 
            // If the middle element is equal to the target element, update the result variable and
            // search in the appropriate half of the array depending on the value of findStartIndex.
            else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        // Return the starting or ending index of the target element based on the value of findStartIndex.
        return ans;
    }
}
