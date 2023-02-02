public class Linear_Search {
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 8, 1, 9};
        int[][] arr2 = {
                        {1, 2, 3}, // 0th index
                        {4, 5}, // 1st index
                        {6, 7, 8, 9} // 2nd index -> 
                    };
        System.out.println(LinearSearch1D(7, arr1);
        System.out.println(LinearSearch2D(arr2, 5);
    }
    // Linear Search on 1 Dimensional Array
    static int LinearSearch1D(int key, int[] arr) {
    // loop through the array
      for (int i = 0; i < arr.length; i++) {
          // check if the current element is equal to the key
          if(arr[i] == key) {
              // return the index of the key if found
             return i;
          }
      }
      // return -1 if key not found in the array
      return -1;
  }

    static int[] LinearSearch2D(int[][] arr, int target) {
      // loop through each row in the array
      for (int row = 0; row < arr.length; row++) {
          // loop through each column in the current row
          for (int col = 0; col < arr[row].length; col++) {
              // check if the current element is equal to the target
              if (arr[row][col] == target) {
                  // return the row and column indices of the target if found
                  return new int[]{row, col};
              }
          }
      }
      // return [-1, -1] if target not found in the array
      return new int[]{-1, -1};
  }
}
