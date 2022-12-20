Linear search is also called as sequential search algorithm. It is the simplest searching algorithm. In Linear search, we simply traverse the list completely and match each element of the list with the item whose location is to be found. If the match is found, then the location of the item is returned; otherwise, the algorithm returns NULL.

Time Complexity
Best Case	--> In Linear search, best case occurs when the element we are finding is at the first position of the array. The best-case time complexity of linear search is O(1).
Average Case --> he average case time complexity of linear search is O(n).
Worst Case	--> In Linear search, the worst case occurs when the element we are looking is present at the end of the array. The worst-case in linear search could be when the target element is not present in the given array, and we have to traverse the entire array. The worst-case time complexity of linear search is O(n).

ALGORITHM :-
Linear_Search(a, n, val) // 'a' is the given array, 'n' is the size of given array, 'val' is the value to search  
Step 1: set pos = -1  
Step 2: set i = 1  
Step 3: repeat step 4 while i <= n  
Step 4: if a[i] == val  
set pos = i  
print pos  
go to step 6  
[end of if]  
set ii = i + 1  
[end of loop]  
Step 5: if pos = -1  
print "value is not present in the array "  
[end of if]  
Step 6: exit  

