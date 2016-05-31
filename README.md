# data-structures-and-algorithms-guide

#####Recursive technique: When and how to use it?
  
One of the techniques of solving programming problem is _divide and conquer method_, divide the problem into sub-problems, sovle the sub-problems and combine the result to get the solution of the original problem. Recursion is such technique based on such principle, where solution of the problem is based on the solution of the smaller instances of the same problem. Most of the languages support recursion by allowing function to call itself. Such technique is the core to functional programming as such technique encourage immutability. 

On other hand, an oppositing technique is iteration, which is core of many imperative languages supported by using structures like for or while. Recursion methods could be slower and also memory hungry compare to iterative method. You can imagine for every function call, it has to allocate the stack for its parameters and variables, which elevate the risk of stack overflow. However, recursion codes are shorter and more elegant. Using few additional techniques, like _lookup table_ or _tail call optimization_, a lots of duplicates recursion can be avoided to improve the performance and memory usages.

In this arcticle I would like to focus on recursion, especially when to use recursion and what should be our thinking mentality to create the mental map.

**When to use recursion**
 * if you have iterative brancing in your solution.
 * if implementing with iteration requires lots of coding and produces lots of mutable variables. 
 * if you need to traverse hierarchical structures, like linkedlist, folder structure, XML document etc.
 
**Who to process**

 Once you are convinced recursion could be better approach, try to break down the problem for the smaller sub-problem; meaning, if input parameter is an integer N or String S, analyze how could the sub-routine be created for N-1 or N-2 or ... 3, 2, 1, 0  so that algorithm remain the same. For instance Factorial problem. If you need to calculate the factorial of N, the algorithm to get factorial of N should be same as N-1 or N-2 or ... . Upto this is easiler part, next come to creating mental model, a control flow in your head how solution of smaller instances can be used to get the solution of the original problem. Exercise this for small set of obvious sub-problems, like try to find factorial of 3 using solution of factorial of 2. By doing so, you should hit the edge cases, we call it base cases and this is very important because without such cases probem will not terminate. So, its important to start your sub-problems as close to such base cases where you the solution is trivial without recursion. For instance. you know factorial of 1 or 0, but what about -1, wait negative number? ya this is edge case but understand the context and scope of our problem domain, can N ever be negative number? if not your solution should handle such exceptions. So, simple mathematical representation for factorial of N is: 
 ```
 Factorial(N) = 1 if N == 0
              = Factorial(N-1) if N > 0
 ```
Here you see the first case is base cases, which you can also call a terminating case and second one is recursive case which should converge towards the terminating cases. 

Sometime, you may need the help of some mutable variables to simplify the solution using recursion, it such as you might want to create an auxiliary function for recursion. So instance, check out the following recursive [solution] for finding if a string has balanced parenthesis:
```scala
def balance(chars: List[Char]): Boolean = {
   def isBalance(chrs:List[Char],currentCount:Int):Boolean={
       if(chrs.isEmpty){
         if(currentCount==0) true else false
       }
       else{
         chrs.head match {
           case '('=> isBalance(chrs.tail, currentCount+1)
           case ')' => {
             if(currentCount<=0) false
             else isBalance(chrs.tail, currentCount-1)
           }
           case _ => isBalance(chrs.tail, currentCount)
         }
         
       }
     }
     isBalance(chars, 0);
  }
  ```
Sometime, based on problem, a solution might have multiple recursive call within the recursion, we call this mutliple recursion. Try to avoid such multiple recursion with single recursion if possible, as multiple recursion require exponential time and space. Checkout out the following example of generating fabonannci series using multiple recursion and single recursion.

_with multple recursion_ time complexity for such recursive solution is O(2<sup>n</sup>)
```java
public static void main(String[] args) {
	  int nth = Integer.parseInt(args[0]);
	  for(int i = 0; i<nth;i++){
		  System.out.print(getFib(i)+" ");		  
	  }
	}

	private static int getFib(int i) {
		if(i==0 || i == 1) {
			return i;
		}
		return getFib(i-1)+getFib(i-2);
	}

```

Let's solve the Same problem using single recursion, as called [corecursion](https://en.wikipedia.org/wiki/Corecursion#Examples)
```



```





* http://stackoverflow.com/questions/3021/what-is-recursion-and-when-should-i-use-it


##### Big O 
* http://bigocheatsheet.com/
* https://rob-bell.net/2009/06/a-beginners-guide-to-big-o-notation/
* http://stackoverflow.com/questions/487258/plain-english-explanation-of-big-o

This is a memo from my learning experience inspired from various sites and blogs, mostly from euler, promgramceek and leetCode.  


String/Array
---

* [__Problem: Reverse an array of n elements to the right.__](https://github.com/bhochhi/data-structures-and-algorithms-guide/blob/master/codes/src/main/java/com/bhochhi/algorithm/stringandarray/ReverseArrayImpl.java)
