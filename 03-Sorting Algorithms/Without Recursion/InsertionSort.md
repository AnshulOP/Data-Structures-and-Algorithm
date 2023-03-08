                                                        Insertion Sort Algorithm
Insertion sort is a simple sorting algorithm that works by building a sorted list one element at a time. It takes each element from the unsorted part of the list and inserts it into the correct position in the sorted part of the list.

Here's how the insertion sort algorithm works:

1. Start with the second element of the list.
2. Compare the second element with the first element. If the second element is smaller than the first, swap them.
3. Move to the third element of the list.
4. Compare the third element with the second element. If the third element is smaller than the second, swap them. If the third element is still smaller than the first, swap it with the first element. Otherwise, leave it in place.
5. Repeat step 4 for each subsequent element of the list until the entire list is sorted.

The time complexity of insertion sort is O(n^2) in the worst case and average case, where n is the number of elements in the list. This is because the algorithm requires two nested loops to traverse the list and compare and shift elements as necessary. In the best case scenario, where the list is already sorted, insertion sort has a time complexity of O(n), as it will only need to make a single pass over the list without shifting any elements.

Despite its simplicity, insertion sort can be more efficient than bubble sort or selection sort, particularly for small or partially sorted lists. Additionally, insertion sort has a relatively small number of comparisons and swaps, making it useful in situations where these operations are expensive, such as with linked lists or when swapping elements requires expensive computations.                                                        
