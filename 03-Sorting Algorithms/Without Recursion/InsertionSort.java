public class Sorting {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1}; // Initialize an integer array with some arbitrary values
      
        InsertionSort(arr); // Call the InsertionSort method to sort the array in ascending order
        System.out.println(Arrays.toString(arr)); // Print the sorted array to the console
    }
  
    // This method implements the insertion sort algorithm to sort the given integer array in ascending order
    static void InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // Iterate over the array from the first element to the second-to-last element
            for (int j = i + 1; j > 0; j--) { // Iterate over the sorted subarray from the i-th element to the first element
                if (arr[j] < arr [j - 1]) { // If the current element is less than the previous element, swap them
                    swap(arr, j, j - 1); // Call the swap method to swap the elements
                } else { // If the current element is greater than or equal to the previous element, break out of the loop
                    break;
                }
            }  
        }
    }
  
    // This method swaps two elements in the given integer array
    static void swap(int[] arr, int first, int second) {
          int temp = arr[first]; // Store the value of the first element in a temporary variable
          arr[first] = arr[second]; // Replace the value of the first element with the value of the second element
          arr[second] = temp; // Replace the value of the second element with the value stored in the temporary variable
      }
}

