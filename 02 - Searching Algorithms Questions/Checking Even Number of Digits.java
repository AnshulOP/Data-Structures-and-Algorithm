// Q. Given an array of integers, retrun how many of them contain an even number of digits.
public class Questions {
    public static void main(String[] args) {
        int[] arr = {12,34,241,645,786,853,932,988};
      
        System.out.println(findNumbers(arr);
    }    
  
    // finds the number of even-digit numbers in the given integer array
    static int findNumbers(int[] arr) {
        int count = 0;
        for(int num : arr) {
            // checks if the current number has an even number of digits
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    // checks if a given number has an even number of digits
    static boolean even(int num) {
        if(countDigits(num) % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // counts the number of digits in a given number
    static int countDigits(int num) {
        int count = 0;
        while(num > 0  || num < 0) {
            count++;
            num = num/10;
        }
        return count;
    }
