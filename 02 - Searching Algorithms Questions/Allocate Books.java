// You are given an array ‘pages’ of integer numbers. In this array, the ‘pages[i]’ represents the number of pages in the ‘i-th’ book. There are ‘m’ number of students, and the task is to allocate all the books to the students. 

//Allocate books in a way such that:
//Each student gets at least one book.
//Each book should be allocated to a student.
// allocation should be in a contiguous manner.
 
// You have to allocate the books to ‘m’ students such that the maximum number of pages assigned to a student is minimum

public class Questions {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
      
        System.out.println(allocateBooks(arr, 4, 2));
    }
  
    // The function takes an array of book pages as input, along with the total number of books (n) and the number of students (m)
   static int allocateBooks(int[] arr, int n, int m) {
      // Initialize start and end points for binary search
      int start = 0;
      int sum = 0;
      for (int i = 0; i < n; i++) {
          sum = sum + arr[i];
      }
      int end = sum; // end is initialized as the sum of all pages in the array
      int ans = -1;

      // Binary search algorithm
      while(start <= end) {
          int mid = start + (end - start)/2; // Calculate the mid point of the array

          // Check if mid is a possible solution
          if(IsPossibleSolution(arr, n, m, mid)) {
              ans = mid;
              end = mid - 1;
          } else {
              start = mid + 1;
          }
      }
      // Return the minimum number of pages that each student should read
      return ans;
  }

  // The function checks if a given value of mid is a possible solution or not
  static boolean IsPossibleSolution(int[] arr, int n, int m, int mid) {
      int studentCount = 1;
      int pageSum = 0;

      // Traverse through the array and calculate the number of students needed to read the books
      for(int i = 0; i < n; i++) {
          if (pageSum + arr[i] <= mid) { // If the sum of pages is less than or equal to mid, add the book to the current student
              pageSum = pageSum + arr[i];
          } else { // If the sum of pages is greater than mid, start a new student and add the book to the new student
              studentCount++;
              if (studentCount > m || arr[i] > mid) { // If the number of students exceeds m or if a book has more pages than mid, return false
                  return false;
              } 
              pageSum = arr[i];
          }
      }
      return true; // If all the books can be assigned to the students, return true
  }
}
