                                                       Merge Sort Algorithm
Merge sort is a popular sorting algorithm that works by dividing an unsorted list into smaller sub-lists, sorting those sub-lists, and then merging them back together in sorted order.

Here is the algorithm for merge sort:
1. Divide the unsorted list into n sub-lists, each containing one element (a list of one element is considered sorted).
2. Repeatedly merge sub-lists to produce new sorted sub-lists until there is only one sub-list remaining. This will be the sorted list.
3. 
The merge step involves comparing the first element of each sub-list and selecting the smaller element to add to a new list. This process is repeated until one sub-list is empty, at which point the remaining elements in the other sub-list are added to the new list.

Here is the algorithm for merging two sorted sub-lists:
1. Create an empty list to hold the merged sub-lists.
2. Compare the first element of each sub-list.
3. Select the smaller element and add it to the new list.
4. Repeat steps 2-3 until one sub-list is empty.
5. Add the remaining elements of the non-empty sub-list to the new list.

To summarize, merge sort works by recursively dividing an unsorted list into smaller sub-lists, sorting those sub-lists, and then merging them back together in sorted order. It has a worst-case time complexity of O(n log n), making it an efficient sorting algorithm for large datasets.
