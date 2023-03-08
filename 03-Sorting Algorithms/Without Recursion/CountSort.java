public class Sorting {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1}; // Initialize an integer array with some arbitrary values
      
        CyclicSort(arr); // Call the CyclicSort method to sort the array in ascending order
        System.out.println(Arrays.toString(arr)); // Print the sorted array to the console
    }
  
    // This method implements the Cyclic Sort algorithm to sort the given integer array in ascending order
    static void CyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // The correct index where the current element should be placed
            if (arr[i] != arr[correct]) { // If the current element is not at its correct index
                swap(arr, i, correct); // Swap the current element with the element at its correct index
            } else {
                i++; // Move to the next element
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
