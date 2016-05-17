# data-structures-and-algorithms-guide

#####Recursive technique: When and how to use it?
  
One of the techniques of solving programming problem is _divide and conquer method_, divide the problem into sub-problems, sovle the sub-problems and combine the result to get the solution of the original problem. Recursion is such technique based on such principle, where solution of the problem is based on the solution of the smaller instances of the same problem. Most of the languages support recursion by allowing function to call itself. Such technique is the core to functional programming as such technique encourage immutability. On other hand, an oppositing technique is iteration, which is core of many imperative languages supported by using structures like for or while. In this arcticle I would like to focus on recursion, especially how to think recursive, when to use recursive and how to start.

Recursion methods could be slower and also memory hungry compare to iterative method. You can imagine for every function call, it has to allocate the stack for its parameters and variables, which elevate the risk of stack overflow. However, recursion codes are shorter and more elegant. Using few additional techniques, like _lookup table_ or _tail call optimization_, a lots of duplicates recursion can be avoided to improve the performance and memory usages.





* http://stackoverflow.com/questions/3021/what-is-recursion-and-when-should-i-use-it


##### Big O 
* http://bigocheatsheet.com/
* https://rob-bell.net/2009/06/a-beginners-guide-to-big-o-notation/
* http://stackoverflow.com/questions/487258/plain-english-explanation-of-big-o

This is a memo from my learning experience inspired from various sites and blogs, mostly from euler, promgramceek and leetCode.  


String/Array
---

* [__Problem: Reverse an array of n elements to the right.__](https://github.com/bhochhi/data-structures-and-algorithms-guide/blob/master/codes/src/main/java/com/bhochhi/algorithm/stringandarray/ReverseArrayImpl.java)
