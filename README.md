# DSA
Data Structure &amp; Algorithm in Python

# Content

## [1] Different Types

### [1-1] Types of Data Structures

<img width="950" alt="IMG" src="https://user-images.githubusercontent.com/73331241/158809021-70c1957d-a0fb-4337-af40-af869136e25e.png">


### [1-2] Types of Algorithms

> Simple Recursive Algorithms
> 
> Divide and Conquer Algorithms
> 
> Dynamic Programming Algorithms
> 
> Greedy Algorithms
> 
> Brute Force Algorithms
> 
> Randomized Algorithms


## [2] Recursion

> Recursion: A way of solving a problem by having a function calling itself.

> Why Recursion?
> * [1] It helps break down big problems into smaller ones and easier to use.
> * [2] The prominent usage of recursion in data structures like trees and graphs.
> * [3] It is used in many algorithms (divide and conquer, greedy and dynamic programming).

> When to choose recursion?
> * [1] When we can easily breakdown a problem into similar subproblem.
> * [2] When we are fine with extra overhead (both time and space) that comes with it.
> * [3] When we need a quick working solution instead of efficient one.
> * [4] When traverse a tree
> * Design an algorithm to compute n th
> * Write code to list the n ...
> * Implement a method to compute all.
> * Practice

> When to avoid recursion?
> * If time and space complexity matters for us.
> * Recursion uses more memory. It we use embedded memory.
> * Recursion can be slow.

### [2-1] Property of Recursion

> 1. Performing the same operation multiple times with different inputs
> 2. In every step we try smaller inputs to make the problem smaller.
> 3. `Base condition` is needed to stop the recursion, otherwise infinite loop will occur.
> 4. All the recursive algorithms can be implemented through 'iterative solutions'.

### [2-2] How Recursion works?

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159006058-43a3a05e-3c2b-4b54-9f59-90d5b24bf2dc.png">

> 1. A method calls itself
> 2. Exit from infinite loop

### [2-3] Recursive vs Iterative?

<img width="550" alt="IMG" src="https://user-images.githubusercontent.com/73331241/159007306-8b25f583-609b-449b-8e1f-c53d109c774e.png">

`We usually implement in the cases we know that a problem can be divided into similar sub problems.`

### [2-4] `How to write recursion in 3 steps?`

```bash
Step 1: Recursive case - the flow

e.g) n! = n * (n-1)!
=> return n * factorial(n-1)

and use it for a method calls part
```

```bash
Step 2: Base case - the stopping criterion
#1! = 1
```

```bash
Step 3: Unintentional case - the constraint
```

```python
def factorial(n):
    assert n >=0 and int(n) == n, 'The number must be postitive integer only!'
    if n == 1:
        return 1
    else:
        return n* factorial(n-1)

print(factorial(1.5))
```
