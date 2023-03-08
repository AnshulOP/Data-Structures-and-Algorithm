public class Sorting {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1}; // Initialize an integer array with some arbitrary values
      
        SelectionSort(arr); // Call the SelectionSort method to sort the array in ascending order
        System.out.println(Arrays.toString(arr)); // Print the sorted array to the console
    }
  
    // This method implements the selection sort algorithm to sort the given integer array in ascending order
    static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // Iterate over the array from the first element to the last element
            int last = arr.length - i - 1; // Set the last index to the current last element in the unsorted portion of the array
            int max = maxIndex(arr, 0, last); // Find the index of the maximum element in the unsorted portion of the array
            swap(arr, max, last); // Swap the maximum element with the last element in the unsorted portion of the array
        }
    }
    
    // This method finds the index of the maximum element in the given integer array between the start and end indices (inclusive)
    static int maxIndex(int[] arr, int start, int end) {
          int max = start; // Initialize the index of the maximum element to the start index
          for (int i = start; i <= end; i++) { // Iterate over the array from the start index to the end index
              if (arr[max] < arr[i]) { // If the current element is greater than the maximum element, update the index of the maximum element
                  max = i;
              }
          }
          return max; // Return the index of the maximum element
      }
    
    // This method swaps two elements in the given integer array
    static void swap(int[] arr, int first, int second) {
          int temp = arr[first]; // Store the value of the first element in a temporary variable
          arr[first] = arr[second]; // Replace the value of the first element with the value of the second element
          arr[second] = temp; // Replace the value of the second element with the value stored in the temporary variable
      }
}

