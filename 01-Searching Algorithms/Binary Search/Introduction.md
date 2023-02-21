                                                             Binary Search
Binary search follows the divide and conquer approach in which the list is divided into two halves, and the item is compared with the middle element of the list. If the match is found then, the location of the middle element is returned.
Binary search is the search technique that works efficiently on sorted lists. Hence, to search an element into some list using the binary search technique, we must ensure that the list is sorted.

There are two methods to implement the binary search algorithm -
1. Iterative method
2. Recursive method

ALGORITHM :- Binary_Search(a, lower_bound, upper_bound, val) // 'a' is the given array, 'lower_bound' is the index of the first array element, 'upper_bound' is the index of the last array element, 'val' is the value to search  
Step 1: set beg = lower_bound, end = upper_bound, pos = - 1  
Step 2: repeat steps 3 and 4 while beg <=end  
Step 3: set mid = (beg + end)/2  
Step 4: if a[mid] = val  
set pos = mid  
print pos  
go to step 6  
else if a[mid] > val  
set end = mid - 1  
else  
set beg = mid + 1  
[end of if]  
[end of loop]  
Step 5: if pos = -1  
print "value is not present in the array"  
[end of if]  
Step 6: exit 

TIME COMPLEXITY :-
1. Best Case	O(1)
2. Average Case	O(logn)
3. Worst Case	O(logn)
