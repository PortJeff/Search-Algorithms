# Linear Vs Binary Search

### Time Complexity ( Big O )

Time complexity is extremely important when it comes to algorithms. Usually, time complexity 
needs to be reduced, because programs with larger datasets will usually take longer times to execute.
The most famous time complexity chart is the Big O chart. Here is the chart:

<p align="center">
    <img width="600px" src="https://cdn-media-1.freecodecamp.org/images/1*KfZYFUT2OKfjekJlCeYvuQ.jpeg" alt="Material Bread logo">
</p>

Here is how the chart actually works. The syntax of the chart uses such: O(n), where O is just the syntax, and n is the number of elements within an array.

### Linear Search

The linear search uses a time complexity of O(n). Since a linear search goes through all elements within an array, the number of elements is the time complexity, because the algorithm iterates through all of the array, hence having O(n). 

### Binary Search

The binary search uses a time complexity of O(log n). So the complexity is log of n. It actually is log2 of n, but it is written as log of n. This is a lot faster than a linear search. With 1 million elements, the worst case scenario of a linear search would be 1 million searches, where a binary search would have 20 searches. That is a HUGE difference. Here is how it works.

A binary search needs to be in order first, unlike linear. It then compares the middle element to the target, if there is no middle, it goes to the lefter side. Through each iteration, it eliminates half of the entire array, until it reaches the actual element. Here is an example:

<p align="center">
    <img width="600px" src="https://mikebuss.com/assets/images/posts/binary-search/BinarySearch.png" alt="Material Bread logo">
</p>

### Conclusion

Binary is way better than linear, but it has to be sorted. Binary uses an O(log n) complexity, and Linear uses a O(n) complexity.
