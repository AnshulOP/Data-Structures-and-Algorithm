public class Sorting {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,7,8,2,3,1}; // Initialize an integer array with some arbitrary values
      
        BubbleSort(arr); // Call the BubbleSort method to sort the array in ascending order
        System.out.println(Arrays.toString(arr)); // Print the sorted array to the console
    }
  
    // This method implements the bubble sort algorithm to sort the given integer array in ascending order
    static void BubbleSort(int[] arr) {
        boolean swaped; // A flag to indicate if any swaps were made in the current iteration
        for (int i = 0; i < arr.length; i++) { // Iterate over the array from the first element to the last
            swaped = false; // Reset the swap flag for each iteration
            for (int j = 1; j < arr.length - i; j++) { // Iterate over the array from the second element to the last unsorted element
                if (arr[j] < arr[j-1]) { // If the current element is less than the previous element, swap them
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true; // Set the swap flag to true
                }
            }
            if (!swaped) { // If no swaps were made in the current iteration, the array is already sorted, so we can exit the loop early
                break;
            }
        }
    }
}

