import java.util.Arrays; 
public class Sorting {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1}; // Initialize an integer array with some arbitrary values
      
        MergeSort(arr); // Call the MergeSort method to sort the array in ascending order
        System.out.println(Arrays.toString(arr)); // Print the sorted array to the console
    }
  
    // MergeSort function
    static int[] MergeSort(int[] arr) {
        // Base case: if the array length is 1, it is already sorted
        if (arr.length == 1) {
            return arr;
        }
        // Find the middle index
        int mid = arr.length/2;

        // Recursively sort the left and right halves of the array
        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the sorted left and right halves
        return merge(left, right);
    }

    // Merge function to combine two sorted arrays into a single sorted array
    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length]; // Create a new array to hold the merged result

        int i = 0; // Index for first array
        int j = 0; // Index for second array
        int k = 0; // Index for merged array

        // While there are still elements in both arrays
        while (i < first.length && j < second.length) {
            // Compare the current element in each array and add the smaller one to the merged array
            if(first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // If there are any remaining elements in the first array, add them to the merged array
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        // If there are any remaining elements in the second array, add them to the merged array
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix; // Return the merged array
    }
}
