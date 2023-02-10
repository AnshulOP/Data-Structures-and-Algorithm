public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-54,-23,1,23,45,78,89,90,97};
        int[][] arr2 = {
            {23,35,56,68,70},
            {36,47,59,72,76},
            {49,60,69,78,82},
        };
        int target = 78;
      
        System.out.println(binarySearch(arr, target));
        System.out.println(Arrays.toString(binarySearch2D(arr2, target)));
    }

    // function to perform binary search on a 1D array
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        // loop through the array until start <= end
        while(start <= end) {
            int mid = start + (end - start)/2;
            if (arr[start] > arr[end]) { // check for rotation
                // if target is less than mid, search in the left half of the array
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                // if target is greater than mid, search in the right half of the array
                else if (target > arr[mid]) {
                    end = mid -1;
                }
                // if target is equal to mid, return mid
                else {
                    return mid;
                }
            } else {
                // if target is less than mid, search in the left half of the array
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                // if target is greater than mid, search in the right half of the array
                else if (target > arr[mid]) {
                    start = mid + 1;
                }
                // if target is equal to mid, return mid
                else {
                    return mid;
                }
            }
        }
        // if target not found, return -1
        return -1;
    }

    // function to perform binary search on a 2D array
    static int[] binarySearch2D(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length + 1;

        // loop through the 2D array until row < matrix.length and col >= 0
        while (row < matrix.length && col >= 0) {
            // if the target is found, return the row and col indices
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            // if target is less than the current value, move to the next row
            else if (matrix[row][col] < target) {
                row++;
            }
            // if target is greater than the current value, move to the previous col
            else {
                col--;
            }
        }
        // if target not found, return [-1,-1]
        return new int[]{-1,-1};
    }
}
